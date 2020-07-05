package pe.edu.sunedu.identity.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.sunedu.identity.model.Identity;
import pe.edu.sunedu.identity.service.IdentityService;

@RestController
@RequestMapping("/api/identity")
public class IdentityController {
	
	@Autowired
	private IdentityService identityService;
	
	@GetMapping("/obtener")
	public List <Identity> obtener(){
		return identityService.obtener();
	}
	
	@PostMapping("/obtener-id")
	public Identity findById(@RequestBody Identity identity) {
		return identityService.findById(identity.getCodigo());
	}
	
	@PostMapping("/obtener-codigo")
	public List <Identity> obtenerByCodigo(@RequestBody Identity identity){
		return identityService.obtenerByCodigo(identity.getCodigo());
	}
	
	@PostMapping("/crear")
	public List <Identity> insert(@RequestBody Identity identity) {
		return identityService.insert(identity);
	}
}
