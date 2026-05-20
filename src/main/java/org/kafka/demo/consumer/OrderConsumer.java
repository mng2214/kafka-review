package org.kafka.demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.kafka.demo.model.OrderCreatedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Slf4j
@Component
public class OrderConsumer {

    @KafkaListener(topics = "orders-topic", groupId = "order-service")
    public void consume(OrderCreatedEvent event) {
        log.info("Received event from Kafka: {}", event);
    }

}