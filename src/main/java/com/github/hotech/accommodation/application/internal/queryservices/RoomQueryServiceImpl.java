package com.github.hotech.accommodation.application.internal.queryservices;

import com.github.hotech.accommodation.domain.model.aggregates.Room;
import com.github.hotech.accommodation.domain.model.queries.GetAllRoomsQuery;
import com.github.hotech.accommodation.domain.model.queries.GetRoomByIdQuery;
import com.github.hotech.accommodation.domain.model.queries.GetRoomByTypeQuery;
import com.github.hotech.accommodation.domain.model.services.RoomQueryService;
import com.github.hotech.accommodation.domain.model.valueobjects.RoomType;
import com.github.hotech.accommodation.infrastructure.persistence.jpa.repositories.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomQueryServiceImpl implements RoomQueryService {
    private final RoomRepository roomRepository;

    public RoomQueryServiceImpl(RoomRepository roomRepository){
        this.roomRepository=roomRepository;
    }

    @Override
    public Optional<Room> handle(GetRoomByIdQuery query){
        return roomRepository.findById(query.id());
    }

    @Override
    public Optional<Room> handle(GetRoomByTypeQuery query){
        var enumOption = RoomType.valueOf(query.roomType());
        return roomRepository.findByType(enumOption);
    }

    @Override
    public List<Room> handle(GetAllRoomsQuery query){
        return roomRepository.findAll();
    }
}
