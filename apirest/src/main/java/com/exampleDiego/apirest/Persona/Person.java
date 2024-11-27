package com.exampleDiego.apirest.Persona;

import java.security.Identity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity             //Se establece como entidad de la app
@Data               //Se importa Data de Lombok para generar Getters, Setters, toString, etc
@AllArgsConstructor //Constructores con argumento
@NoArgsConstructor  //Constructor sin argumento

public class Person {
    @Id             //Se especifica el Id como elemento unico de identificacion
    @GeneratedValue //(strategy = GenerationType.AUTO/IDENTITY/ETC) Aqui se establece como se genera el Id en la DB
                   //Si no se especifica Spring generara automaticamente la opcion de GenerationType
   
    @Basic         //Se establece como basicos los demas atributos de la Entidad    
    private Integer id;
    private String name;
    private String lastName;
    private String email;
}
