package com.example.bwbw.auth.service;

import com.example.bwbw.entity.UserInfoEntity;
import com.example.bwbw.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class authService {

    private final UserInfoRepository userInfoRepository;

    public UserInfoEntity saveUser(UserInfoEntity userInfoEntity) {
        return userInfoRepository.save(userInfoEntity);
    }
}
