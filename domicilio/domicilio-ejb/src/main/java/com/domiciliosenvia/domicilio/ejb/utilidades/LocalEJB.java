/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domiciliosenvia.domicilio.ejb.utilidades;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author rpalacic (SystemTech Integral)
 */
public class LocalEJB {

    public static Object getEJBRemoto(String nameEjb, String iface) throws Exception {
        Object object = null;
        try {
            Properties props = new Properties();
            props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");            
//            props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
//            props.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:7070");
//            props.put(Context.SECURITY_PRINCIPAL, "savia");
//            props.put(Context.SECURITY_CREDENTIALS, "savia");
//            props.put("jboss.naming.client.ejb.context", true);
            Context context = new InitialContext(props);
            String preContext = "ejb:savia-ear/savia-ejb-1.0-SNAPSHOT//";
            String nombre = preContext + nameEjb + "!" + iface;
            object = context.lookup(nombre);
        } catch (NamingException ex) {
            throw new Exception("It was not possible to connect to the remote EJB " + nameEjb);        
        } catch (Exception ex) {
            throw new Exception("It was not possible to connect to the remote EJB " + nameEjb);
        }
        return object;
    }

//    public static Object getEJBComunicacionRemoto(String nameEjb, String iface) throws Exception {
//        try {
//            Context context;
//            Properties props = new Properties();
//            props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
//            String preContext = "ejb:comunicacion-ear/comunicacion-ejb-1.0-SNAPSHOT//";
//            context = new InitialContext(props);
//            return context.lookup(preContext + nameEjb + "!" + iface);
//        } catch (NamingException ex) {
//            throw new Exception("It was not possible to connect to the remote EJB " + nameEjb);
//        } catch (Exception ex) {
//            throw new Exception("It was not possible to connect to the remote EJB " + nameEjb);
//        }
//    }
    
}
