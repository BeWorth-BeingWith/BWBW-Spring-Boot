package com.example.bwbw.auth.service;

import com.example.bwbw.auth.dto.RequestSignUpDto;
import com.example.bwbw.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class AuthService {

    private static UserInfoRepository userInfoRepository = null;

    public AuthService(UserInfoRepository userInfoRepository)
    {
        this.userInfoRepository = userInfoRepository;
    }

    public static Long createUser(RequestSignUpDto requestSignUpDto) {
        //vailation 추가예정
        return userInfoRepository.save(requestSignUpDto.toEntity()).getId();
    }


}
