package com.Rush.Ecom.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String brand;
    private BigDecimal price;
    private String category;

    // 1. Rename variable to 'description' but map it to 'desc' from React.
    // This keeps H2/MySQL happy by avoiding the SQL reserved keyword "DESC"!
    @JsonProperty("description")
    private String description;

    // 2. Add the format parser back to read browser date strings safely
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date releaseDate;

    // 3. Match your exact React state key ("available")
    private boolean productAvailable;

    // 4. Match your exact React state key ("stockQuantity")
    @JsonProperty("stockQuantity")
    private Integer quantity;

    private String imageName;
    private String imageType;

    @Lob
    @Column(length = 52428800) // Allows up to 50MB images in database
    private byte[] imageDate;
}