package com.example.bwbw.matchinglist.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="식당 리스트", description = "특정 식당의 모집 중인 매칭들에 대한 정보 / 방장 닉네임, 모집 인원수, 약속 시간, 방 고유값")
public class MatchingListRestaurantList {

    @ApiModelProperty(value = "방장 닉네임", example = "해찬갓")
    private String roomLeaderNick;

    @ApiModelProperty(value = "모집 인원수", example = "4")
    private Integer peopleNumber;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "약속 시간", example = "2023-04-02 02:31:55")
    private LocalDateTime promiseTime;

    @ApiModelProperty(value = "방 고유값")
    private Long roomId;
}
