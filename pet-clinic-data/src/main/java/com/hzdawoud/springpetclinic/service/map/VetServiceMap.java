package com.hzdawoud.springpetclinic.service.map;

import com.hzdawoud.springpetclinic.model.Owner;
import com.hzdawoud.springpetclinic.model.Pet;
import com.hzdawoud.springpetclinic.model.Vet;
import com.hzdawoud.springpetclinic.service.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
