package dev.shafayet.Books;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "reviews")
public class Review {
    @Id
    private ObjectId id;
    private String body;
}
