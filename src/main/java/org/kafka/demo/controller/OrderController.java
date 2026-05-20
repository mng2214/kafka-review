package org.kafka.demo.controller;

import lombok.RequiredArgsConstructor;
import org.kafka.demo.model.OrderCreatedEvent;
import org.kafka.demo.producer.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderProducer producer;

    @PostMapping
    public String createOrder(@RequestBody OrderCreatedEvent event) {
        producer.send(event);
        return "Event sent to Kafka";
    }
}