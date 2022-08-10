package com.example.bwbw.auth.config;

import com.example.bwbw.auth.service.AuthService;
import com.example.bwbw.repository.JpaUserInfoRepositoy;
import com.example.bwbw.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

public class AuthConfig {
    private EntityManager em;

    public AuthConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Autowired
    public void SpringConfig(EntityManager em) {
        this.em = em;
    }

    private DataSource dataSource;
    public void SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Bean
    public AuthService authService() {
        return new AuthService(authRepository());
    }
    @Bean
    public UserInfoRepository authRepository() {

        return new JpaUserInfoRepositoy(em);
    }
}
