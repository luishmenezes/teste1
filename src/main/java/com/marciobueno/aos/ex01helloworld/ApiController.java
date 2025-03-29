package com.marciobueno.aos.ex01helloworld;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/info")
public class ApiController {

    @GetMapping
    public Map<String, Object> getInfo() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://api.exchangerate-api.com/v4/latest/USD";

        return restTemplate.getForObject(url, Map.class);
    }

}
