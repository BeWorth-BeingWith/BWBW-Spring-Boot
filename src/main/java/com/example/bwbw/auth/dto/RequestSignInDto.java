package com.example.bwbw.auth.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RequestSignInDto {

    @ApiModelProperty(example = "Jiwon@gmail.com")
    private String email;

    @ApiModelProperty(example = "1234")
    private String password;
}
