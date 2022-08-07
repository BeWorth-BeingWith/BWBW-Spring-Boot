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
@ApiModel(value="전체 매칭 리스트", description = "모집 중인 모든 매칭들을 확인할 수 있는 리스트입니다.")
public class DetailMatchingPostResponseDto {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "약속 시간", example = "2023-04-02 02:31:55")
    private LocalDateTime promiseTime;

    @ApiModelProperty(value = "약속 장소", example = "광운대역 1번 출구")
    private String promiseLocation;

    @ApiModelProperty(value = "모집 인원 수", example = "4")
    private Integer peopleNum;

    @ApiModelProperty(value = "성별", example = "남성")
    private String gender;

    @ApiModelProperty(value = "식당 이름", example = "작은집")
    private String restaurantName; // 식당 이름

    @ApiModelProperty(value = "짧은 모집글", example = "내일 12시에 작은집에서 같이 밥 드실 3명 구해요~ 공강 좋아!")
    private String shortText; // 짧은 모집글 (100자 제한)
}