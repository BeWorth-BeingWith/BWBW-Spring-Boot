package com.example.bwbw.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Table(name = "EMAIL_AUTH")
public class EmailAuthEntity {

    @Id
    @Column(name = "email_auth_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emailAuthId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "auth_code")
    private Integer authCode;

    // fk
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserInfoEntity user;
}
