package com.example.bwbw.matchinglist.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="나의 매칭 방 수정", description = "내가 작성한 기존의 매칭 방의 정보를 수정하는 경우입니다.")
public class ReviseMyRoomResponseDto {

    // Response: 원래 모집글 정보
    @ApiModelProperty(value = "기존의 모집글 정보")
    private WriteNewRoomResponseDto existingMatchingInfo;
}
