package Telas;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controladores.ControladorTelaAtendente;

public class TelaAtendente {
	
	public void TelaAtendentee(JFrame FrameMenuPrincipal) {
	
	String opcao01 = "1 - Cadastrar";
	String opcao02 = "2 - Sair";
	JFrame telaMenuPrincipal = FrameMenuPrincipal;
	
	GridLayout grid = new GridLayout (0,1);
	
	
	 JFrame frameAtendente = new JFrame();
	 frameAtendente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frameAtendente.setSize(400,400);
	 frameAtendente.setTitle("Tela Atendente");
	 
	JPanel painelAtendente = new JPanel();
	painelAtendente.setLayout(grid);

	JLabel textoOpcap01 = new JLabel(opcao01);
	painelAtendente.add(textoOpcap01);
	
	JLabel textoOpcap02 = new JLabel(opcao02);
	painelAtendente.add(textoOpcap02);
	
	TextField textoResposta = new TextField(10);
	painelAtendente.add(textoResposta);
	
	Button botao = new Button("Confirmar");
	painelAtendente.add(botao);

	frameAtendente.add(painelAtendente);
	frameAtendente.setVisible(true);

	ControladorTelaAtendente controladorTelaAtendente = new ControladorTelaAtendente(frameAtendente,textoResposta,telaMenuPrincipal);
	botao.addActionListener(controladorTelaAtendente);
	
	}
}
