package pe.edu.sunedu.identity.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.sunedu.identity.model.Identity;
import pe.edu.sunedu.identity.model.IdentityUniversity;
import pe.edu.sunedu.identity.model.University;

public interface IdentityDao {
	
	public List<Identity> obtener();
	
	public Optional<Identity> findById(String codigo);
	
	public List<Identity> obtenerByCodigo(String codigo);
	
	public int insert(Identity identity);
	
	public List<University> obtenerUniversity();
	
	public List<IdentityUniversity> obtenerIdentityUniversity();

}
