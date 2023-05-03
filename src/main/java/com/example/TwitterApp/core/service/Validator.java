package com.example.TwitterApp.core.service;

import com.example.TwitterApp.core.service.interfaces.IValidator;
import com.example.TwitterApp.core.user.User;

public class Validator implements IValidator {

    private  String bannedName;
    private  String bannedSurname;

    public Validator(String bannedName, String bannedSurname) {
        this.bannedName = bannedName;
        this.bannedSurname = bannedSurname;
    }

    public Validator() {

    }

    public boolean isValid(User user) {
        if (user == null) {
            return false;
        }

        if (user.getFirstName().isEmpty() || user.getLastName().isEmpty()) {
            return false;
        }

        return !user.getFirstName().equals(bannedName) || !user.getLastName().equals(bannedSurname);
    }

}

