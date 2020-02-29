package behnam.springframework.didemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


//using primary annotaion if there is more than one bean we used primary key or Qualifier
@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingService {


    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
