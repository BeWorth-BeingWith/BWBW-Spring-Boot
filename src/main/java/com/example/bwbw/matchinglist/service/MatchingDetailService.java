package com.example.bwbw.matchinglist.service;

import com.example.bwbw.entity.RoomEntity;
import com.example.bwbw.exception.RoomNotExistException;
import com.example.bwbw.matchinglist.dto.DetailMatchingPostResponseDto;
import com.example.bwbw.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MatchingDetailService {

    public final RoomRepository roomRepository;

    public DetailMatchingPostResponseDto findByRoomId(Long roomId){
        RoomEntity findRoom = roomRepository.findById(roomId).orElseThrow(RoomNotExistException::new);


        DetailMatchingPostResponseDto matchingRoom = new DetailMatchingPostResponseDto(
                findRoom.getMatchingTime(),
                findRoom.getName(),
                (int)findRoom.getRoomPerson().stream().count(),
                findRoom.getMatchingPersonMax(),
                findRoom.getGender(),
                findRoom.getRestaurant().getName(),
                findRoom.getRoomWriting(),
                findRoom.getRoomPerson().stream().filter(roomPerson -> roomPerson.isOwner()).findFirst().get().getUser().getNickname()
        );

        return matchingRoom;
    }
}
