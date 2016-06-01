package ru.iklyubanov.english_coach.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

/**
 * Created by KlyubanovI on 25.05.2016.
 */
@Service
public class GlosbeDictionaryClient {

    public String testDictionary()
    {
        final String uri = "https://glosbe.com/gapi/translate?from=eng&dest=eng&format=json&phrase=pull%20up&pretty=true";
        RestTemplate restTemplate = new RestTemplate()
        def result = restTemplate.getForObject(uri, String.class)
        println result
        result
    }
}
