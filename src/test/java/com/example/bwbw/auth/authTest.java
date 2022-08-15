package com.example.bwbw.auth;

import com.example.bwbw.entity.UserInfoEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class authTest {

    @Test
    void 회원가입() {
        UserInfoEntity userInfoEntity = new UserInfoEntity();

        userInfoEntity.setEmail("leech1211");
        userInfoEntity.setGender(1);
        userInfoEntity.setMajor("computer");
        userInfoEntity.setNickname("창창");
    }
}
