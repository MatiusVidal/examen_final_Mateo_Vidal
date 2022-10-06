/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examen_final.controller;

import com.example.examen_final.models.Cliente;
import com.example.examen_final.service.ClienteServiceImpl;
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
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    ClienteServiceImpl clienteServiceImpl;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>>listar() {
        return new ResponseEntity<>(clienteServiceImpl.findByAll(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Cliente> search(@PathVariable Long id) {
        return new ResponseEntity<>(clienteServiceImpl.FindByID(id), HttpStatus.OK);
    }


    @PostMapping("/crear")
    public ResponseEntity<Cliente> crearLista(@RequestBody Cliente c) {
        return new ResponseEntity<>(clienteServiceImpl.save(c), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Cliente> eliminarLista(@PathVariable Long id) {
        clienteServiceImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    // actualizar
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Cliente> actualizarLista(@PathVariable Long id, @RequestBody Cliente cliente) {

        Cliente listaActual = clienteServiceImpl.FindByID(id);
        listaActual.setId(cliente.getId());
        listaActual.setDni(cliente.getDni());
        listaActual.setNombre(cliente.getNombre());
        listaActual.setApellido(cliente.getApellido());
        listaActual.setTelefono(cliente.getTelefono());
        clienteServiceImpl.save(listaActual);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
