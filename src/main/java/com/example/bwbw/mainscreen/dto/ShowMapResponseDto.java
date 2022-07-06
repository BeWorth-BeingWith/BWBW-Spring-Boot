package com.example.bwbw.mainscreen.dto;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@ApiModel(value = "지도,핀 불러오기", description = "지도를 불러오는데 필요한 API입니다 식당들과 해당식당에 잡힌 매칭들이 적혀있습니다")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowMapResponseDto {

    List<Restraunt> restraunts = new ArrayList<Restraunt>();    //식당(안에 식당리스트 클래스도 포함되어있음)
    private String acessToekn;      //access token

}
