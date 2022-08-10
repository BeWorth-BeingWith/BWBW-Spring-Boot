package com.example.bwbw.repository;

import com.example.bwbw.entity.UserInfoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {
    UserInfoEntity save(UserInfoEntity userInfoEntity);        //저장

    Optional<UserInfoEntity> findByEmail (String email);       //중복된 이메일 인가
    Optional<UserInfoEntity> findByNickname(String nickname);       //중복된 닉네임임가
}
