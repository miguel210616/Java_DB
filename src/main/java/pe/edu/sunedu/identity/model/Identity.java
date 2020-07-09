package pe.edu.sunedu.identity.model;

import java.io.Serializable;

public class Identity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5583334291188258880L;
	private String codTramite;
	private String codigoUni;
	private String nombreUniversidad;
	private String tiposGestion;
	private String depFilial;
	private String nomFilial;
	private String codProgramaClase;
	private String nomPrograma;
	private String anio;
	private int cantCarnes;
	
	public String getCodTramite() {
		return codTramite;
	}
	public void setCodTramite(String codTramite) {
		this.codTramite = codTramite;
	}
	public String getCodigoUni() {
		return codigoUni;
	}
	public void setCodigoUni(String codigoUni) {
		this.codigoUni = codigoUni;
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
	public String getDepFilial() {
		return depFilial;
	}
	public void setDepFilial(String depFilial) {
		this.depFilial = depFilial;
	}
	public String getNomFilial() {
		return nomFilial;
	}
	public void setNomFilial(String nomFilial) {
		this.nomFilial = nomFilial;
	}
	public String getCodProgramaClase() {
		return codProgramaClase;
	}
	public void setCodProgramaClase(String codProgramaClase) {
		this.codProgramaClase = codProgramaClase;
	}
	public String getNomPrograma() {
		return nomPrograma;
	}
	public void setNomPrograma(String nomPrograma) {
		this.nomPrograma = nomPrograma;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public int getCantCarnes() {
		return cantCarnes;
	}
	public void setCantCarnes(int cantCarnes) {
		this.cantCarnes = cantCarnes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
