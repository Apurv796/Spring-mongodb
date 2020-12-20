package com.java.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.Builder;
import lombok.ToString;

@Data
@Builder
@Document(collection = "Book")
public class Book {

    @Id
    private int id;
    private String bookName;
    private String authorName;

}