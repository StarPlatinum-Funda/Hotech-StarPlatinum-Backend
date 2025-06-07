package com.github.hotech.accommodation.interfaces.rest.transform;

import com.github.hotech.accommodation.domain.model.aggregates.Room;
import com.github.hotech.accommodation.interfaces.rest.resources.RoomResource;

public class RoomResourceFromEntityAssembler {
    public static RoomResource toResourceFromEntity(Room entity){
        return new RoomResource(entity.getId(), entity.getGuestFullName(), entity.getType(), entity.getStatus(), entity.getRoomNumber(), entity.getReservationDate());
    }
}
