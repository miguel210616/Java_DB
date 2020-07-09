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
import pe.edu.sunedu.identity.model.IdentityUniversity;
import pe.edu.sunedu.identity.model.University;

@Repository
public class IdentityDaoImp implements IdentityDao{
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Identity> obtener() {
		 return jdbcTemplate.query("SELECT cod_trami,cod_uni, nombre_univ, tipo_gestion, dept_fili, nom_fili, cod_pro_clas, nomb_pro, anio_periodo, cant_carnes\r\n" + 
		 		"FROM tramite_carne\r\n" + 
		 		"JOIN universidad ON(cod_uni=codi_uni)", new IdentityRowMapper());
	}
	
	
	class IdentityRowMapper implements RowMapper <Identity> {
        @Override
        public Identity mapRow(ResultSet rs, int rowNum) throws SQLException {
        	Identity identity = new Identity();
        	identity.setCodTramite(rs.getString("cod_trami"));
        	identity.setCodigoUni(rs.getString("cod_uni"));
        	identity.setNombreUniversidad(rs.getString("nombre_univ"));
        	identity.setTiposGestion(rs.getString("tipo_gestion"));
        	identity.setDepFilial(rs.getString("dept_fili"));
        	identity.setNomFilial(rs.getString("nom_fili"));
        	identity.setCodProgramaClase(rs.getString("cod_pro_clas"));
        	identity.setNomPrograma(rs.getString("nomb_pro"));
        	identity.setAnio(rs.getString("anio_periodo"));
        	identity.setCantCarnes(rs.getInt("cant_carnes"));
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
	
//    public int insert(Identity identity) {
//        return jdbcTemplate.update("insert into carne_universitario (codigo, nombre_universidad, tipos_gestion) " + "values(?, ?, ?)",
//            new Object[] {
//            		identity.getCodigo(), identity.getNombreUniversidad(), identity.getTiposGestion()
//            });
//    }
//
//    public int update(Carne employee) {
//        return jdbcTemplate.update("update carne_universitario " + " set nombre_universidad = ?, tipos_gestion = ?, departamento_filial = ? " + " where codigo = ?",
//            new Object[] {
//            		employee.getNombre(), employee.getApellido(), employee.getCorreo(),employee.getId()
//            });
//    }
	
	@Override
	public List<University> obtenerUniversity() {
		 return jdbcTemplate.query("SELECT cod_uni, nombre_univ,tipo_gestion,count(cant_carnes) AS \"num_tramites\"\r\n" + 
		 		"FROM tramite_carne JOIN universidad ON (codi_uni=cod_uni)\r\n" + 
		 		"GROUP BY nombre_univ", new UniversityRowMapper());
	}
	
	
	class UniversityRowMapper implements RowMapper <University> {
        @Override
        public University mapRow(ResultSet rs, int rowNum) throws SQLException {
        	University university = new University();
        	university.setCodigo(rs.getString("cod_uni"));
        	university.setNombreUniversidad(rs.getString("nombre_univ"));
        	university.setTipoGestion(rs.getString("tipo_gestion"));
        	university.setCantidad(rs.getInt("num_tramites"));
            return university;
        }
    }
	
	@Override
	public List<IdentityUniversity> obtenerIdentityUniversity() {
		 return jdbcTemplate.query("select codi_uni, nombre_univ, nom_clas_prog , count(nomb_pro),sum(cant_carnes)\r\n" + 
		 		"from tramite_carne JOIN universidad ON (codi_uni=cod_uni)\r\n" + 
		 		"JOIN clase_prog ON (cod_pro_clas=cod_clas_prog)\r\n" + 
		 		"GROUP BY codi_uni, nombre_univ, nom_clas_prog", new IdentityUniversityRowMapper());
	}
	
	
	class IdentityUniversityRowMapper implements RowMapper <IdentityUniversity> {
        @Override
        public IdentityUniversity mapRow(ResultSet rs, int rowNum) throws SQLException {
        	IdentityUniversity identityUniversity = new IdentityUniversity();
        	identityUniversity.setCodigo(rs.getString("codi_uni"));
        	identityUniversity.setNombreUniversidad(rs.getString("nombre_univ"));
        	identityUniversity.setNombreFacultad(rs.getString("nom_clas_prog"));
        	identityUniversity.setCantidad(rs.getInt("count(nomb_pro)"));
        	identityUniversity.setTramites(rs.getInt("sum(cant_carnes)"));

            return identityUniversity;
        }
    }

	@Override
	public int insert(Identity identity) {
		// TODO Auto-generated method stub
		return 0;
	}

}
