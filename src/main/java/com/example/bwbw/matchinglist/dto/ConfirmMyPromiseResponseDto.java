package com.example.bwbw.matchinglist.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="나의 확정된 매칭 확인", description = "현재 나의 확정된 매칭 정보를 확인할 수 있습니다.")
public class ConfirmMyPromiseResponseDto {

    @ApiModelProperty(value = "나의 확정된 매칭에 대한 정보")
    List<MatchingListRestaurant> restaurants = new ArrayList<MatchingListRestaurant>();
}
