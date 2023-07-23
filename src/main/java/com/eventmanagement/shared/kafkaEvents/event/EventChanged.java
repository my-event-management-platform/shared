package com.eventmanagement.shared.kafkaEvents.event;

import com.eventmanagement.shared.kafkaEvents.KafkaEvent;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class EventChanged extends KafkaEvent {
    public String getTopic() {
        return "event-changed-kafka-events";
    }
    private String id;
    private String title;
    private String text;
    private String location;
    private Instant datetime;
}
