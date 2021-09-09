package cs0.DBApi.Services;

import cs0.DBApi.Models.PlaceDescription;
import cs0.DBApi.Repositories.PlaceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PlaceDescriptionService {
    private final PlaceRepository placeRepository;

    public List<PlaceDescription> getAllPlaceDescriptions(){
        List<PlaceDescription> result = placeRepository.findAll();
        System.out.println(result);
        return result;
    }

    public PlaceDescription getPlaceDescriptionByName(String name){
        return placeRepository.findPlaceDescriptionByPlaceName(name);
    }


}
