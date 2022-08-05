package com.example.bwbw.matchinglist.dto;

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
@ApiModel(value="매칭 방 작성", description = "새로운 매칭 방을 작성하기 위해 들어간 경우입니다.")
public class WriteNewRoomResponseDto { // 방 만들기 작성 처음 들어 갔을 때 Response

    @ApiModelProperty(value = "유저 이메일", example = "bjkang402@kw.ac.kr")
    private String userEmail;

    @ApiModelProperty(value = "패스워드")
    private String password;

    @ApiModelProperty(value = "닉네임", example = "빵준")
    private String nickname;

    @ApiModelProperty(value = "성별", example = "남성")
    private String gender;
}