/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domiciliosenvia.domicilio.ejb.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jgramirez
 */
@Entity
@Table(name = "gn_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GnRoles.findAll", query = "SELECT g FROM GnRoles g"),
    @NamedQuery(name = "GnRoles.findById", query = "SELECT g FROM GnRoles g WHERE g.id = :id"),
    @NamedQuery(name = "GnRoles.findByNombre", query = "SELECT g FROM GnRoles g WHERE g.nombre = :nombre"),
    @NamedQuery(name = "GnRoles.findByDescripcion", query = "SELECT g FROM GnRoles g WHERE g.descripcion = :descripcion"),
    @NamedQuery(name = "GnRoles.findByActivo", query = "SELECT g FROM GnRoles g WHERE g.activo = :activo"),
    @NamedQuery(name = "GnRoles.findByUsuarioCrea", query = "SELECT g FROM GnRoles g WHERE g.usuarioCrea = :usuarioCrea"),
    @NamedQuery(name = "GnRoles.findByTerminalCrea", query = "SELECT g FROM GnRoles g WHERE g.terminalCrea = :terminalCrea"),
    @NamedQuery(name = "GnRoles.findByFechaHoraCrea", query = "SELECT g FROM GnRoles g WHERE g.fechaHoraCrea = :fechaHoraCrea"),
    @NamedQuery(name = "GnRoles.findByUsuarioModifica", query = "SELECT g FROM GnRoles g WHERE g.usuarioModifica = :usuarioModifica"),
    @NamedQuery(name = "GnRoles.findByTerminalModifica", query = "SELECT g FROM GnRoles g WHERE g.terminalModifica = :terminalModifica"),
    @NamedQuery(name = "GnRoles.findByFechaHoraModifica", query = "SELECT g FROM GnRoles g WHERE g.fechaHoraModifica = :fechaHoraModifica")})
public class GnRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 512)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo")
    private boolean activo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "usuario_crea")
    private String usuarioCrea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "terminal_crea")
    private String terminalCrea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora_crea")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraCrea;
    @Size(max = 128)
    @Column(name = "usuario_modifica")
    private String usuarioModifica;
    @Size(max = 16)
    @Column(name = "terminal_modifica")
    private String terminalModifica;
    @Column(name = "fecha_hora_modifica")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraModifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gnRolesId")
    private List<GnRolesPerfiles> gnRolesPerfilesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gnRolesId")
    private List<GnRolesUsuario> gnRolesUsuarioList;

    public GnRoles() {
    }

    public GnRoles(Integer id) {
        this.id = id;
    }

    public GnRoles(Integer id, String nombre, boolean activo, String usuarioCrea, String terminalCrea, Date fechaHoraCrea) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
        this.usuarioCrea = usuarioCrea;
        this.terminalCrea = terminalCrea;
        this.fechaHoraCrea = fechaHoraCrea;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getUsuarioCrea() {
        return usuarioCrea;
    }

    public void setUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
    }

    public String getTerminalCrea() {
        return terminalCrea;
    }

    public void setTerminalCrea(String terminalCrea) {
        this.terminalCrea = terminalCrea;
    }

    public Date getFechaHoraCrea() {
        return fechaHoraCrea;
    }

    public void setFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
    }

    public String getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public String getTerminalModifica() {
        return terminalModifica;
    }

    public void setTerminalModifica(String terminalModifica) {
        this.terminalModifica = terminalModifica;
    }

    public Date getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    public void setFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
    }

    @XmlTransient
    public List<GnRolesPerfiles> getGnRolesPerfilesList() {
        return gnRolesPerfilesList;
    }

    public void setGnRolesPerfilesList(List<GnRolesPerfiles> gnRolesPerfilesList) {
        this.gnRolesPerfilesList = gnRolesPerfilesList;
    }

    @XmlTransient
    public List<GnRolesUsuario> getGnRolesUsuarioList() {
        return gnRolesUsuarioList;
    }

    public void setGnRolesUsuarioList(List<GnRolesUsuario> gnRolesUsuarioList) {
        this.gnRolesUsuarioList = gnRolesUsuarioList;
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
        if (!(object instanceof GnRoles)) {
            return false;
        }
        GnRoles other = (GnRoles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domiciliosenvia.domicilio.ejb.entidades.GnRoles[ id=" + id + " ]";
    }
    
}
