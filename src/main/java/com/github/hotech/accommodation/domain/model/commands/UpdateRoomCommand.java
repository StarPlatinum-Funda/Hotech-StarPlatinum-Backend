package com.github.hotech.accommodation.domain.model.commands;

import java.util.Date;

public record UpdateRoomCommand(Long id, String firstName, String lastName, String type, String state, int roomNumber, Date initialDate, Date finalDate) {
}
