package Controladores;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Telas.TelaAtendente;
import Telas.TelaGerente;

public class ControladorMenuPrincipal implements ActionListener {
	
	TextField textoRecebido;
	JFrame frameRecebido;
	TelaGerente telaGerente = new TelaGerente();
	TelaAtendente telaAtendente = new TelaAtendente();
	
	public ControladorMenuPrincipal(TextField textField,JFrame frame) {
		
		this.textoRecebido = textField;
		this.frameRecebido = frame;
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String recebido = textoRecebido.getText();
		if (recebido.equals ("1") || recebido.equals("2")) {
			
		switch (textoRecebido.getText()) {
		case "1":
			telaGerente.TelaDoGerente(frameRecebido);
			frameRecebido.setVisible(false);
			
			break;
			
		case "2":
			
			telaAtendente.TelaAtendentee(frameRecebido);
			frameRecebido.setVisible(false);
			break;
		 }
		
		}else {
			System.out.println("Errada a posição digitada");
		}
		
	}
	
	

}
