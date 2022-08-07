package com.example.bwbw.mainscreen.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@ApiModel(value = "식당", description = "식당의 위치정보, 이름이 들어있고 해당식당의 잡혀있는 매칭들이 들어있습니다")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HomeRestaurant {
    @ApiModelProperty(value = "위도", example = "37.620170")
    private double latitude;

    @ApiModelProperty(value = "경도", example = "127.061323")
    private double longitude;    //좌표

    @ApiModelProperty(value = "식당이름", example = "작은집")
    private String name;    //식당이름

    @ApiModelProperty(value = "해당식당의 매칭내역")
    List<HomeRestaurantList> homeRestaurantLists;    //식당 리스트

}
