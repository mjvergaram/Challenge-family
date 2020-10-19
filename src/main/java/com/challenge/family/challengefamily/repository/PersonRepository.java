package com.challenge.family.challengefamily.repository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.family.challengefamily.model.Person;

@Repository
@EntityScan(basePackages = {"com.challenge.family.challengefamily.model.Person"})
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
