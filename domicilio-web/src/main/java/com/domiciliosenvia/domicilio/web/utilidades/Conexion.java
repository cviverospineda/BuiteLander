/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domiciliosenvia.domicilio.web.utilidades;

import com.domiciliosenvia.domicilio.dominio.administracion.Empresa;
import com.domiciliosenvia.domicilio.dominio.administracion.Modulo;
import com.domiciliosenvia.domicilio.dominio.administracion.Usuario;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author raul-palacios
 */
public class Conexion extends Url{
    private Usuario usuario = new Usuario();
    private Empresa empresa = new Empresa();
    private String ip = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getRemoteAddr();
    private GregorianCalendar fechaHoraConexion = null;
    private boolean conectado = false;
    private MenuModel menuModel;
    private List<Modulo> modulos = new ArrayList();
    private List<Empresa> empresas = new ArrayList();
//    private List<

    public Usuario getUsuario() {
        if(usuario==null)usuario=new Usuario();
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public GregorianCalendar getFechaHoraConexion() {
        return fechaHoraConexion;
    }
    public void setFechaHoraConexion(GregorianCalendar fechaHoraConexion) {
        this.fechaHoraConexion = fechaHoraConexion;
    }

    public boolean isConectado() {
        return conectado;
    }
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public MenuModel getMenuModel() {
        return menuModel;
    }
    public void setMenuModel(MenuModel menuModel) {
        this.menuModel = menuModel;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }
    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }
    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }
    
}
