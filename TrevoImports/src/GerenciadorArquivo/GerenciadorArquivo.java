package GerenciadorArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entidades.Atendente;
import entidades.Gerente;

public class GerenciadorArquivo {
	
	
public boolean registroDadosAtendenteArquivo(Atendente atendente) {
		
	boolean resposta;	
	String caminhoArquivo = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-19-04-2023\\Arquivos\\Atendente" ;
		
		try {
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(caminhoArquivo));
			buWriter.newLine();
			buWriter.append("Nome:  " + atendente.getNome());
			buWriter.newLine();
			buWriter.append("Cpf:  " + atendente.getCpf());
			buWriter.newLine();
			buWriter.append("Gerência:  " + atendente.getSetor());
			buWriter.newLine();
			buWriter.close();
			
			resposta = true;
			
			return resposta;
			
		} catch (IOException e1) {
			
			System.out.println("Não está sendo possível acessar o caminho do arquivo");
			
            resposta = false;
			
			return resposta;
		}
	}

public boolean registroDadosGerenteArquivo(Gerente gerente) {
	
	boolean resposta;	
	String caminhoArquivo = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-19-04-2023\\Arquivos\\Gerente" ;
		
		try {
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(caminhoArquivo));
			buWriter.append("Nome:  " + gerente.getNome());
			buWriter.newLine();
			buWriter.append("Cpf:  " + gerente.getCpf());
			buWriter.newLine();
			buWriter.append("Gerência:  " + gerente.getGerecia());
			buWriter.newLine();
			buWriter.close();
			
			resposta = true;
			
			return resposta;
			
		} catch (IOException e1) {
			
			System.out.println("Não está sendo possível acessar o caminho do arquivo");
			
            resposta = false;
			
			return resposta;
		}
	}

}
