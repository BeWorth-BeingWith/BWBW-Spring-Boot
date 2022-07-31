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
@Table(name = "REVIEW")
public class ReviewEntity {

    @Id
    @Column(name = "review_id")
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "review",length = 500)
    private String review;


    @Column(name = "reviewer_id")
    private Long reviewerId;

    @Column(name = "review_target_id")
    private Long reviewedId;


    @Column(name = "created_at")
    private LocalDateTime time;


}
