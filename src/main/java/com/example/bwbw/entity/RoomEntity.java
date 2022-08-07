package com.example.bwbw.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Table(name = "ROOM")
public class RoomEntity {

    @Id
    @Column(name = "room_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_writing")
    @NotNull
    private String roomWriting;

    @Column(name = "matching_count")
    @NotNull
    private Integer matchingCount;

    @Column(name = "matching_time")
    @NotNull
    private LocalDateTime matchingTime;

    @Column(name = "created_at")
    @NotNull
    private LocalDateTime createdAt;

    @Column(name = "modified_at")
    @NotNull
    private LocalDateTime modifiedAt;

    // fk
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserInfoEntity user;


    @OneToMany(mappedBy = "room")
    List<RoomPersonEntity> roomPerson = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurant;


}
