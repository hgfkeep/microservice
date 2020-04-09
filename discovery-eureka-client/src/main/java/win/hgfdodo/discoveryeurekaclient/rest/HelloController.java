package win.hgfdodo.discoveryeurekaclient.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class HelloController {
    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "/hello")
    public String hello(@RequestParam(required = false, defaultValue = "") String name) {
        log.debug("Request to hello");
        List<String> strings = client.getServices();
        log.info("services: {}", strings);
        return "Hello, " + name;
    }
}
