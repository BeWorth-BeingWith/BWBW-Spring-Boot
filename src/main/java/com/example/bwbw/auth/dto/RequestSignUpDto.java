package com.example.bwbw.auth.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
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

    @Builder
    public RequestSignUpDto (String name, String email, String password, String gender, String nickname) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.nickname = nickname;
    }
}
