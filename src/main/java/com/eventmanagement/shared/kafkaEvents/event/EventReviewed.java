package com.eventmanagement.shared.kafkaEvents.event;

import com.eventmanagement.shared.kafkaEvents.KafkaEvent;
import com.eventmanagement.shared.types.ReviewDecision;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventReviewed extends KafkaEvent {
    @Override
    public String getTopic() {
        return "event-reviewed-kafka-events";
    }
    private String eventId;
    private ReviewDecision reviewDecision;

}
