package com.example.bwbw.mainscreen.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel(value = "학교 좌표", description = "학교의 위치정보가 들어있습니다")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MoveSchoolResponseDto {

   @ApiModelProperty(value = "위도", example = "37.619802")
   private double latitude;

   @ApiModelProperty(value = "경도", example = "127.060891")
   private double longitude;    //학교 좌표표

}