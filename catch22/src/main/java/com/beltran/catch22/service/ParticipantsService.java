package com.beltran.catch22.service;

import java.util.List; 

import com.beltran.catch22.entity.Participants;

public interface ParticipantsService {
	List<Participants> getAllParticipants();
	void saveParticipants(Participants participant);
	Participants getParticipantsById(long id);
	void deleteParticipantById(long id);
	
	
}
