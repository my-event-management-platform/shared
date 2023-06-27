package com.eventmanagement.shared.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.Instant;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import lombok.Setter;

@Getter
@Setter
public class EventDTO {
    @NotEmpty()
    private String title;
    @NotEmpty()
    private String text;
    @NotEmpty()
    private String location;
    @FutureOrPresent()
    private Instant datetime;
    @Min(1)
    private Integer capacity;
}
