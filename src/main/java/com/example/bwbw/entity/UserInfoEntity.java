package com.example.bwbw.entity;

import com.example.bwbw.auth.dto.RequestSignInDto;
import com.example.bwbw.auth.dto.RequestSignUpDto;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Table(name = "USER_INFO")
public class UserInfoEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    @NotNull
    private String nickname;

    @Column(length = 30)
    @NotNull
    private String password;

    @Column(length = 100)
    @NotNull
    private String email;

    @Column
    @NotNull
    private Integer gender;

    @Column(name = "refresh_token")
    private String refreshToken;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;

    @Column
    private String major;

    @Column(name = "modified_major_at")
    private LocalDateTime modifiedMajorAt;

    @OneToMany(mappedBy = "user")
    List<RoomEntity> rooms = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    List<BadgeEntity> badges = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    List<EmailAuthEntity> emailAuths = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    List<RoomPersonEntity> roomPerson = new ArrayList<>();

    @Builder
    public UserInfoEntity(String nickname, String password, String email, Integer gender, String major, String refreshToken, LocalDateTime createdAt, LocalDateTime modifiedAt, LocalDateTime modifiedMajorAt)  {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.major = major;

        this.refreshToken = refreshToken;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.modifiedMajorAt = modifiedMajorAt;

    }

    public static UserInfoEntity createUser(RequestSignUpDto requestSignUpDto) {        //회원가입 유저 생성
        UserInfoEntity userInfoEntity = UserInfoEntity.builder()
                .nickname(builder().nickname)
                .password(builder().password)
                .email(builder().email)
                .gender(builder().gender)
                .gender(builder().gender)
                .refreshToken(builder().refreshToken)
                .createdAt(builder().createdAt)
                .modifiedAt(builder().modifiedAt)
                .modifiedMajorAt(builder().modifiedMajorAt)
                .build();

        return userInfoEntity;
    }
}
