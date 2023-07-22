package com.eventmanagement.shared.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingDTO {
    @NotEmpty
    private String eventId;
    @Min(1)
    private Integer persons;
}
