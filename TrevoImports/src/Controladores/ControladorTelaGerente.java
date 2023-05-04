package Controladores;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Telas.TelaCadastroGerente;

 public class ControladorTelaGerente implements ActionListener {

	 TextField respostaRecebida;
	 JFrame frameRecebidoTelaGerente;
	 JFrame frameTelaMenuPrincipal;
	 
	 TelaCadastroGerente telaCadastroGerente = new TelaCadastroGerente();
	 
	 public ControladorTelaGerente(TextField recebido, JFrame frameTelaGerente , JFrame frameTelaPrincipal) {
		 this.respostaRecebida = recebido;
		 this.frameRecebidoTelaGerente = frameTelaGerente;
		 this.frameTelaMenuPrincipal= frameTelaPrincipal;
		 
	 }
	 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String recebido = respostaRecebida.getText();		
		
		if(recebido.equals("1") || recebido.equals("2") ) {
			switch(recebido) { 
		case "1": ;
		telaCadastroGerente.CadastroGerente();
		frameRecebidoTelaGerente.setVisible(false);
		
			break;
		case "2":
			frameRecebidoTelaGerente.setVisible(false);
			frameTelaMenuPrincipal.setVisible(true);
			}
			
		} else {
			System.out.println("Errada a Opção digitada");
		}
		
	}

}
