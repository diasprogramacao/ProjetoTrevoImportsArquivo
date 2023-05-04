package Controladores;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Repositorio.RepositorioGerente;
import entidades.Gerente;

public class ControladorTelaCadastroGerente implements ActionListener {
	
	TextField nomeGerente;
	TextField cpfGerente;
	TextField gerencia;

	RepositorioGerente repositorioGerente = new RepositorioGerente();

	public ControladorTelaCadastroGerente(TextField nomeGerente, TextField cpfGerente, TextField gerencia) {
		this.nomeGerente = nomeGerente;
		this.cpfGerente = cpfGerente;
		this.gerencia = gerencia;
	}

	public Gerente GerenteReceberDados () {
		
		Gerente  gerente = new Gerente();
		
		gerente.setNome(nomeGerente.getText());
		gerente.setCpf(cpfGerente.getText());
		gerente.setGerencia(gerencia.getText());
		
		return gerente;
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		repositorioGerente.registrarGerente(GerenteReceberDados());
				
		
	}
	

}
