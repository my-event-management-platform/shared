package com.eventmanagement.shared.kafkaEvents.event;

import com.eventmanagement.shared.dto.request.EventDTO;
import com.eventmanagement.shared.kafkaEvents.KafkaEvent;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class EventSubmitted extends KafkaEvent {
    public EventSubmitted(EventDTO eventDTO) {
        this.timestamp = Instant.now();
        this.event = eventDTO;
    }
    @Override
    public String getTopic() {
        return "event-submitted-kafka-events";
    }
    private EventDTO event;
}
