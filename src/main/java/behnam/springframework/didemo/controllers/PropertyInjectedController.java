package behnam.springframework.didemo.controllers;

import behnam.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;
    String sayHello(){
        return  getGreetingService().sayGreeting();
    }

    public GreetingServiceImpl getGreetingService() {
        return greetingService;
    }
}
