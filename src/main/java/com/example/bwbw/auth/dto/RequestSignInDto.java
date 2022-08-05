package com.example.bwbw.auth.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RequestSignInDto {

    private String email;

    private String password;
}
