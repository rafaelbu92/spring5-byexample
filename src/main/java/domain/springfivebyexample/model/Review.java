package domain.springfivebyexample.model;

import lombok.Data;


@Data
public class Review {

    String userId;

    String status;

    public Review(){

    }

    public Review(String userId, String status) {
        this.userId = userId;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}