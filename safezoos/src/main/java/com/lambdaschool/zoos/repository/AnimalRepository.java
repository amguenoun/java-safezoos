package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.model.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    Animal findByAnimaltype(String type);

    @Query(value = "SELECT COUNT(*) as count FROM ZOOANIMALS WHERE animalid = :animalid", nativeQuery = true)
    long countAnimal(long animalid);

    @Query(value = "SELECT * FROM animal", nativeQuery = true)
    ArrayList<Animal> getAnimals();
}
