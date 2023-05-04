package Repositorio;

import GerenciadorArquivo.GerenciadorArquivo;
import entidades.Atendente;

public class RepositorioAtendente implements InterfaceAtendente {

	@Override
	public boolean registrarAtendente(Atendente atendente) {
		
		boolean resultado;
		GerenciadorArquivo gerenciadorArquivo = new GerenciadorArquivo();
		resultado = gerenciadorArquivo.registroDadosAtendenteArquivo(atendente);  
		
		return resultado;
	}
	

}
