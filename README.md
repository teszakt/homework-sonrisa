# homework-sonrisa
Home assessment for Sonrisa

PLANNING STEPS
--------------
1. Understand requirements and assumptions
2. Project setup
3. Domain model
4. REST API
5. Notification abstraction (strategy)
6. Simple admin endpoints
7. Tests
8. README and architecture diagram

PROJECT SETUP
-------------
Define each of the modules and the structure of the project. Like: 
parent.pom (containing common libs with their defined versions for simplicity)
alert-api-def (API definitions for future OpenAPI api.yaml -> future java class generation)
alert-model (h2 db (or any other), entities, repositories)
alert-service (business logic, notifications, mappers for entity and dto, custom exceptions)
alert-app (runnable application, REST controllers, global exception handling, application.yml)

Firstly, I initialize the modules with the essential dependencies. Then I can populate them later with Java classes/implementation.
API first approach (create model/endpoint then implement the business logic)
application.yml
log4j2
domain model
business logic

ASSUMPTIONS
-----------
Alerts are user defined.
One alert can notify through multiple channels.
Admin can view alerts and delivery history.
Authentication is out of scope.
Event generation is simulated.
Retry policy is omitted due to time.

DOMAIN MODEL
------------
using H2 database for simplicity
User
Alert
WorldEvent
Notification
NotificationChannel

REST API
--------
RestController
contentType - application/json
RequestBody, ResponseBody and optional PathVariables/QueryParams
APIs and its model later can be generated from OpenAPI api.yaml file (openapi-generator-maven-plugin)

POST /user
POST /alert
POST /event

GET /alert
DELETE /alert
GET /admin/notification

NOTIFICATION ABSTRACTION
------------------------
abstract notification for future extension
channels [EMAIL, SLACK]
other channels (later like SMS, Teams, etc)

NotificationSender (abtract)
send() abstract method
EmailNotificationSender
SlackNotificationSender

NotificationDispatcher
for alers in alert.channels
find sender
then sender.send()

WordEventDetected
then
AlertMatchingService (evaluates incoming WorldEvent based on existing Alerts)
NotificationRequested
then
NotificationDispatcher

SIMPLE ADMIN ENDPOINTS
----------------------
Endpoints that necessary for display and user interaction.
Another RestController
contentType - application/json
ResponseBody (RequestBody or PathVariables/QueryParams for filtering - e.g. use, world event type)

GET /admin/alerts
GETE /admin/alert/{id}
GET /admin/notifications
GET /admin/users
GET /admin/user/{id}

Authentication can be implemented later (for admin purpose). 

TESTS
-----
JUnit tests (unit tests, integration tests)
By using Mockito.

Controller tests (MockMvc)
Service tests (Mockito)
Repository tests

----------
AI PROMPTS
----------
I used ChatGPT.

-what do you think about that AI task as home assessment? What's your suggestion? "We want users to be able to set up alerts so they get notified when something important happens in the world — like breaking news, market movements, natural disasters, that kind of thing. Should work for both email and Slack. Make it flexible enough that we can add more channels later. We need an admin view too."
-
-
-


TECHNOLOGY
----------
Java 21
SpringBoot 3.5.x
H2 database for simplicity