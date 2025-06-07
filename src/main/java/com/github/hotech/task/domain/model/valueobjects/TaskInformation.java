package com.github.hotech.task.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record TaskInformation(
        String name,
        String description
) {
}
