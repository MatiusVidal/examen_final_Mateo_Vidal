/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examen_final.controller;

import com.example.examen_final.models.Producto;
import com.example.examen_final.service.ProductoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("/api/producto")
public class ProductoController {
    @Autowired
    ProductoServiceImpl productoServiceImpl;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Producto>>listar() {
        return new ResponseEntity<>(productoServiceImpl.findByAll(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Producto> search(@PathVariable Long id) {
        return new ResponseEntity<>(productoServiceImpl.FindByID(id), HttpStatus.OK);
    }


    @PostMapping("/crear")
    public ResponseEntity<Producto> crearLista(@RequestBody Producto p) {
        return new ResponseEntity<>(productoServiceImpl.save(p), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Producto> eliminarLista(@PathVariable Long id) {
        productoServiceImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    // actualizar
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Producto> actualizarLista(@PathVariable Long id, @RequestBody Producto producto) {

        Producto listaActual = productoServiceImpl.FindByID(id);
        listaActual.setId(producto.getId());
        listaActual.setId_factura(producto.getId_factura());
        listaActual.setCod_producto(producto.getCod_producto());
        listaActual.setProducto(producto.getProducto());
        listaActual.setCantidad(producto.getCantidad());
        listaActual.setPrecio(producto.getPrecio());
        productoServiceImpl.save(listaActual);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
