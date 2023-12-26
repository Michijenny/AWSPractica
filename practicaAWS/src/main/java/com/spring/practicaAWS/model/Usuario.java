/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.practicaAWS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author enriq
 */
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Usuario {
    
    @Id
    @GeneratedValue
    private Integer idUsuario;
    @NonNull
    private String nombre;
    private String clave;
    private String email;
    private boolean estado;
    private String imagenPath;
    
    @Transient
    private String imagenUrl;
    
    
}
