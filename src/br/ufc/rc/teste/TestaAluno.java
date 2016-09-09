package br.ufc.rc.teste;

import java.util.List;

import br.ufc.rc.DAO.AlunoDAO;
import br.ufc.rc.model.Aluno;

public class TestaAluno {
	
	public static void main(String[] args) {
		
		
		
		AlunoDAO ad = new AlunoDAO();
		
		List<Aluno> alunos = ad.listar();
		
		System.out.println("ID\tNOME\tEMAIL\tIRA");
		
		for (Aluno a: alunos){
			System.out.println(a.getId()+"\t"+a.getNome()+"\t"+a.getEmail());
		}
		
		}
}
