package behnam.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("I 'm  in the lifeCycleBean constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The lifecycle has its properties set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("The lifecycle has been terminated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("My bean name is " + name);
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory has been set");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("The post construct annotated method has been called");
    }

    public void preDestroy() {
        System.out.println("The Predestroy annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("Before Init - called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("After Init- called by Bean Post Processor");
    }
}