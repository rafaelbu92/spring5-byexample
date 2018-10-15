package springfivebyexample.cms.vo;

import lombok.Data;
import springfivebyexample.cms.models.Role;

@Data
public class UserRequest {

    String identity;

    String name;

    Role role;

}
