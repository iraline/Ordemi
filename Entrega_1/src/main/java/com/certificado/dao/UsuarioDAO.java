package com.certificado.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.certificado.beans.Usuario;


public class UsuarioDAO {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	//Cria um novo usuario
	public int save(Usuario p) {
		String sql = "insert into Usuario(nome,email,plano) " + "values ('" + p.getNome() + ",'"
				+ p.getEmail() + "','" + p.getPlano() + "')";

		return template.update(sql);
	}

	//Atualiza usuario, menos o e-mail
	public int update(Usuario p) {

		String sql = "update Usuario set nome='" + p.getNome() + "', plano='" + p.getPlano()
				+ "' where id=" + p.getId() + "";
		return template.update(sql);
	}

	//Deleta o usuario pelo id
	public int delete(int id) {
		String sql = "delete from Usuario where id=" + id + "";
		return template.update(sql);
	}
	
	//Deleta o usuario pelo e-mail
	public int deleteByEmail(String id) {
		String sql = "delete from Usuario where email='" + id + "'";
		return template.update(sql);
		
	}

	//Seleciona o usuario pelo id
	public Usuario getUsuarioByid(int id) {
		String sql = "select * from Usuario where id=?";
		return template.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	//Seleciona o usuario pelo email
	public Usuario getUsuarioByEmail(String id) {
		String sql = "select * from Usuario where email=?";
		return template.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	//Pega lista de todos os usuarios
	public List<Usuario> getAllUsuario() {
		return template.query("select * from Usuario", new RowMapper<Usuario>() {
			public Usuario mapRow(ResultSet rs, int row) throws SQLException {
				
				Usuario e = new Usuario();
				
				e.setId(rs.getInt(1));
				e.setNome(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPlano(rs.getString(4));
				
				return e;
			}
		});
	}
	
	public boolean checkLogin(Usuario usuario) {

		String a = usuario.getEmail();
		
		String sql = "SELECT * from Usuario WHERE email='" + a + "' ";

		try {		
			Usuario asdf = template.queryForObject(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));

			return true;

		} catch (Exception e) {	
			return false;
		}
	}

}
