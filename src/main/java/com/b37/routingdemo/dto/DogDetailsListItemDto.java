package com.b37.routingdemo.dto;

import com.b37.routingdemo.domain.Dog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DogDetailsListItemDto {

    private Long id;
    private String name;
    private String breed;

    public DogDetailsListItemDto(Dog dog) {
        this.id = dog.getId();
        this.name = dog.getName();
        this.breed = dog.getBreed();
    }

}
