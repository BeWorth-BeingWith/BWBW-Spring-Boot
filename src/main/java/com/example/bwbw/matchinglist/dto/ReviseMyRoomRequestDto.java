package com.example.bwbw.matchinglist.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviseMyRoomRequestDto {

    private String shortText;

    private String promiseLocation;

    private int peopleNum;

    private LocalDateTime promiseTime;
}
