package com.eventmanagement.shared.kafkaEvents.event;

import com.eventmanagement.shared.kafkaEvents.KafkaEvent;
import com.eventmanagement.shared.types.ReviewDecision;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class EventReviewed extends KafkaEvent {

    public EventReviewed(String eventId) {
        this.eventId = eventId;
        this.timestamp = Instant.now();
    }
    @Override
    public String getTopic() {
        return "event-submitted-kafka-events";
    }
    private String eventId;
    private ReviewDecision reviewDecision;

}
