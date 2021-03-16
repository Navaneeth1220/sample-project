package com.cg.apps.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.apps.entity.Room;

public interface IRoomRepository extends JpaRepository<Room, Long> {
}
