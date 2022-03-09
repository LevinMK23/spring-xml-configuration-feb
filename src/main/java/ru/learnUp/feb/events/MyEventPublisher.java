package ru.learnUp.feb.events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyEventPublisher implements ApplicationContextAware {

    private ApplicationContext context;

    public void publishEvent(String eventData) {
        context.publishEvent(new MyEvent(eventData));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
