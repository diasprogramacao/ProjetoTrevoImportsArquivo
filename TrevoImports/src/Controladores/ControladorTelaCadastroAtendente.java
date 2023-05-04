package Controladores;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Repositorio.RepositorioAtendente;
import entidades.Atendente;

public class ControladorTelaCadastroAtendente implements ActionListener {
	
	TextField nome;
	TextField cpf;
	TextField setor;
	
	
	
	
	public ControladorTelaCadastroAtendente(TextField nome, TextField cpf, TextField setor) {
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
	}

	public Atendente popularAtendente() {
		Atendente atendente = new Atendente();
		atendente.setNome(nome.getText());
		atendente.setCpf(cpf.getText());
		atendente.setSetor(setor.getText());
		
		return atendente;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		RepositorioAtendente repositorioAtendente = new RepositorioAtendente();
		repositorioAtendente.registrarAtendente(popularAtendente());
		
	}

}
