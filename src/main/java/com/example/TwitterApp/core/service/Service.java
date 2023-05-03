package com.example.TwitterApp.core.service;

import com.example.TwitterApp.core.service.interfaces.IValidator;
import com.example.TwitterApp.core.user.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Service {

    @Value("${datasource.driver-class-name-1:anaaremere}")
    private String dbType;

    private final IValidator validator;

    public Service(IValidator validator) {
        this.validator = validator;
    }

    public void save(User user) {
        if (validator.isValid(user)) {
            System.out.println("User " + user.getFirstName()
                    + " " + user.getLastName() + " saved successfully.");
        } else {
            System.out.println("User you are trying to save contains errors.");
        }
    }

    public String getDbType() {
        return dbType;
    }

}
