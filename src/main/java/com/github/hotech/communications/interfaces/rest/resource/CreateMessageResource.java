package com.github.hotech.communications.interfaces.rest.resource;

public record CreateMessageResource(
        String senderEmail,
        String receiverEmail,
        String content
) {
}
