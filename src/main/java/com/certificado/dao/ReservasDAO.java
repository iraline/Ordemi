package com.certificado.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;
import java.util.List;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.certificado.beans.Reservas;

public class ReservasDAO {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	//Cria uma reserva
	public int save(Reservas p) {
		String sql = "insert into Reservas(idUsuario,idAula,participa) " + 
				"values ("+ p.getIdUsuario()+ "," + p.getIdAula() + "," + p.isParticipa() +")";

		return template.update(sql);
	}
	
	//Confirma presenca do usuario em uma aula
	public int confirmaPresenca(Reservas p) {
		
		String sql = "update Reservas set participa=" + p.isParticipa() + "where id="+ p.getId()+ "";
		return template.update(sql);
	}

	//Deleta uma reserva
	public int delete(int id) {
		String sql = "delete from Reservas where id=" + id + "";
		return template.update(sql);
	}
	
	//Lista todas as reservas de um determinado usuario
	public List<Reservas> getReservasByAluno(int id) {
		return template.query("select * from Aula where idUsuario = '"+ id +"'", new RowMapper<Reservas>() {
			public Reservas mapRow(ResultSet rs, int row) throws SQLException {
				Reservas e = new Reservas();
				
				e.setId(rs.getInt(1));
				e.setIdUsuario(rs.getInt(2));
				e.setIdAula(rs.getInt(3));
				e.setParticipa(rs.getBoolean(4));
				
				return e;
			}
		});
	}
	
}
