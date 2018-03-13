package com.example.android.firebasesample.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by cserrao on 13/03/2018.
 */

@IgnoreExtraProperties
public class User {
    public String name;
    public String email;
    public String telefone;

    public User() {

    }

    public User(String name, String email, String telefone) {
        this.name = name;
        this.email = email;
        this.telefone = telefone;
    }
}
