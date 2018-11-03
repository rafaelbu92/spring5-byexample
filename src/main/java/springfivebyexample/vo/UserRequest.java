package springfivebyexample.vo;

import lombok.Data;
import springfivebyexample.models.Role;

@Data
public class UserRequest {

    String identity;

    String name;

    Role role;

}
