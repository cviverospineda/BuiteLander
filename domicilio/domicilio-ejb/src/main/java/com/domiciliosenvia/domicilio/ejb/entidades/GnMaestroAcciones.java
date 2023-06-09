/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domiciliosenvia.domicilio.ejb.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jgramirez
 */
@Entity
@Table(name = "gn_maestro_acciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GnMaestroAcciones.findAll", query = "SELECT g FROM GnMaestroAcciones g"),
    @NamedQuery(name = "GnMaestroAcciones.findById", query = "SELECT g FROM GnMaestroAcciones g WHERE g.id = :id"),
    @NamedQuery(name = "GnMaestroAcciones.findByGrupoId", query = "SELECT g FROM GnMaestroAcciones g WHERE g.grupoId = :grupoId"),
    @NamedQuery(name = "GnMaestroAcciones.findByNombre", query = "SELECT g FROM GnMaestroAcciones g WHERE g.nombre = :nombre"),
    @NamedQuery(name = "GnMaestroAcciones.findByDescripcion", query = "SELECT g FROM GnMaestroAcciones g WHERE g.descripcion = :descripcion")})
public class GnMaestroAcciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "grupo_id")
    private Integer grupoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 512)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "gnMaestroAccionesId")
    private List<GnMaestros> gnMaestrosList;
    @JoinColumn(name = "maestros_tipo", referencedColumnName = "tipo")
    @ManyToOne(optional = false)
    private GnMaestroTipos maestrosTipo;

    public GnMaestroAcciones() {
    }

    public GnMaestroAcciones(Integer id) {
        this.id = id;
    }

    public GnMaestroAcciones(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(Integer grupoId) {
        this.grupoId = grupoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<GnMaestros> getGnMaestrosList() {
        return gnMaestrosList;
    }

    public void setGnMaestrosList(List<GnMaestros> gnMaestrosList) {
        this.gnMaestrosList = gnMaestrosList;
    }

    public GnMaestroTipos getMaestrosTipo() {
        return maestrosTipo;
    }

    public void setMaestrosTipo(GnMaestroTipos maestrosTipo) {
        this.maestrosTipo = maestrosTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GnMaestroAcciones)) {
            return false;
        }
        GnMaestroAcciones other = (GnMaestroAcciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domiciliosenvia.domicilio.ejb.entidades.GnMaestroAcciones[ id=" + id + " ]";
    }
    
}
