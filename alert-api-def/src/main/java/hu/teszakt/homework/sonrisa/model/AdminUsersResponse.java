package hu.teszakt.homework.sonrisa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class AdminUsersResponse implements Serializable {

    private List<User> users = new ArrayList<>();

}
