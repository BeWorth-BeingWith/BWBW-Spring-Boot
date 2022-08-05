package com.example.bwbw.repository;

import com.example.bwbw.entity.EmailAuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailAuthRepository extends JpaRepository<EmailAuthEntity, Long> {
}
