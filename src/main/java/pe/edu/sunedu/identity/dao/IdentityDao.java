package pe.edu.sunedu.identity.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.sunedu.identity.model.Identity;

public interface IdentityDao {
	
	public List<Identity> obtener();
	
	public Optional<Identity> findById(String codigo);
	
	public List<Identity> obtenerByCodigo(String codigo);
	
	public int insert(Identity identity);

}
