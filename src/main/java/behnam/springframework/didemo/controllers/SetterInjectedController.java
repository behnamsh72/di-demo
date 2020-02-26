package behnam.springframework.didemo.controllers;

import behnam.springframework.didemo.services.GreetingService;
import behnam.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }
}
