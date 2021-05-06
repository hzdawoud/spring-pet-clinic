package com.hzdawoud.springpetclinic.bootstrap;

import com.hzdawoud.springpetclinic.model.Owner;
import com.hzdawoud.springpetclinic.model.Vet;
import com.hzdawoud.springpetclinic.service.OwnerService;
import com.hzdawoud.springpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("hazem");
        owner1.setLastName("dawoud");


        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("david");
        owner2.setLastName("ahmed");

        ownerService.save(owner1);
        ownerService.save(owner2);


        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("gg");
        vet1.setLastName("wp");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("wp");
        vet2.setLastName("gg");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
