package com.github.hotech.communications.interfaces.rest.tranforms;

import com.github.hotech.communications.domain.model.command.CreateMessageCommand;
import com.github.hotech.communications.interfaces.rest.resource.CreateMessageResource;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CreateMessageCommandFromResourceAssembler {

    public CreateMessageCommand toCommandFromResource(CreateMessageResource resource) {
        return new CreateMessageCommand(
                resource.senderEmail(),
                resource.receiverEmail(),
                resource.content()
        );
    }
}
