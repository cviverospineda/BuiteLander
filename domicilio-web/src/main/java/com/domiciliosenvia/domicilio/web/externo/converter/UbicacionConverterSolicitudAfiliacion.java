/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domiciliosenvia.domicilio.web.externo.converter;
import com.domiciliosenvia.domicilio.dominio.administracion.Ubicacion;
//import com.saviasaludeps.savia.web.externo.bean.SolicitudAfiliacionBean;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author ripalacios
 */
@FacesConverter("ubicacionConverterSolicitudAfiliacion")
public class UbicacionConverterSolicitudAfiliacion implements Converter {

    @Override
    public Ubicacion getAsObject(FacesContext context, UIComponent component, String value) {
        Ubicacion obj = null;
        if(value != null && value.trim().length() > 0) {
//            try {
//                Map<String, Object> viewMap = FacesContext.getCurrentInstance().getViewRoot().getViewMap();
//                SolicitudAfiliacionBean service = (SolicitudAfiliacionBean) viewMap.get("solicitudAfiliacionBean");
//                for(Ubicacion _obj : service.getUbicaciones()){
//                    if(Integer.parseInt(value) == _obj.getId()){
//                        obj = _obj;
//                        break;
//                    }
//                }
//            } catch(NumberFormatException e) {
////                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de Conversión", "Ubicación Inválida."));
//            }
        }else {
            return null;
        }
        return obj;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value != null) {
            return String.valueOf(((Ubicacion) value).getId());
        }else {
            return null;
        }
    }
    
}
