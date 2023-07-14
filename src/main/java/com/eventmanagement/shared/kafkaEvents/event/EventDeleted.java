package com.eventmanagement.shared.kafkaEvents.event;

import com.eventmanagement.shared.kafkaEvents.KafkaEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventDeleted extends KafkaEvent {
    public EventDeleted(String eventId) {
        super();
        this.eventId = eventId;
    }

    public EventDeleted() {
        super();
    }

    @Override
    public String getTopic() {
        return "event-deleted-kafka-events";
    }
    private String eventId;
}
