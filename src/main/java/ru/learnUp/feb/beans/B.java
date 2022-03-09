package ru.learnUp.feb.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

@Slf4j
public class B {

    private final String tag;

    private int version;

    public B(
            // @Value("${my.custom.field}")
            String tag
    ) {
        this.tag = tag;
        log.info(tag);
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void print() {
        log.info("Hello " + tag + " " + version);
    }

}
