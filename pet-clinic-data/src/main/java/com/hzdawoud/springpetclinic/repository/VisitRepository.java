package com.hzdawoud.springpetclinic.repository;

import com.hzdawoud.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
