/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examen_final.controller;

import com.example.examen_final.models.Factura;
import com.example.examen_final.service.FacturaServiceImpl;
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
@RequestMapping("/api/factura")
public class FacturaController {
    @Autowired
    FacturaServiceImpl facturaServiceImpl;

    @GetMapping("/listar")
    public ResponseEntity<List<Factura>>listar() {
        return new ResponseEntity<>(facturaServiceImpl.findByAll(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Factura> search(@PathVariable Long id) {
        return new ResponseEntity<>(facturaServiceImpl.FindByID(id), HttpStatus.OK);
    }


    @PostMapping("/crear")
    public ResponseEntity<Factura> crearLista(@RequestBody Factura f) {
        return new ResponseEntity<>(facturaServiceImpl.save(f), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Factura> eliminarLista(@PathVariable Long id) {
        facturaServiceImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    // actualizar
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Factura> actualizarLista(@PathVariable Long id, @RequestBody Factura factura) {

        Factura listaActual = facturaServiceImpl.FindByID(id);
        listaActual.setId(factura.getId());
        listaActual.setId_cliente(factura.getId_cliente());
        listaActual.setNum_factura(factura.getNum_factura());
        listaActual.setFecha(factura.getFecha());
        facturaServiceImpl.save(listaActual);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
