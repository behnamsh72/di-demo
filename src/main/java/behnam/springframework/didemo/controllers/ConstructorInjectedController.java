package behnam.springframework.didemo.controllers;

import behnam.springframework.didemo.services.GreetingService;

public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    String sayHello(){
        return greetingService.sayGreeting();
    }
}
