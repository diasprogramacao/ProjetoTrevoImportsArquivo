package Telas;

import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controladores.ControladorTelaCadastroGerente;

public class TelaCadastroGerente {
	
	public void CadastroGerente() {
		
		String opcao01 = "Nome"; 
		String opcao02 = "Cpf";
		String opcao03 = "Gerência";
		
		GridLayout grid = new GridLayout (0,1);
		
		JFrame  frameCadastroGerente = new JFrame();
		frameCadastroGerente.setSize(300,300);
		frameCadastroGerente.setTitle("Cadastro Gerente ");
		
		JPanel painelCadastroGerente = new JPanel();
		painelCadastroGerente.setLayout(grid);
		
		JLabel TextoOpcao1 = new JLabel(opcao01);
		painelCadastroGerente.add(TextoOpcao1);
		
		TextField textoResposta01 = new TextField (10);
		painelCadastroGerente.add(textoResposta01);
		
		JLabel TextoOpcao2 = new JLabel(opcao02);
		painelCadastroGerente.add(TextoOpcao2);
		
		TextField textoResposta02 = new TextField (10);
		painelCadastroGerente.add(textoResposta02);
		
		JLabel TextoOpcao3 = new JLabel(opcao03);
		painelCadastroGerente.add(TextoOpcao3);
		
		TextField textoResposta03 = new TextField (10);
		painelCadastroGerente.add(textoResposta03);

		JButton botao = new JButton("Registrar");
		painelCadastroGerente.add(botao);

		
		frameCadastroGerente.add(painelCadastroGerente);
		frameCadastroGerente.setVisible(true);
		
		ControladorTelaCadastroGerente  controladorTelaCadastroGerente = new ControladorTelaCadastroGerente(textoResposta01,textoResposta02,textoResposta03);
		botao.addActionListener(controladorTelaCadastroGerente);
		
	}

}
