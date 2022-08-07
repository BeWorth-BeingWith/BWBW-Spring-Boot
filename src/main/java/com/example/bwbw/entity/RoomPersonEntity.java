package com.example.bwbw.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Table(name = "ROOM_PERSON")
public class RoomPersonEntity {

    @Id
    @Column(name = "room_person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_owner")
    private boolean isOwner;


    // fk
    @ManyToOne
    @JoinColumn(name = "room_id")       //방 Id
    private RoomEntity room;

    @ManyToOne
    @JoinColumn(name = "user_id")       //유저 Id
    private UserInfoEntity user;

    @ManyToOne
    @JoinColumn(name = "restaurant_id") //식당 Id
    private RestaurantEntity restaurant;

}
