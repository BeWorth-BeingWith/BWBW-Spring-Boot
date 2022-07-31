package com.example.bwbw.matchinglist.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeleteMyRoomRequestDto {

    private Long roomId; // 방 ID
}
