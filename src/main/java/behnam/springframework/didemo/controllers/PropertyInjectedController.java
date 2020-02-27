package behnam.springframework.didemo.controllers;

import behnam.springframework.didemo.services.GreetingService;
import behnam.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    //we are using type of service not interface so we don't need to use qualifier annotaion
/*
    @Autowired
    public GreetingService greetingService;
    */


    //  we used to bean implementation name to specify the name of the greetingServiceImpl
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }

}
