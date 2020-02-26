package behnam.springframework.didemo.controllers;

import behnam.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;
    public String sayHello(){
        return  getGreetingService().sayGreeting();
    }

    public GreetingServiceImpl getGreetingService() {
        return greetingService;
    }
}
