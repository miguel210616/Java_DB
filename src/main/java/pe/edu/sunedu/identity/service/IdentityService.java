package pe.edu.sunedu.identity.service;

import java.util.List;

import pe.edu.sunedu.identity.model.Identity;

public interface IdentityService {
	
	public List <Identity> obtener();
	
	public Identity findById(String codigo);
	
	public List <Identity> obtenerByCodigo(String codigo);
	
	public List <Identity> insert(Identity identity);


}
