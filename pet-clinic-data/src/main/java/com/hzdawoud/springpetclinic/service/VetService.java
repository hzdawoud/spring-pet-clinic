package com.hzdawoud.springpetclinic.service;

import com.hzdawoud.springpetclinic.model.Pet;
import com.hzdawoud.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
