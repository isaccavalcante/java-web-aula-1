package br.ufc.rc.teste;

import java.util.List;

import br.ufc.rc.DAO.FuncionarioDAO;
import br.ufc.rc.model.Funcionario;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("Isac");
		func.setCargo("Dono ");
		func.setSalario(12000.0);
		
		FuncionarioDAO fd = new FuncionarioDAO();
		
		List<Funcionario> funcionarios = fd.listar();
		
		System.out.println("NOME\tCARGO\tSALARIO");
		for (Funcionario f :funcionarios){
			System.out.println(f.getNome()+"\t"+f.getCargo()+"\t"+f.getSalario());	
		}
		
		fd.inserir(func);
	}

}
