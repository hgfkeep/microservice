package win.hgfdodo.discoveryeurekaserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@Slf4j
public class DiscoveryEurekaServerApplication {

    public static void main(String[] args) {
        log.info("Hello world!");
        SpringApplication.run(DiscoveryEurekaServerApplication.class, args);
    }

}
