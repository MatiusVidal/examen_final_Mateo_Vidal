/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examen_final.service;

import com.example.examen_final.models.Factura;
import com.example.examen_final.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class FacturaServiceImpl extends GenericServiceImpl<Factura,Long> implements FacturaService{
    
    @Autowired
    FacturaRepository facturaRepository;
    
    @Override
    public CrudRepository<Factura, Long> getDao() {
        return facturaRepository;
    }

    @Override
    public Factura findById(Long id) {
        return null;
    }
}
