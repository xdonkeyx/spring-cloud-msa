package io.tbal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by donkey on 2017. 7. 23..
 */
@RestController
@SpringBootApplication
public class LegacyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegacyApplication.class);
    }

    @GetMapping("/message")
    public String getWallet() {
        return "message";
    }
}
