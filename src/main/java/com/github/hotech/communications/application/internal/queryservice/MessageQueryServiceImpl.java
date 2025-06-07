package com.github.hotech.communications.application.internal.queryservice;

import com.github.hotech.communications.domain.model.aggregates.Message;
import com.github.hotech.communications.domain.model.queries.GetAllMessagesBySenderIdAndReceiverIdQuery;
import com.github.hotech.communications.domain.model.queries.GetAllReceiversBySenderIdQuery;
import com.github.hotech.communications.domain.model.queries.GetMessageByIdQuery;
import com.github.hotech.communications.domain.model.valueobjects.ProfileIdentifier;
import com.github.hotech.communications.domain.services.MessageQueryService;
import com.github.hotech.communications.infrastructure.persistence.jpa.repositories.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MessageQueryServiceImpl implements MessageQueryService {

    private final MessageRepository messageRepository;

    @Override
    public Optional<Message> handle(GetMessageByIdQuery query) {
        return messageRepository.findById(query.id());
    }

    @Override
    public List<Message> handle(GetAllMessagesBySenderIdAndReceiverIdQuery query) {
        return messageRepository.getAllBySenderAndReceiver(new ProfileIdentifier(query.senderId()), new ProfileIdentifier(query.receiverId()));
    }

    @Override
    public List<Long> handle(GetAllReceiversBySenderIdQuery query) {
        return messageRepository.findAllReceiversBySenderId(new ProfileIdentifier(query.senderId()));
    }
}
