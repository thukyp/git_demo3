package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.validation.annotation.Validated;

import com.example.demo.validation.ValidPrice;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.executable.ValidateOnExecution;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@ValidPrice
@Getter
@Setter
@Validated
@ValidateOnExecution
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Column(nullable = false)
    private String name;
}
