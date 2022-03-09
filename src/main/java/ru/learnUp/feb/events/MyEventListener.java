package ru.learnUp.feb.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

@Slf4j
public class MyEventListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info("Event (timestamp: {}, data: {})", event.getTimestamp(), event.getData());
    }
}
