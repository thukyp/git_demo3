package com.example.demo.model;

import com.example.demo.validation.ValidPrice;
import jakarta.validation.constraints.*;
import jakarta.validation.executable.ValidateOnExecution;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@ValidPrice
@Getter
@Setter
@Validated
@ValidateOnExecution
@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private String image;

    @Min(1)
    private long price;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
