package com.example.bwbw.auth.dto;

import com.example.bwbw.entity.UserInfoEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class RequestSignUpDto {

    private String email;

    private String password;

    private Integer gender;

    private String nickname;

    private String major;

    @Builder
    public RequestSignUpDto (String email, String password, Integer gender, String nickname, String major) {
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.nickname = nickname;
        this.major = major;
    }

    public UserInfoEntity toEntity() {        //회원가입 유저 생성

        return UserInfoEntity.builder()
                .nickname(builder().nickname)
                .email(builder().email)
                .gender(builder().gender)
                .password(builder().password)
                .major(builder().major)
                .refreshToken(null)         //아직 모름
                .createdAt(LocalDateTime.now())
                .modifiedAt(LocalDateTime.now())
                .modifiedMajorAt(LocalDateTime.now())      //전공이 변경되면 초기화
                .build();
    }

}
