package com.eventmanagement.shared.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingResponseDTO {
    private String id;
    private String userId;
    private String eventId;
    private Integer persons;
}
