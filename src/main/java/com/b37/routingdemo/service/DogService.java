package com.b37.routingdemo.service;

import com.b37.routingdemo.domain.Dog;
import com.b37.routingdemo.dto.DogDetailsListItemDto;
import com.b37.routingdemo.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DogService {

    private final DogRepository dogRepository;

    @Autowired
    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }


    public List<DogDetailsListItemDto> fetchDogList() {
        List<Dog> dogList = dogRepository.findAll();
        return mapDogToDto(dogList);
    }

    private List<DogDetailsListItemDto> mapDogToDto(List<Dog> dogList) {
        return dogList.stream().map(DogDetailsListItemDto::new).toList();
    }
}
