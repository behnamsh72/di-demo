package behnam.springframework.didemo;

import behnam.springframework.didemo.controllers.ConstructorInjectedController;
import behnam.springframework.didemo.controllers.MyController;
import behnam.springframework.didemo.controllers.PropertyInjectedController;
import behnam.springframework.didemo.controllers.SetterInjectedController;
import behnam.springframework.didemo.examplebeans.FakeDataSource;
import behnam.springframework.didemo.examplebeans.FakeJmsBroker;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");


        System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        //new for properties
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println("username: " + fakeJmsBroker.getUsername() + " password: " + fakeJmsBroker.getPassword() + " url: " + fakeJmsBroker.getUrl());

    }

}
