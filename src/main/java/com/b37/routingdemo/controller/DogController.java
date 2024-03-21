package com.b37.routingdemo.controller;

import com.b37.routingdemo.dto.DogDetailsListItemDto;
import com.b37.routingdemo.service.DogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dogs")
public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping
    public ResponseEntity<List<DogDetailsListItemDto>> getDogList() {
        List<DogDetailsListItemDto> dtoList = dogService.fetchDogList();
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }
}
