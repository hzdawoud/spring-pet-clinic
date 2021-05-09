package com.hzdawoud.springpetclinic.bootstrap;

import com.hzdawoud.springpetclinic.model.Owner;
import com.hzdawoud.springpetclinic.model.Pet;
import com.hzdawoud.springpetclinic.model.PetType;
import com.hzdawoud.springpetclinic.model.Vet;
import com.hzdawoud.springpetclinic.service.OwnerService;
import com.hzdawoud.springpetclinic.service.PetTypeService;
import com.hzdawoud.springpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDog = petTypeService.save(dog);


        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCat = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("hazem");
        owner1.setLastName("dawoud");
        owner1.setAddress("155 Mansoura st");
        owner1.setCity("Gaza");
        owner1.setTelephone("465498792");

        Pet pet1 = new Pet();
        pet1.setPetType(dog);
        pet1.setOwner(owner1);
        pet1.setLocalDate(LocalDate.now());
        pet1.setName("Roso");
        owner1.getPets().add(pet1);

        Owner owner2 = new Owner();
        owner2.setFirstName("david");
        owner2.setLastName("ahmed");
        owner2.setAddress("155 Remal st");
        owner2.setCity("Gaza");
        owner2.setTelephone("654898971");


        Pet pet2 = new Pet();
        pet2.setPetType(cat);
        pet2.setOwner(owner2);
        pet2.setLocalDate(LocalDate.now());
        pet2.setName("A cat");
        owner2.getPets().add(pet2);

        ownerService.save(owner1);
        ownerService.save(owner2);


        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("gg");
        vet1.setLastName("wp");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("wp");
        vet2.setLastName("gg");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
