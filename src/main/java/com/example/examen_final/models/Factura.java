/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examen_final.models;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Factura {
    private Long id;
    private Long id_cliente;
    private String num_factura;
    private Date fecha;

    public Factura(Long id, Long id_cliente, String num_factura, Date fecha) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.num_factura = num_factura;
        this.fecha = fecha;
    }

    public Factura() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(String num_factura) {
        this.num_factura = num_factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
