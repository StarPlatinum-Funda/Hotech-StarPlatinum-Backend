package com.github.hotech.communications.domain.model.queries;

public record GetAllMessagesBySenderIdAndReceiverIdQuery(
        Long senderId,
        Long receiverId
) {
}
