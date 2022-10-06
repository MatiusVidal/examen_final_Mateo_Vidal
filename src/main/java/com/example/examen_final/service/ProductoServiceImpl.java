/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examen_final.service;

import com.example.examen_final.models.Producto;
import com.example.examen_final.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author usuario
 */
public class ProductoServiceImpl extends GenericServiceImpl<Producto,Long> implements ProductoService{
    
    @Autowired
    ProductoRepository productoRepository;
    
    @Override
    public CrudRepository<Producto, Long> getDao() {
        return productoRepository;
    }

    @Override
    public Producto findById(Long id) {
        return null;
    }
    
}
