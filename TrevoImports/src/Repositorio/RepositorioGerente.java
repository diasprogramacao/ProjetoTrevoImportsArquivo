package Repositorio;

import GerenciadorArquivo.GerenciadorArquivo;
import entidades.Gerente;

public class RepositorioGerente implements InterfaceGerente {

	@Override
	public boolean registrarGerente(Gerente gerente) {
		
		boolean resposta;
		
		GerenciadorArquivo gerenciadorArquivo = new GerenciadorArquivo();
		
		resposta = gerenciadorArquivo.registroDadosGerenteArquivo(gerente);
		
		return resposta;		
		
	}

}
