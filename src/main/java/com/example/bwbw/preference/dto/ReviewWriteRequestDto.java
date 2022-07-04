package com.example.bwbw.preference.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewWriteRequestDto {

    private String accessToken;

    @ApiModelProperty(value = "리뷰 작성 대상자 이름", example = "김철수")
    private String name;

    @ApiModelProperty(value = "리뷰 내용", example = "이 사람은 너무 별로 였습니다 ㅡㅡ")
    private String review;

    @ApiModelProperty(value = "방 번호", example = "4")
    private Long roomId;
}
