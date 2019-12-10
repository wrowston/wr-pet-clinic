package guru.springframework.wrpetclinic.services;

import guru.springframework.wrpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
