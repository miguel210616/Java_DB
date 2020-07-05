package pe.edu.sunedu.identity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.sunedu.identity.dao.IdentityDao;
import pe.edu.sunedu.identity.model.Identity;

@Service
public class IdentityServiceImp implements IdentityService{

	@Autowired
	private IdentityDao identityDao;
	
	@Override
	public List<Identity> obtener() {
		return identityDao.obtener();
	}

	@Override
	public Identity findById(String codigo) {
		return identityDao.findById(codigo).get();
	}

	@Override
	public List<Identity> obtenerByCodigo(String codigo) {
		return identityDao.obtenerByCodigo(codigo);
	}

	@Override
	public List<Identity> insert(Identity identity) {
		identityDao.insert(identity);
		return identityDao.obtenerByCodigo(identity.getCodigo());
	}
	
	
}
