package org.kafka.demo.producer;

import lombok.RequiredArgsConstructor;
import org.kafka.demo.model.OrderCreatedEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProducer {

    private final KafkaTemplate<String, OrderCreatedEvent> kafkaTemplate;

    public void send(OrderCreatedEvent event) {
        kafkaTemplate.send("orders-topic", event.orderId(), event);
    }
}