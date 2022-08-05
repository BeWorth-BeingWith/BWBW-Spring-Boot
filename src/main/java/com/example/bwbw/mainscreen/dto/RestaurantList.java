package com.example.bwbw.mainscreen.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@ApiModel(value = "식당 리스트", description = "어떤 특정 식당에 잡혀있는 매칭정보에 대해 들어있습니다")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantList {
    @ApiModelProperty(value = "매칭을 만든 사람", example = "이창훈")
    private String leaderName;    //방판 사람 이름

    @ApiModelProperty(value = "인원수", example = "3명")
    private int peopleNum;    //인원수


    @ApiModelProperty(value = "만나기로한 시간", example = "2022-12-11 12:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;    //만나기로한 시간

    @ApiModelProperty(value = "방 고유값")
    private int serialNum;    //방 고유값


}
