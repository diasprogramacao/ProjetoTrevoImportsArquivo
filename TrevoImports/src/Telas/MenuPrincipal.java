package Telas;

import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controladores.ControladorMenuPrincipal;

public class MenuPrincipal {
	
	public void menuInicial () {
		
	String opcao1 = "Gerente digite 1";
	String opcao2 = "Atendente digite 2";
	
	GridLayout grid = new GridLayout (0,1);
	
	JFrame  frameMenuPrincipal = new JFrame();
	frameMenuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameMenuPrincipal.setSize(300,300);
	frameMenuPrincipal.setTitle("Menu Principal ");
	
	JPanel painelMenuPrincipal = new JPanel();
	painelMenuPrincipal.setLayout(grid);
	
	JLabel textMenuPrincipalOpcao1 = new JLabel(opcao1);
	painelMenuPrincipal.add(textMenuPrincipalOpcao1);
	
	JLabel textMenuPrincipalOpcao2 = new JLabel(opcao2);
	painelMenuPrincipal.add(textMenuPrincipalOpcao2);	
	
	TextField textoResposta = new TextField ();
	painelMenuPrincipal.add(textoResposta);
	
	JButton botao = new JButton("Enviar");
	painelMenuPrincipal.add(botao);
	
	frameMenuPrincipal.add(painelMenuPrincipal);
	frameMenuPrincipal.setVisible(true);
	
	ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal(textoResposta,frameMenuPrincipal);
	botao.addActionListener(controladorMenuPrincipal);
	
	}
	
}
