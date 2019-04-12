/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibm.prueba.service.pruebatecnica.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author anreyes
 */
@Entity
@Table(name = "clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")
    , @NamedQuery(name = "Clientes.findByNombre", query = "SELECT c FROM Clientes c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Clientes.findByDireccion", query = "SELECT c FROM Clientes c WHERE c.direccion = :direccion")
    , @NamedQuery(name = "Clientes.findByCiudad", query = "SELECT c FROM Clientes c WHERE c.ciudad = :ciudad")
    , @NamedQuery(name = "Clientes.findByTelefono", query = "SELECT c FROM Clientes c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Clientes.findByNumeroTarjetaAsociada", query = "SELECT c FROM Clientes c WHERE c.numeroTarjetaAsociada = :numeroTarjetaAsociada")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Ciudad")
    private String ciudad;
    @Column(name = "telefono")
    private Integer telefono;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "numero_tarjeta_asociada")
    private String numeroTarjetaAsociada;

    public Clientes() {
    }

    public Clientes(String numeroTarjetaAsociada) {
        this.numeroTarjetaAsociada = numeroTarjetaAsociada;
    }

    public Clientes(String numeroTarjetaAsociada, String nombre, String direccion, String ciudad) {
        this.numeroTarjetaAsociada = numeroTarjetaAsociada;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getNumeroTarjetaAsociada() {
        return numeroTarjetaAsociada;
    }

    public void setNumeroTarjetaAsociada(String numeroTarjetaAsociada) {
        this.numeroTarjetaAsociada = numeroTarjetaAsociada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroTarjetaAsociada != null ? numeroTarjetaAsociada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.numeroTarjetaAsociada == null && other.numeroTarjetaAsociada != null) || (this.numeroTarjetaAsociada != null && !this.numeroTarjetaAsociada.equals(other.numeroTarjetaAsociada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ptesa.olimpia.disperse.service.pruebatecnica.entity.Clientes[ numeroTarjetaAsociada=" + numeroTarjetaAsociada + " ]";
    }
    
}
