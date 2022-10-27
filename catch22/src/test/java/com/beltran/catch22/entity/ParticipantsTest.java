package com.beltran.catch22.entity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.beltran.catch22.entity.Participants;
import com.beltran.catch22.repository.ParticipantsRepository;

@SpringBootTest
public class ParticipantsTest {

	@Autowired
	ParticipantsRepository pRepo;
	
	@Test
	public void testCreate () {
		Participants p = new Participants ();
			p.setId(5L);
			p.setLastName("Argueta");
			p.setFirstName("Daniel");
			p.setPhoneNumber("555-555-5555");
			p.setHomeAddress("123 Eastern Parkway");
			p.setCity("New York");
			p.setState("New York");
			p.setPostalCode("11111");
			p.setEmail("daniel@gmail.com");
			p.setBirthYear(1985);
			pRepo.save(p);  
			assertNotNull(pRepo.findById(5L).get());
			
		}
	}
