package com.hzdawoud.springpetclinic.service;

import com.hzdawoud.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
