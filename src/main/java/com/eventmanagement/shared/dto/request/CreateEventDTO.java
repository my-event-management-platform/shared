package com.eventmanagement.shared.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.Instant;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Getter
@RequiredArgsConstructor
public class CreateEventDTO {
    @NotEmpty()
    private final String title;
    @NotEmpty()
    private final String text;
    @NotEmpty()
    private final String location;
    @FutureOrPresent()
    private final Instant datetime;
    @Min(1)
    private final Integer capacity;
}
