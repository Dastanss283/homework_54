package model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

@Data
@Document(collection = "event")
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class Event {
   private static Random r = new Random();
    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private LocalDateTime productionDate;
    @Indexed
    private String mark;
    private String description;

}
