package com.eventmanagement.shared.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageBookingsResponseDTO {
    List<BookingResponseDTO> bookings;
    int currentPage;
    int totalItems;
    int totalPages;
}
