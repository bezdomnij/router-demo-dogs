package com.b37.routingdemo.repository;

import com.b37.routingdemo.domain.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
}
