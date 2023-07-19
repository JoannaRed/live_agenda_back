package com.example.live_agenda;


import org.springframework.stereotype.Service;

@Service
public class PlaceService {

    public Place getPlace(){
        return new Place(1, "Pizzeria", "Via Belvedere 156, Massa", "pizza, spaghetti");
    }

    public void addPlace(Place place){
        System.out.println(place);
    }

}
