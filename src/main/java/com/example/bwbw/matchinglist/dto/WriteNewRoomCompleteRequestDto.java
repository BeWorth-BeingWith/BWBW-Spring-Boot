package com.example.bwbw.matchinglist.dto;

import io.swagger.annotations.ApiImplicitParam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WriteNewRoomCompleteRequestDto {

    private String roomLeaderNick;

    private String shortText;

    private Long roomId;
}
