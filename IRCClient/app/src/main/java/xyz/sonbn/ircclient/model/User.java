package xyz.sonbn.ircclient.model;

import io.realm.RealmObject;

/**
 * Created by sonbn on 10/30/2017.
 */

public class User extends RealmObject {
    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
