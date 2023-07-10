package com.eventmanagement.shared.kafkaEvents.event;

import com.eventmanagement.shared.kafkaEvents.KafkaEvent;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class EventPublished extends KafkaEvent {
    @Override
    public String getTopic() {
        return "event-published-kafka-events";
    }
    private String id;
    private String title;
    private String text;
    private String location;
    private Instant datetime;
    private Integer capacity;
    private String userId;
}
