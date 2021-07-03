package com.perceptus.demo.Entities;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long>{
    Address findById(long AdresId);
}
