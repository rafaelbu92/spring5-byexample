package domain.springfivebyexample.model;

import lombok.Data;

@Data
public class User {

    String id;

    String identity;

    String name;

    Role role;

    public User(){

    }

    public User(String id, String identity, String name, Role role) {
        this.id = id;
        this.identity = identity;
        this.name = name;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
