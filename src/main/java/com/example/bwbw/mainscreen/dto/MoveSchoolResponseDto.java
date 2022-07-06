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

   @ApiModelProperty(value = "x축", example = "37.619802")
   private double x;

   @ApiModelProperty(value = "y축", example = "127.060891")
   private double y;    //학교 좌표표


}