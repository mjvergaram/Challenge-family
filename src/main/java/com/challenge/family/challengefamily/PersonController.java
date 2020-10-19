package com.challenge.family.challengefamily;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.family.challengefamily.model.Person;
import com.challenge.family.challengefamily.repository.PersonRepository;

@RestController
@RequestMapping("/challenge")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping("/people")
	public Person addPerson(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@GetMapping("/people")
	public ResponseEntity<List<Person>> gePeople(){
		return ResponseEntity.ok(personRepository.findAll());
	}
}
