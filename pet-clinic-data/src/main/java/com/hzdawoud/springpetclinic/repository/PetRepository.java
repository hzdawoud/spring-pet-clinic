package com.hzdawoud.springpetclinic.repository;

import com.hzdawoud.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
