package behnam.springframework.didemo;

import behnam.springframework.didemo.controllers.MyController;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        myController.hello();

    }

}
