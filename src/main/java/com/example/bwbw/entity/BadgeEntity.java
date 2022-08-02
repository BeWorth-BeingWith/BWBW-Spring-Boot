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
@Table(name = "BADGE")
public class BadgeEntity {

    @Id
    @Column(name = "badge_id")
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long badgeId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserInfoEntity user;

    @Column(name = "badge_code", length = 3)
    private Integer badgeCode;

    @Column(name = "isAcquired")
    private boolean isAcquired;

    @Column(name = "acquired_at")
    private LocalDateTime acquiredAt;
}
