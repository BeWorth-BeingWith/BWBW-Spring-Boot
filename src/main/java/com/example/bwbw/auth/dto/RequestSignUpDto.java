package com.example.bwbw.auth.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RequestSignUpDto {

    @ApiModelProperty(example = "Jiwon")
    private String name;

    @ApiModelProperty(example = "Jiwon@gmail.com")
    private String email;

    @ApiModelProperty(example = "1234")
    private String password;

    @ApiModelProperty(example = "male")
    private String gender;

    @ApiModelProperty(example = "uzacha")
    private String nickname;

    @ApiModelProperty(value = "학교 인증 이메일", example = "Jiwon@kw.ac.kr")
    private String authEmail;
}
