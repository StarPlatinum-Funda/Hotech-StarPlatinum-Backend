package com.github.hotech.communications.domain.services;

import com.github.hotech.communications.domain.model.aggregates.Message;
import com.github.hotech.communications.domain.model.queries.GetAllMessagesBySenderIdAndReceiverIdQuery;
import com.github.hotech.communications.domain.model.queries.GetAllReceiversBySenderIdQuery;
import com.github.hotech.communications.domain.model.queries.GetMessageByIdQuery;

import java.util.List;
import java.util.Optional;

/**
 * Created by Alex Avila Asto - A.K.A (Ryzeon)
 * Project: inncontrol-backend
 * Date: 5/29/24 @ 12:39
 */
public interface MessageQueryService {


    Optional<Message> handle(GetMessageByIdQuery query);

    List<Message> handle(GetAllMessagesBySenderIdAndReceiverIdQuery query);

    List<Long> handle(GetAllReceiversBySenderIdQuery query);
}
