package com.example.TwitterApp.core;

import com.example.TwitterApp.core.config.ApplicationConfig;
import com.example.TwitterApp.core.user.User;
import com.example.TwitterApp.core.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Service service = applicationContext.getBean(Service.class);
        User myUser = new User("HelenaJullia","Helena", "Pastore","helena@yahoo.com","parola");

        service.save(myUser);

        System.out.println(service.getDbType());
        System.out.println("ok");
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!!!!!";
    }

}

