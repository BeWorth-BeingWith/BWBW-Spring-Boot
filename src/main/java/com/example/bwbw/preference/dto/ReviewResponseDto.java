package com.example.bwbw.preference.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "리뷰 정보", description = "매칭한 사람, 식당 이름, 매칭 시간, 리뷰등이 적혀 있습니다.")
public class ReviewResponseDto {

    @ApiModelProperty(value = "매칭 시간")
    private LocalDateTime matchingTime;

    @ApiModelProperty(value = "식당 이름", example = "해찬식당")
    private String restaurantName;

    @ApiModelProperty(value = "매칭한 유저", example = "4")
    private Integer matchingUser;

    @ApiModelProperty(value = "리뷰 내용", example = "식당은 짜고 맛이 없었습니다\n 같이온 맴버들이랑 맛있게 먹었습니다!!")
    private String review;
}
