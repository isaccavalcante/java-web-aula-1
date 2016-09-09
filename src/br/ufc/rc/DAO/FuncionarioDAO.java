package br.ufc.rc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufc.rc.model.Funcionario;

public class FuncionarioDAO {
	
	private ConnectionFactory cf;
	
	public FuncionarioDAO(){
		this.cf =  new ConnectionFactory();
	}
	
	public void inserir(Funcionario f){
		
		Connection c =this.cf.getConnection();
		String sql = "insert into funcionarios (nome, cargo, salario) values (?, ?, ?)";
		
		
		try {
			PreparedStatement p = c.prepareStatement(sql);
			
			p.setString(1, f.getNome());
			p.setString(2, f.getCargo());
			p.setDouble(3, f.getSalario());
			
			p.execute();
			p.close();
			c.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	public List<Funcionario> listar(){
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		String sql = "select * from funcionarios";
		
		Connection c = this.cf.getConnection();
		try {
			PreparedStatement p = c.prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			
			while (rs.next()){
				
				Funcionario f = new Funcionario();
				
				f.setId(rs.getLong("id"));
				f.setNome(rs.getString("nome"));
				f.setCargo(rs.getString("cargo"));
				f.setSalario(rs.getDouble("salario"));
							
				funcionarios.add(f);
				
			}
			
			p.close();
			c.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return funcionarios;
	}

}
