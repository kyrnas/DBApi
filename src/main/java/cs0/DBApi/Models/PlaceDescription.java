package cs0.DBApi.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@Document
public class PlaceDescription {
    @Id
    private String id;
    @Field
    private String placeName;
    @Field
    private String description;

    public PlaceDescription(String placeName, String description) {
        this.placeName = placeName;
        this.description = description;
    }
}
