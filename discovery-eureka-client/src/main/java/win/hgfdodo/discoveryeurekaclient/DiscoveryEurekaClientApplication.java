package win.hgfdodo.discoveryeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DiscoveryEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryEurekaClientApplication.class, args);
    }

}
