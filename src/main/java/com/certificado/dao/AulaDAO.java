package com.certificado.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;
import java.util.List;  
import com.certificado.beans.Aula;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class AulaDAO {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	//Salva aula
	public int save(Aula p) {
		String sql = "insert into Aula(idTemplateAula,professor,qtdAlunos,data) " + 
				"values ("+ p.getIdTemplateAula()+ ",'" + p.getProfessor() + "'," + p.getQtdAlunos() + ",'" + 
				p.getData()+"')";

		return template.update(sql);
	}

	//Atualiza aula
	public int update(Aula p) {
		
		String sql = "update Aula set idTemplateAula=" + p.getIdTemplateAula() + ", professor ='"+p.getProfessor() +"', qtdAlunos="+p.getQtdAlunos() +
				",data='"+p.getData() +
				"' where id="+ p.getId()+ "";
		return template.update(sql);
	}
	
	
	//Deleta Aula
	public int delete(int id) {
		String sql = "delete from Aula where id=" + id + "";
		return template.update(sql);
	}
	
	//Pega Aula por id
	public Aula getAulaById(int id) {
		String sql = "select * from Aula where id=?";

		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Aula>(Aula.class));
	}
	
	//Seleciona todas as Aulas de um plano
	public List<Aula> getAulasPlano(String id) {
		return template.query("select * from Aulas where idUsuario = '"+ id +"'", new RowMapper<Aula>() {
			public Aula mapRow(ResultSet rs, int row) throws SQLException {
				Aula e = new Aula();
				
				e.setId(rs.getInt(1));
				e.setIdTemplateAula(rs.getInt(2));
				e.setProfessor(rs.getString(3));
				e.setQtdAlunos(rs.getInt(4));
				e.setData(rs.getString(5));
				
				return e;
			}
		});
	}
	
	//Seleciona todas as Aulas
	public List<Aula> getTodasAulas() {
		return template.query("select * from Aulas ", new RowMapper<Aula>() {
			public Aula mapRow(ResultSet rs, int row) throws SQLException {
				Aula e = new Aula();
				
				e.setId(rs.getInt(1));
				e.setIdTemplateAula(rs.getInt(2));
				e.setProfessor(rs.getString(3));
				e.setQtdAlunos(rs.getInt(4));
				e.setData(rs.getString(5));
				
				return e;
			}
		});
	}
	
}
