package com.example.bwbw.matchinglist.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="식당", description = "식당의 좌표(위도, 경도), 식당 이름, 해당 식당의 모집 중인 매칭들에 대한 정보")
public class MatchingListRestaurant {

    @ApiModelProperty(value = "해당 식당의 모집 중인 매칭")
    List<MatchingListRestaurantList> restaurantRecruit;

    @ApiModelProperty(value = "위도", example = "37.619790550578124")
    private Double latitude;

    @ApiModelProperty(value = "경도", example = "127.060880797524")
    private Double longitude;

    @ApiModelProperty(value = "식당 이름", example = "작은집")
    private String restauarantName;
}
