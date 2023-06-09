package com.domiciliosenvia.domicilio.ejb.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AusCasos.class)
public abstract class AusCasos_ {

	public static volatile SingularAttribute<AusCasos, Integer> maeSolicitudRiesgoVidalId;
	public static volatile SingularAttribute<AusCasos, GnUbicaciones> gnUbicacionesId;
	public static volatile SingularAttribute<AusCasos, Boolean> reabierto;
	public static volatile SingularAttribute<AusCasos, Boolean> multireparto;
	public static volatile SingularAttribute<AusCasos, String> terminalModifica;
	public static volatile ListAttribute<AusCasos, AusSeguimientos> ausSeguimientosList;
	public static volatile SingularAttribute<AusCasos, Integer> maeSolicitudPrioridadId;
	public static volatile SingularAttribute<AusCasos, String> usuarioCrea;
	public static volatile SingularAttribute<AusCasos, Integer> maeSolicitudTipoId;
	public static volatile SingularAttribute<AusCasos, String> terminalCrea;
	public static volatile SingularAttribute<AusCasos, Integer> id;
	public static volatile SingularAttribute<AusCasos, String> maeCanalSupersaludValor;
	public static volatile SingularAttribute<AusCasos, Date> fechaHoraResponsable;
	public static volatile SingularAttribute<AusCasos, GnEmpresas> gnEmpresasId;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudOrigenValor;
	public static volatile SingularAttribute<AusCasos, GnUsuarios> gnUsuariosResponsableId;
	public static volatile SingularAttribute<AusCasos, Date> fechaNotificacion;
	public static volatile SingularAttribute<AusCasos, Short> afiliadoEdad;
	public static volatile SingularAttribute<AusCasos, GnSedes> gnSedesId;
	public static volatile SingularAttribute<AusCasos, Integer> maeCanalSupersaludId;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudEnteControValor;
	public static volatile SingularAttribute<AusCasos, Boolean> accionanteEdad;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudEstadoValor;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudOrigenCodigo;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudTipoCodigo;
	public static volatile SingularAttribute<AusCasos, String> parentesco;
	public static volatile SingularAttribute<AusCasos, Integer> maeSolicitudOrigenId;
	public static volatile SingularAttribute<AusCasos, Boolean> falloTutela;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudRiesgoVidalCodigo;
	public static volatile SingularAttribute<AusCasos, AusPersonas> ausPersonasId;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudPrioridadValor;
	public static volatile SingularAttribute<AusCasos, String> usuarioModifica;
	public static volatile SingularAttribute<AusCasos, String> radicado;
	public static volatile SingularAttribute<AusCasos, String> multiusuario;
	public static volatile SingularAttribute<AusCasos, Integer> maeSolicitudEnteControlId;
	public static volatile SingularAttribute<AusCasos, Boolean> instruccion;
	public static volatile SingularAttribute<AusCasos, String> maeCanalSupersaludCodigo;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudEnteControlCodigo;
	public static volatile SingularAttribute<AusCasos, AusPersonas> ausAccionantePersonasId;
	public static volatile SingularAttribute<AusCasos, Date> fechaHoraCrea;
	public static volatile SingularAttribute<AusCasos, Boolean> redireccionado;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudPrioridadCodigo;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudTipoValor;
	public static volatile SingularAttribute<AusCasos, Date> fechaVencimiento;
	public static volatile SingularAttribute<AusCasos, Date> fechaCiere;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudRiesgoVidalValor;
	public static volatile SingularAttribute<AusCasos, String> maeSolicitudEstadoCodigo;
	public static volatile SingularAttribute<AusCasos, Boolean> pertinencia;
	public static volatile SingularAttribute<AusCasos, Date> fechaHoraModifica;
	public static volatile SingularAttribute<AusCasos, Integer> maeSolicitudEstadoId;

	public static final String MAE_SOLICITUD_RIESGO_VIDAL_ID = "maeSolicitudRiesgoVidalId";
	public static final String GN_UBICACIONES_ID = "gnUbicacionesId";
	public static final String REABIERTO = "reabierto";
	public static final String MULTIREPARTO = "multireparto";
	public static final String TERMINAL_MODIFICA = "terminalModifica";
	public static final String AUS_SEGUIMIENTOS_LIST = "ausSeguimientosList";
	public static final String MAE_SOLICITUD_PRIORIDAD_ID = "maeSolicitudPrioridadId";
	public static final String USUARIO_CREA = "usuarioCrea";
	public static final String MAE_SOLICITUD_TIPO_ID = "maeSolicitudTipoId";
	public static final String TERMINAL_CREA = "terminalCrea";
	public static final String ID = "id";
	public static final String MAE_CANAL_SUPERSALUD_VALOR = "maeCanalSupersaludValor";
	public static final String FECHA_HORA_RESPONSABLE = "fechaHoraResponsable";
	public static final String GN_EMPRESAS_ID = "gnEmpresasId";
	public static final String MAE_SOLICITUD_ORIGEN_VALOR = "maeSolicitudOrigenValor";
	public static final String GN_USUARIOS_RESPONSABLE_ID = "gnUsuariosResponsableId";
	public static final String FECHA_NOTIFICACION = "fechaNotificacion";
	public static final String AFILIADO_EDAD = "afiliadoEdad";
	public static final String GN_SEDES_ID = "gnSedesId";
	public static final String MAE_CANAL_SUPERSALUD_ID = "maeCanalSupersaludId";
	public static final String MAE_SOLICITUD_ENTE_CONTRO_VALOR = "maeSolicitudEnteControValor";
	public static final String ACCIONANTE_EDAD = "accionanteEdad";
	public static final String MAE_SOLICITUD_ESTADO_VALOR = "maeSolicitudEstadoValor";
	public static final String MAE_SOLICITUD_ORIGEN_CODIGO = "maeSolicitudOrigenCodigo";
	public static final String MAE_SOLICITUD_TIPO_CODIGO = "maeSolicitudTipoCodigo";
	public static final String PARENTESCO = "parentesco";
	public static final String MAE_SOLICITUD_ORIGEN_ID = "maeSolicitudOrigenId";
	public static final String FALLO_TUTELA = "falloTutela";
	public static final String MAE_SOLICITUD_RIESGO_VIDAL_CODIGO = "maeSolicitudRiesgoVidalCodigo";
	public static final String AUS_PERSONAS_ID = "ausPersonasId";
	public static final String MAE_SOLICITUD_PRIORIDAD_VALOR = "maeSolicitudPrioridadValor";
	public static final String USUARIO_MODIFICA = "usuarioModifica";
	public static final String RADICADO = "radicado";
	public static final String MULTIUSUARIO = "multiusuario";
	public static final String MAE_SOLICITUD_ENTE_CONTROL_ID = "maeSolicitudEnteControlId";
	public static final String INSTRUCCION = "instruccion";
	public static final String MAE_CANAL_SUPERSALUD_CODIGO = "maeCanalSupersaludCodigo";
	public static final String MAE_SOLICITUD_ENTE_CONTROL_CODIGO = "maeSolicitudEnteControlCodigo";
	public static final String AUS_ACCIONANTE_PERSONAS_ID = "ausAccionantePersonasId";
	public static final String FECHA_HORA_CREA = "fechaHoraCrea";
	public static final String REDIRECCIONADO = "redireccionado";
	public static final String MAE_SOLICITUD_PRIORIDAD_CODIGO = "maeSolicitudPrioridadCodigo";
	public static final String MAE_SOLICITUD_TIPO_VALOR = "maeSolicitudTipoValor";
	public static final String FECHA_VENCIMIENTO = "fechaVencimiento";
	public static final String FECHA_CIERE = "fechaCiere";
	public static final String MAE_SOLICITUD_RIESGO_VIDAL_VALOR = "maeSolicitudRiesgoVidalValor";
	public static final String MAE_SOLICITUD_ESTADO_CODIGO = "maeSolicitudEstadoCodigo";
	public static final String PERTINENCIA = "pertinencia";
	public static final String FECHA_HORA_MODIFICA = "fechaHoraModifica";
	public static final String MAE_SOLICITUD_ESTADO_ID = "maeSolicitudEstadoId";

}

