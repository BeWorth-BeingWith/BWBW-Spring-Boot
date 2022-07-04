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

    private String expriedTime;

    private String name;

    private String review;

    private Long roomId;
}
