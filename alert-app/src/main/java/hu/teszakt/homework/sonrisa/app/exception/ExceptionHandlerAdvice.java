package hu.teszakt.homework.sonrisa.app.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Log4j2
public class ExceptionHandlerAdvice {

    @ExceptionHandler(
            exception = Exception.class,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ProblemDetail handleException(Exception ex) {
        log.error("Exception occured: ", ex);
        return ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }

}
