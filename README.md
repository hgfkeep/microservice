# spring-cloud-example

## 服务发现

discovery-eureka-server 是 服务发现注册中心服务；开启端口808*；
discovery-eureka-client 是 服务发现中的服务，会注册到注册中心；开启端口809*；
discovery-eureka-service-consumer 是 服务器消费者，使用ribbon实现服务的负载均衡； 开启端口1000*；

