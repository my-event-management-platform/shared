package com.eventmanagement.shared.kafkaEvents.event;

import com.eventmanagement.shared.kafkaEvents.KafkaEvent;
import com.eventmanagement.shared.types.ReviewDecision;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
public class EventReviewed extends KafkaEvent {
    public EventReviewed(String eventId, ReviewDecision reviewDecision) {
        super();
        this.eventId = eventId;
        this.reviewDecision = reviewDecision;
    }

    public EventReviewed() {
        super();
    }

    @Override
    public String getTopic() {
        return "event-reviewed-kafka-events";
    }
    private String eventId;
    private ReviewDecision reviewDecision;

}
