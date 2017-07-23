package io.tbal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by donkey on 2017. 7. 23..
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class NormalApplication {

    public static void main(String[] args) {
        SpringApplication.run(NormalApplication.class);
    }

    @GetMapping("/wallet")
    public String getWallet() {
        return "wallet";
    }
}
