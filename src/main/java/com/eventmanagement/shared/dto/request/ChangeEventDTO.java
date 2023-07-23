package com.eventmanagement.shared.dto.request;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ChangeEventDTO {
    @NotEmpty()
    private String title;
    @NotEmpty()
    private String text;
    @NotEmpty()
    private String location;
    @FutureOrPresent()
    private Instant datetime;
}
