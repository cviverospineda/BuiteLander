package com.domiciliosenvia.domicilio.dominio.administracion;

import com.domiciliosenvia.domicilio.dominio.generico.Auditoria;

/**
 *
 * @author rpalacic
 */
public class Ubicacion extends Auditoria{
    
    public static final int TIPO_NINGUNO = 0;
    public static final int TIPO_PAIS = 1;
    public static final int TIPO_DEPARTAMENTO = 2;
    public static final int TIPO_MUNICIPIO = 3;
    public static final int TIPO_ZONA = 4;
    
    private Ubicacion ubicacionPadre = null;
    private Integer id;
    private int tipo = Ubicacion.TIPO_NINGUNO;
    private String nombre = "";
    private String coordenadas = "";
    private String descripcion = "";
    // 2020-05-18 se adicionan campos requeridos por el proyecto de Aseguramiento - afiliaciones
    private String prefijo = "";
    private Integer maeRegionId;
    private String maeRegionCodigo;
    private String maeRegionValor;
    
    public Ubicacion() {
    }
    
    public Ubicacion(Integer id) {
        this.id = id;
    }
    
    public Ubicacion(Ubicacion padre, Integer id, int tipo, String codigo, String nombre) {
        this.ubicacionPadre = padre;
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public Ubicacion getUbicacionPadre() {
        return ubicacionPadre;
    }

    public void setUbicacionPadre(Ubicacion ubicacionPadre) {
        this.ubicacionPadre = ubicacionPadre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }
    
    public static String getTipoStr(int _tipo) {
        String _str = "";
        switch(_tipo){
            case TIPO_PAIS:
                _str = "País";
                break;
            case TIPO_DEPARTAMENTO:
                _str = "Departamento";
                break;
            case TIPO_MUNICIPIO:
                _str = "Municipio";
                break;
            case TIPO_ZONA:
                _str = "Zona";
                break;
        }
        return _str;
    }
    
    public String getTipoStr() {
        switch(tipo){
            case Ubicacion.TIPO_PAIS:
                return "País";
            case Ubicacion.TIPO_DEPARTAMENTO:
                return "Departamento";
            case Ubicacion.TIPO_MUNICIPIO:
                return "Municipio";
            case Ubicacion.TIPO_ZONA:
                return "Zona";
            default:
                return "";
        }
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "ubicacionPadre=" + ubicacionPadre + ", id=" + id + ", tipo=" + getTipoStr() + ", nombre=" + nombre + ", coordenadas=" + coordenadas + ", descripcion=" + descripcion + '}';
    }

    /**
     * @return the divipola
     */
    public String getPrefijo() {
        return prefijo;
    }
    
    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public Integer getMaeRegionId() {
        return maeRegionId;
    }

    public void setMaeRegionId(Integer maeRegionId) {
        this.maeRegionId = maeRegionId;
    }

    public String getMaeRegionCodigo() {
        return maeRegionCodigo;
    }

    public void setMaeRegionCodigo(String maeRegionCodigo) {
        this.maeRegionCodigo = maeRegionCodigo;
    }

    public String getMaeRegionValor() {
        return maeRegionValor;
    }

    public void setMaeRegionValor(String maeRegionValor) {
        this.maeRegionValor = maeRegionValor;
    }
    
}
