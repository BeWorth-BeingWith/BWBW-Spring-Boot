package com.example.bwbw.auth.service;

import com.example.bwbw.auth.dto.RequestSignUpDto;
import com.example.bwbw.repository.UserInfoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {

    private final UserInfoRepository userInfoRepository;

    public Long createUser(RequestSignUpDto requestSignUpDto) {

        //vailation 추가예정
        return userInfoRepository.save(requestSignUpDto.toEntity()).getId();

    }

}
