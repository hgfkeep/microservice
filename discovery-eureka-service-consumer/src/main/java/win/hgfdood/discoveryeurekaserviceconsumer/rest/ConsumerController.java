package win.hgfdood.discoveryeurekaserviceconsumer.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ConsumerController {
    private final RestTemplate restTemplate;

    /**
     * 自动注入支持负载均衡的restTemplate bean
     *
     * @param restTemplate
     */
    public ConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/consume")
    public String helloService(@RequestParam(required = false, defaultValue = "") String name) {
        log.debug("Request to hello service, name={}", name);
        /**
         * 通过服务名，自动请求对应的服务
         */
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello?name="+name, String.class).getBody();
    }
}
