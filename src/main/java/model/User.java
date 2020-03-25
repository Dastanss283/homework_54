package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "user")
public class User {
    @Id
    private String id = UUID.randomUUID().toString();
    @Indexed
    private Event event;
    private String email;
    private String fullName;

}
