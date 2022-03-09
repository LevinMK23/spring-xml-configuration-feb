package ru.learnUp.feb.beans;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.learnUp.feb.events.MyEventPublisher;

@Slf4j
public class Test implements ApplicationContextAware {

    private ApplicationContext context;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        A a = (A)context.getBean("a");
        a.useBFunction();

        MyEventPublisher publisher = context.getBean(MyEventPublisher.class);
        publisher.publishEvent("Good event");

        Locale locale = Locale.getDefault();
        log.info(locale.getCountry());
        log.info(context.getMessage("hello", new Object[]{"World"}, locale));

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
