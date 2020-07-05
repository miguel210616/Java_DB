package pe.edu.sunedu.identity.model;

import java.io.Serializable;

public class IdentityUniversity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -224953631297999098L;
	private String codigo;
	private String nombreUniversidad;
	private String nombreFacultad;
	private Integer cantidad;
	private Integer tramites;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombreUniversidad() {
		return nombreUniversidad;
	}
	public void setNombreUniversidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}
	public String getNombreFacultad() {
		return nombreFacultad;
	}
	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getTramites() {
		return tramites;
	}
	public void setTramites(Integer tramites) {
		this.tramites = tramites;
	}
	
	

}
