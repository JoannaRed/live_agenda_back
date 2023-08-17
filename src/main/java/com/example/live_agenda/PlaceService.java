package com.example.live_agenda;


import org.springframework.stereotype.Service;

@Service
public class PlaceService {

    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Iterable<Place> getPlaces(){
         return placeRepository.findAll();
    }

    public void addPlace(Place place){
        if(place.getScore() < 0 || place.getScore() > 5 ){
            throw new IllegalArgumentException("Score poza zakresem");
        }
        placeRepository.save(place);
    }

}
