package com.github.hotech.accommodation.domain.model.services;

import com.github.hotech.accommodation.domain.model.aggregates.Room;
import com.github.hotech.accommodation.domain.model.commands.CreateRoomCommand;
import com.github.hotech.accommodation.domain.model.commands.DeleteRoomCommand;
import com.github.hotech.accommodation.domain.model.commands.UpdateRoomCommand;

import java.util.Optional;

public interface RoomCommandService {
    Optional<Room> handle(CreateRoomCommand command);
    Optional<Room> handle(UpdateRoomCommand command);
    void handle(DeleteRoomCommand command);
}
