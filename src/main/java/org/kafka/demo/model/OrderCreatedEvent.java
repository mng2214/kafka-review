package org.kafka.demo.model;

public record OrderCreatedEvent(
        String orderId,
        String customerEmail,
        Double amount
) {}