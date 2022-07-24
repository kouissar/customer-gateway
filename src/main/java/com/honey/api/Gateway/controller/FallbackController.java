package com.honey.api.Gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

public class FallbackController {
    @RequestMapping("/orderFallback")
    public Mono<String> orderServiceFallBack(){
        return Mono.just("Order Service is taking too long to respond. Please try again later");
    }
    @RequestMapping("/paymentFallback")
    public Mono<String> paymentServiceFallBack(){
        return Mono.just("Order Service is taking too long to respond. Please try again later");
    }
}
