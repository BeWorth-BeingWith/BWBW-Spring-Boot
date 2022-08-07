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
@ApiModel(value = "뱃지 정보", description = "뱃지 아이디, 획득 여부를 반환")
public class BadgeResponseDto {

    @ApiModelProperty(value = "뱃지 아이디", example = "1234")
    private Long badgeId;

    @ApiModelProperty(value = "뱃지 획득 여부", example = "true")
    private Boolean isAcquire;
}
