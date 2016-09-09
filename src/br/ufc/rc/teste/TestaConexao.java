package br.ufc.rc.teste;

import br.ufc.rc.DAO.ConnectionFactory;

public class TestaConexao {
	
	public static void main(String[] args) {
		ConnectionFactory cf = new ConnectionFactory();
		cf.getConnection();
	}

}
