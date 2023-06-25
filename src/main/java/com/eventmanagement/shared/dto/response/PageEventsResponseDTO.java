package com.eventmanagement.shared.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class PageEventsResponseDTO {
    List<EventResponseDTO> events;
    int currentPage;
    int totalItems;
    int totalPages;
}
