package com.eventmanagement.shared.kafkaEvents.event;

import com.eventmanagement.shared.kafkaEvents.KafkaEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EventDeleted extends KafkaEvent {
    @Override
    public String getTopic() {
        return "event-deleted-kafka-events";
    }
    private String eventId;
}
