package com.beltran.catch22.service;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beltran.catch22.entity.Participants;
import com.beltran.catch22.repository.ParticipantsRepository;

@Service
public class ParticipantsServiceImpl implements ParticipantsService{

	@Autowired
	private ParticipantsRepository participantsRepository;
	
	@Override
	public List<Participants> getAllParticipants() {
		return participantsRepository.findAll();
	}
	@Override
	public void saveParticipants(Participants participants) {
		this.participantsRepository.save(participants);
	}
	@Override
	public Participants getParticipantsById(long id) {		
		Optional<Participants> optional = participantsRepository.findById(id);
		Participants participant = null;
		if(optional.isPresent()) {
			participant = optional.get();
		}else {
			throw new RuntimeException("Participant not found ::"+ id);
		}
		return participant;
		}
	
	@Override
	public void deleteParticipantById(long id) {
		this.participantsRepository.deleteById(id);
	}

	}

