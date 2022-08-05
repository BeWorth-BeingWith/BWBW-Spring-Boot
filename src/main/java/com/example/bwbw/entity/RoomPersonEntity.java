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

    @Id
    @Column(name = "room_id")
    @NotNull
    private Long roomId;

    @Id
    @Column(name = "user_id")
    private Long userId;

    @Id
    @Column(name = "restaurant_id")
    @NotNull
    private Long restaurantId;

    @Column(name = "is_owner")
    private boolean isOwner;


    // fk
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private RoomEntity room;

}
