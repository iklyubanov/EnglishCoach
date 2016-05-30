package ru.iklyubanov.english_coach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.iklyubanov.english_coach.service.GlosbeDictionaryClient;

@SpringBootApplication
public class Application {

    public static void main(String... args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        GlosbeDictionaryClient client = ctx.getBean(GlosbeDictionaryClient.class);
        //String result = client.testDictionary();
    }
}