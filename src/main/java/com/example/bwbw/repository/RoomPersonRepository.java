package com.example.bwbw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bwbw.entity.RoomPersonEntity;
public interface RoomPersonRepository extends JpaRepository<RoomPersonEntity, Long> {
}
