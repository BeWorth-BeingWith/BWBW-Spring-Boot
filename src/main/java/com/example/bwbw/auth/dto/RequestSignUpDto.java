package com.example.bwbw.auth.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RequestSignUpDto {

    private String name;

    private String email;

    private String password;

    private String gender;

    private String nickname;
}
