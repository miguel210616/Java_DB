package pe.edu.sunedu.identity.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import pe.edu.sunedu.identity.model.Identity;

@Repository
public class IdentityDaoImp implements IdentityDao{
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Identity> obtener() {
		 return jdbcTemplate.query("select * from carne_universitario", new IdentityRowMapper());
	}
	
	
	class IdentityRowMapper implements RowMapper <Identity> {
        @Override
        public Identity mapRow(ResultSet rs, int rowNum) throws SQLException {
        	Identity identity = new Identity();
        	identity.setCodigo(rs.getString("codigo"));
        	identity.setNombreUniversidad(rs.getString("nombre_universidad"));
        	identity.setTiposGestion(rs.getString("tipos_gestion"));
            return identity;
        }
    }
	
	public Optional<Identity> findById(String codigo) {
        return Optional.of(
        		jdbcTemplate.queryForObject(
        				"select codigo, nombre_universidad as nombreUniversidad, tipos_gestion as tiposGestion from carne_universitario where codigo=?", 
        				new Object[] {
        							codigo
        				},
        				new BeanPropertyRowMapper<Identity>(Identity.class)
        				)
        		);
    }

	public List<Identity> obtenerByCodigo(String codigo) {
		 return jdbcTemplate.query(
				 "select * from carne_universitario where codigo=?",
				 new Object[] {
						 codigo
				 },
				 new IdentityRowMapper()
				 );
	}
	
	
//    public int deleteById(String id) {
//        return jdbcTemplate.update("delete from carne_universitario where codigo=?", new Object[] {
//            id
//        });
//    }
//
	
    public int insert(Identity identity) {
        return jdbcTemplate.update("insert into carne_universitario (codigo, nombre_universidad, tipos_gestion) " + "values(?, ?, ?)",
            new Object[] {
            		identity.getCodigo(), identity.getNombreUniversidad(), identity.getTiposGestion()
            });
    }
//
//    public int update(Carne employee) {
//        return jdbcTemplate.update("update carne_universitario " + " set nombre_universidad = ?, tipos_gestion = ?, departamento_filial = ? " + " where codigo = ?",
//            new Object[] {
//            		employee.getNombre(), employee.getApellido(), employee.getCorreo(),employee.getId()
//            });
//    }
	

}
