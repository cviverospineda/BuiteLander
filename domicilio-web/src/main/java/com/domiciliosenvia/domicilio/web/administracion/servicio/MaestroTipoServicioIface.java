/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domiciliosenvia.domicilio.web.administracion.servicio;

import com.domiciliosenvia.domicilio.web.administracion.bean.MaestroTipoBean;

/**
 *
 * @author rpalacic (SystemTech Integral)
 */
public interface MaestroTipoServicioIface {

    void Accion(MaestroTipoBean bean);
    
    /**
     * Carga inicial de la opción
     * @param bean 
     */
    void cargasInicial(MaestroTipoBean bean);
    
}
