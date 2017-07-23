package io.tbal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by donkey on 2017. 7. 23..
 */
@RestController
public class WalletController {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    @GetMapping("/wallet")
    public String get() {
        return restTemplate.getForEntity("http://normal/wallet", String.class).getBody();
    }
}
