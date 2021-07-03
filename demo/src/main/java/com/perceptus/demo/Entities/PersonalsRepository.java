package com.perceptus.demo.Entities;

import org.springframework.data.repository.CrudRepository;

public interface PersonalsRepository extends CrudRepository<Personals, Long>{
    Personals findById(long id);
}
