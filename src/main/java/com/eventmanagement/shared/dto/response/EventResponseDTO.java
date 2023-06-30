package com.eventmanagement.shared.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class EventResponseDTO {
    String id;
    String userId;
    String title;
    String location;
    Instant datetime;
    Integer capacity;

}
