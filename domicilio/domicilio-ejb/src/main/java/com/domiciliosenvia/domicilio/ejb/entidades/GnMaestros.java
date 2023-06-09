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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "gn_maestros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GnMaestros.findAll", query = "SELECT g FROM GnMaestros g"),
    @NamedQuery(name = "GnMaestros.findById", query = "SELECT g FROM GnMaestros g WHERE g.id = :id"),
    @NamedQuery(name = "GnMaestros.findByNombre", query = "SELECT g FROM GnMaestros g WHERE g.nombre = :nombre"),
    @NamedQuery(name = "GnMaestros.findByValor", query = "SELECT g FROM GnMaestros g WHERE g.valor = :valor"),
    @NamedQuery(name = "GnMaestros.findByDescripcion", query = "SELECT g FROM GnMaestros g WHERE g.descripcion = :descripcion"),
    @NamedQuery(name = "GnMaestros.findByActivo", query = "SELECT g FROM GnMaestros g WHERE g.activo = :activo"),
    @NamedQuery(name = "GnMaestros.findByUsuarioCrea", query = "SELECT g FROM GnMaestros g WHERE g.usuarioCrea = :usuarioCrea"),
    @NamedQuery(name = "GnMaestros.findByTerminalCrea", query = "SELECT g FROM GnMaestros g WHERE g.terminalCrea = :terminalCrea"),
    @NamedQuery(name = "GnMaestros.findByFechaHoraCrea", query = "SELECT g FROM GnMaestros g WHERE g.fechaHoraCrea = :fechaHoraCrea"),
    @NamedQuery(name = "GnMaestros.findByUsuarioModifica", query = "SELECT g FROM GnMaestros g WHERE g.usuarioModifica = :usuarioModifica"),
    @NamedQuery(name = "GnMaestros.findByTerminalModifica", query = "SELECT g FROM GnMaestros g WHERE g.terminalModifica = :terminalModifica"),
    @NamedQuery(name = "GnMaestros.findByFechaHoraModifica", query = "SELECT g FROM GnMaestros g WHERE g.fechaHoraModifica = :fechaHoraModifica"),
    @NamedQuery(name = "GnMaestros.findByA", query = "SELECT g FROM GnMaestros g WHERE g.a = :a")})
public class GnMaestros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 8)
    @Column(name = "valor")
    private String valor;
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
    @Size(max = 69)
    @Column(name = "*")
    private String a;
    @JoinColumn(name = "gn_maestro_acciones_id", referencedColumnName = "id")
    @ManyToOne
    private GnMaestroAcciones gnMaestroAccionesId;
    @JoinColumn(name = "tipo", referencedColumnName = "tipo")
    @ManyToOne(optional = false)
    private GnMaestroTipos tipo;
    @OneToMany(mappedBy = "gnMaestrosId")
    private List<GnMaestros> gnMaestrosList;
    @JoinColumn(name = "gn_maestros_id", referencedColumnName = "id")
    @ManyToOne
    private GnMaestros gnMaestrosId;
    @JoinColumn(name = "gn_validacion_campos_id", referencedColumnName = "id")
    @ManyToOne
    private GnValidacionCampos gnValidacionCamposId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gnMaestrosIdPadre")
    private List<GnMaestroRelaciones> gnMaestroRelacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gnMaestrosIdHijo")
    private List<GnMaestroRelaciones> gnMaestroRelacionesList1;

    public GnMaestros() {
    }

    public GnMaestros(Integer id) {
        this.id = id;
    }

    public GnMaestros(Integer id, String nombre, boolean activo, String usuarioCrea, String terminalCrea, Date fechaHoraCrea) {
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public GnMaestroAcciones getGnMaestroAccionesId() {
        return gnMaestroAccionesId;
    }

    public void setGnMaestroAccionesId(GnMaestroAcciones gnMaestroAccionesId) {
        this.gnMaestroAccionesId = gnMaestroAccionesId;
    }

    public GnMaestroTipos getTipo() {
        return tipo;
    }

    public void setTipo(GnMaestroTipos tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public List<GnMaestros> getGnMaestrosList() {
        return gnMaestrosList;
    }

    public void setGnMaestrosList(List<GnMaestros> gnMaestrosList) {
        this.gnMaestrosList = gnMaestrosList;
    }

    public GnMaestros getGnMaestrosId() {
        return gnMaestrosId;
    }

    public void setGnMaestrosId(GnMaestros gnMaestrosId) {
        this.gnMaestrosId = gnMaestrosId;
    }

    public GnValidacionCampos getGnValidacionCamposId() {
        return gnValidacionCamposId;
    }

    public void setGnValidacionCamposId(GnValidacionCampos gnValidacionCamposId) {
        this.gnValidacionCamposId = gnValidacionCamposId;
    }

    @XmlTransient
    public List<GnMaestroRelaciones> getGnMaestroRelacionesList() {
        return gnMaestroRelacionesList;
    }

    public void setGnMaestroRelacionesList(List<GnMaestroRelaciones> gnMaestroRelacionesList) {
        this.gnMaestroRelacionesList = gnMaestroRelacionesList;
    }

    @XmlTransient
    public List<GnMaestroRelaciones> getGnMaestroRelacionesList1() {
        return gnMaestroRelacionesList1;
    }

    public void setGnMaestroRelacionesList1(List<GnMaestroRelaciones> gnMaestroRelacionesList1) {
        this.gnMaestroRelacionesList1 = gnMaestroRelacionesList1;
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
        if (!(object instanceof GnMaestros)) {
            return false;
        }
        GnMaestros other = (GnMaestros) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domiciliosenvia.domicilio.ejb.entidades.GnMaestros[ id=" + id + " ]";
    }
    
}
