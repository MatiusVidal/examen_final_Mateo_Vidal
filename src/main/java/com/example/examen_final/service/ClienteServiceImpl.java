/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examen_final.service;

import com.example.examen_final.models.Cliente;
import com.example.examen_final.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author usuario
 */
public class ClienteServiceImpl extends GenericServiceImpl<Cliente,Long> implements ClienteService{
    
    @Autowired
    ClienteRepository clienteRepository;
    
    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return clienteRepository;
    }

    @Override
    public Cliente findById(Long id) {
        return null;
    }
}
