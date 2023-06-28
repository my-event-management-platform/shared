package com.eventmanagement.shared.kafkaEvents.event;

import com.eventmanagement.shared.kafkaEvents.KafkaEvent;

public class EventReviewed extends KafkaEvent {
    @Override
    public String getEventType() {
        return "EventReviewed";
    }

    @Override
    public String getTopic() {
        return "event-submitted-kafka-events";
    }
}
