package Telas;

import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controladores.ControladorTelaCadastroAtendente;

public class CadastroAtendente {

public void CadastroDoAtendente() {
		
		String opcao01 = "Nome"; 
		String opcao02 = "Cpf";
		String opcao03 = "Setor";
		
		GridLayout grid = new GridLayout (0,1);
		
		JFrame  frameCadastroAtendente = new JFrame();
		frameCadastroAtendente.setSize(300,300);
		frameCadastroAtendente.setTitle("Cadastro Atendente ");
		
		JPanel painelCadastroAtendente = new JPanel();
		painelCadastroAtendente.setLayout(grid);
		
		JLabel TextoOpcao1 = new JLabel(opcao01);
		painelCadastroAtendente.add(TextoOpcao1);
		
		TextField textoResposta01 = new TextField (10);
		painelCadastroAtendente.add(textoResposta01);
		
		JLabel TextoOpcao2 = new JLabel(opcao02);
		painelCadastroAtendente.add(TextoOpcao2);
		
		TextField textoResposta02 = new TextField (10);
		painelCadastroAtendente.add(textoResposta02);
		
		JLabel TextoOpcao3 = new JLabel(opcao03);
		painelCadastroAtendente.add(TextoOpcao3);
		
		TextField textoResposta03 = new TextField (10);
		painelCadastroAtendente.add(textoResposta03);

		JButton botao = new JButton("Registrar");
		painelCadastroAtendente.add(botao);

		
		frameCadastroAtendente.add(painelCadastroAtendente);
		frameCadastroAtendente.setVisible(true);
		
		ControladorTelaCadastroAtendente controladorTelaCadastroAtendente = new ControladorTelaCadastroAtendente(textoResposta01,textoResposta02,textoResposta03);
		botao.addActionListener(controladorTelaCadastroAtendente);
		
	}
	
}
