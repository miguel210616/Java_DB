package pe.edu.sunedu.identity.model;

import java.io.Serializable;

public class University implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigo;
	private String nombreUniversidad;
	private String tipoGestion;
	private Integer cantidad;
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
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getTipoGestion() {
		return tipoGestion;
	}
	public void setTipoGestion(String tipoGestion) {
		this.tipoGestion = tipoGestion;
	}
	

}
