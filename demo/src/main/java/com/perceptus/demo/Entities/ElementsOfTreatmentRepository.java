package com.perceptus.demo.Entities;

import org.springframework.data.repository.CrudRepository;

public interface ElementsOfTreatmentRepository extends CrudRepository<ElementsOfTreatment, Long> {
    //List<ElementsOfTreatment> findByRodzaj(TreatType rodzaj);
    ElementsOfTreatment findById(long kod);
}