package ru.learnUp.feb.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
public class A implements InitializingBean, DisposableBean {

    private final B b;

    public A(B b) {
        this.b = b;
        log.info("A created");
    }

    public void useBFunction() {
        b.print();
    }

    // @PostConstruct
    private void initMe() {
        log.info("InitMe function used");
    }

    private void destroyMe() {
        log.info("My bean was destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // initMe();
    }

    @Override
    public void destroy() throws Exception {
        // destroyMe();
    }
}
