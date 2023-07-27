package com.example.live_agenda;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PlaceController {

    private PlaceService placeService;

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping("/api/places")
    public  Iterable<Place> getPlaces(){
        return placeService.getPlaces();

    }

    @PostMapping("/api/places")
    public void addPlace(@RequestBody Place place){
        placeService.addPlace(place);
    }

}
