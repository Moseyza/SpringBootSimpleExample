package com.example.injection.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemsService {

    private  final List<String> items ;

    public ItemsService(){
        this.items = Arrays.asList("A", "B" , "C" , "D" , "E" , "F" , "G" , "H" , "I");
    }

    public List<String> getItems() {
        return  this.items;
    }
}
