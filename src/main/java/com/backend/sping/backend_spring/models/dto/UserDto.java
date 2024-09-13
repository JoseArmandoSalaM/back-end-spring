package com.backend.sping.backend_spring.models.dto;

//import com.backend.sping.backend_spring.models.User;

public class UserDto {
    private String title;
    private String user;
    private String lastname;

    // private User user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Como una relacion
    // public User getUser() {
    // return user;
    // }

    // public void setUser(User user) {
    // this.user = user;
    // }
}
