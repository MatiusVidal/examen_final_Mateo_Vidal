/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.examen_final.repository;

import com.example.examen_final.models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author usuario
 */
public interface ClienteRepository extends MongoRepository <Cliente, Long>{
    
}
