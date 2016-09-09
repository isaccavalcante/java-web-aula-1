package br.ufc.rc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufc.rc.model.Aluno;

public class AlunoDAO {
	
	private ConnectionFactory cf;
	
	public  AlunoDAO(){
		this.cf =  new ConnectionFactory();
	}
	
	public void inserir(Aluno a){
		Connection c = this.cf.getConnection();
		String sql = "insert into alunos (nome, email, ira) values (?,?,?)";
		
		try {
			PreparedStatement p = c.prepareStatement(sql);
			p.setString(1, a.getNome());
			p.setString(2, a.getEmail());
			p.setDouble(3, a.getIra());
			
			p.execute();
			p.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


		
		
	
	
	public List<Aluno> listar(){
		
		
		Connection c = this.cf.getConnection();
		
		String sql = "select * from alunos";
		
		List<Aluno> lista =  new ArrayList<Aluno>();
		
		try {
			PreparedStatement p = c.prepareStatement(sql);
			
			List<Aluno> alunos = new ArrayList<Aluno>();
			
			ResultSet rs = p.executeQuery();
			
			while (rs.next()){
				Aluno a = new Aluno();
				a.setId(rs.getLong("id"));
				a.setNome(rs.getString("nome"));
				a.setEmail(rs.getString("email"));
				a.setIra(rs.getDouble("ira"));
				
				lista.add(a);
				
			}
			return lista;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
}
