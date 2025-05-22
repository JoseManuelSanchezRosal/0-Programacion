package com.example.springboot_restfull_webservices.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity //Se utiliza para marcar la clase como una clase Java persistente.
@Table(name = "users") //se utiliza para proporcionar los detalles de la tabla a la que se asignará esta entidad.

public class User {
    @Id // Se utiliza para definir la clave principal.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Define la estrategia de generación de la clave principal. En el caso anterior, declaramos que la clave principal es un campo de incremento automático.
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false, unique = true)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
    // se utiliza para definir las propiedades de la columna que se asignarán al campo anotado. Se pueden definir varias propiedades, como nombre, longitud, posibilidad de valores nulos, posibilidad de actualización, etc.
