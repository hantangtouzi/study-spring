package com.hantangtouzi.mvcform.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author WilliamChang.
 * Created on 2018/7/10 16:54
 */

public class User {
    private String username;
    private String firstname;
    private String password;

    @NotNull
    @Size(min = 3, max = 10)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull
    @Size(min = 5, max = 8)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @NotNull
    //@Size(min = 4, max = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
