/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domiciliosenvia.domicilio.web.administracion.servicio;

import com.domiciliosenvia.domicilio.dominio.administracion.Maestro;
import com.domiciliosenvia.domicilio.web.administracion.bean.UbicacionBean;
import com.domiciliosenvia.domicilio.dominio.administracion.Ubicacion;
import java.util.List;

/**
 *
 * @author raul-palacios
 */
public interface UbicacionServicioIface {
    void Accion(UbicacionBean bean);

    void cargarPadreTipo(UbicacionBean bean);
    
    public Ubicacion objetoConverter(Ubicacion obj);
    
    /**
     * Cargar lista de ubicaciones
     * @param bean 
     */
    void cargaInicial(UbicacionBean bean);
    
//    /**
//     * Cargar lista de regiones
//     * @return
//     * @throws Exception 
//     */
//    List<Maestro> cargaRegiones() throws Exception;
}
