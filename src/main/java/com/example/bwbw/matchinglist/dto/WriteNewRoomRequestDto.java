package com.example.bwbw.matchinglist.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WriteNewRoomRequestDto { // 방 만들기 작성 처음 들어 갔을 때 Request

    private String shortText; // 짧은 모집글 (100자 제한)

    private String promiseLocation; // 약속 장소

    private Integer peopleNumber; // 모집 인원 수

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime promiseTime; // 약속 시간
}
