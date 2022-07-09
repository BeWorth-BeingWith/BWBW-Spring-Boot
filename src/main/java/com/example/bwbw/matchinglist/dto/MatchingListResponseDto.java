package com.example.bwbw.matchinglist.dto;

import io.swagger.annotations.ApiModel;
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
@ApiModel(value="전체 매칭 리스트", description = "모집 중인 모든 매칭들을 확인할 수 있는 리스트입니다.")
public class MatchingListResponseDto { // 모집공고 리스트 들어왔을 때 Reponse

    List<Restaurant> restaurants = new ArrayList<Restaurant>();
}
