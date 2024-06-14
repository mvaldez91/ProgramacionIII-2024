package com.example.sesion15.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="products")
@Setter
@Getter
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

//Annotations reference/
//https://medium.com/@himani.prasad016/validations-in-spring-boot-e9948aa6286b
@NotBlank(message = "El campo no puede estar vacio")
@NotEmpty(message = "El campo no puede estar vacio")
private String name;

@Min(value=1, message = "El precio debe ser mayor a 1")
@Max(value=100, message= "El precio debe ser menor o igual a 100")
private Double price;

@Column(name="created_at")
@Temporal(TemporalType.DATE)
private Date createdAt;
}
