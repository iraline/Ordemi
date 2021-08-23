package com.certificado.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.certificado.beans.TemplateAula;

public class TemplateAulaDAO {

	JdbcTemplate template;
	

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	//Cria um novo template
	public int save(TemplateAula p) {
		String sql = "insert into VerificacaoToken(nome,descricao,plano) " + 
				"values ('" + p.getNome() + "','"+ p.getDescricao() + "','"+ p.getPlano()+ "')";

		return template.update(sql);
	}

	//Atualiza template
	public int update(TemplateAula p) {
			
		String sql = "update TemplateAula set nome ='"+p.getNome() +"', descricao = '"+ p.getDescricao()+"', plano = '"+ p.getPlano()+"' where id = "+p.getId()+ " "; 	
		
		return template.update(sql);
	}
	
	//Pega TemplateAula por id
	public TemplateAula getTemplateAulaById(int id) {
		String sql = "select * from TemplateAula where id=?";

		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<TemplateAula>(TemplateAula.class));
	}
	
	//Deleta um templateAula
		public int delete(int id) {
			String sql = "delete from TemplateAula where id=" + id + "";
			return template.update(sql);
		}
	
	//Pega todos os TemplateAula
	public List<TemplateAula> getAllTemplateAula() {
		return template.query("select * from TemplateAula ", new RowMapper<TemplateAula>() {
			public TemplateAula mapRow(ResultSet rs, int row) throws SQLException {
				TemplateAula e = new TemplateAula();
				
				e.setId(rs.getInt(1));
				e.setNome(rs.getString(2));
				e.setDescricao(rs.getString(3));
				e.setPlano(rs.getString(4));
				
				return e;
			}
		});
	}	
	
}
