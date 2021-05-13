package com.hzdawoud.springpetclinic.repository;

import com.hzdawoud.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
