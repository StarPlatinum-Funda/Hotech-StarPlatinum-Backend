package com.github.hotech.inventory.interfaces.rest.transform;

import com.github.hotech.inventory.domain.model.commands.CreateItemsCommand;
import com.github.hotech.inventory.interfaces.rest.resources.CreateInventoryResource;

public class CreateInventoryCommandFromResourceAssembler {
    public static CreateItemsCommand toCommandFromResource(CreateInventoryResource resource){
        return new CreateItemsCommand(resource.productTitle(), resource.productDescription(), resource.Quantity(), resource.Brand());
    }
}
