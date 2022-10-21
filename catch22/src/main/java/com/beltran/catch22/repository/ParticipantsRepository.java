package com.beltran.catch22.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.beltran.catch22.entity.Participants;

@Repository
public interface ParticipantsRepository extends JpaRepository<Participants, Long> {

}
