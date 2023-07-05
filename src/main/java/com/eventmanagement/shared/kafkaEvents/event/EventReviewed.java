package com.eventmanagement.shared.kafkaEvents.event;

import com.eventmanagement.shared.kafkaEvents.KafkaEvent;
import com.eventmanagement.shared.types.ReviewDecision;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
public class EventReviewed extends KafkaEvent {
    @Override
    public String getTopic() {
        return "event-submitted-kafka-events";
    }
    private String eventId;
    private ReviewDecision reviewDecision;

}
