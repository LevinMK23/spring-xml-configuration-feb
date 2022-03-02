package ru.learnUp.feb;

import java.util.Collection;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        ModelsService service = context.getBean(ModelsService.class);

        Collection<Model> models = service.getModels(1L);
        System.out.println(models);

        HttpClient client = context.getBean(HttpClient.class);

        client.enrichModelWithImagesAndName(Set.of(1L))
                .forEach(System.out::println);
    }
}
