package pe.edu.sunedu.identity.service;

import java.util.List;

import pe.edu.sunedu.identity.model.Identity;
import pe.edu.sunedu.identity.model.IdentityUniversity;
import pe.edu.sunedu.identity.model.University;

public interface IdentityService {
	
	public List <Identity> obtener();
	
	public Identity findById(String codigo);
	
	public List <Identity> obtenerByCodigo(String codigo);
	
	public List <Identity> insert(Identity identity);

	public List<University> obtenerUniversity();
	
	public List<IdentityUniversity> obtenerIdentityUniversity();

}
