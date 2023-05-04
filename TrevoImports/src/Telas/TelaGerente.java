package Telas;

import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controladores.ControladorTelaGerente;

public class TelaGerente {
	
	public void TelaDoGerente(JFrame framePrincipal) {
	
	String opcao1 = "1 - Cadastrar";
	String opcao2 = "2 - Sair";
	JFrame  frameMenuPrincipal = framePrincipal;
	
	GridLayout grid = new GridLayout (0,1);
	
	JFrame  frameTelaGerente = new JFrame();
	frameTelaGerente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameTelaGerente.setSize(300,300);
	frameTelaGerente.setTitle("Gerente ");
	
    JPanel painelTelaGerente = new JPanel();
    painelTelaGerente.setLayout(grid);
	
	JLabel textMenuPrincipalOpcao1 = new JLabel(opcao1);
	painelTelaGerente.add(textMenuPrincipalOpcao1);
	
	JLabel textMenuPrincipalOpcao2 = new JLabel(opcao2);
	painelTelaGerente.add(textMenuPrincipalOpcao2);	
	
	TextField textoResposta = new TextField ();
	painelTelaGerente.add(textoResposta);
	
	JButton botao = new JButton("Enviar");
	painelTelaGerente.add(botao);
	
	frameTelaGerente.add(painelTelaGerente);
	frameTelaGerente.setVisible(true);
	
	ControladorTelaGerente controladorTelaGerente = new ControladorTelaGerente(textoResposta,frameTelaGerente,frameMenuPrincipal);
	botao.addActionListener(controladorTelaGerente);
	
	}
	
}
