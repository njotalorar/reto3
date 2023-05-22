package com.example.reto3.Repository.CRUD;

import com.example.reto3.Model.Car;
import com.example.reto3.Model.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ScoreCrudRepository extends CrudRepository<Score, Integer> {

}
