package domain.springfivebyexample.vo;

import lombok.Data;
import domain.springfivebyexample.model.Role;

@Data
public class UserRequest {

    String identity;

    String name;

    Role role;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
