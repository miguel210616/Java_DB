package pe.edu.sunedu.identity.model;

import java.io.Serializable;

public class Identity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5583334291188258880L;
	private String codigo;
	private String nombreUniversidad;
	private String tiposGestion;
	
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
	public String getTiposGestion() {
		return tiposGestion;
	}
	public void setTiposGestion(String tiposGestion) {
		this.tiposGestion = tiposGestion;
	}
	
}
