package com.eventmanagement.shared.kafkaEvents;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public abstract class KafkaEvent {
    protected Instant timestamp;
    public abstract String getTopic();

}
