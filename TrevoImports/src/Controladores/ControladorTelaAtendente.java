package Controladores;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Telas.CadastroAtendente;

public class ControladorTelaAtendente implements ActionListener {

	JFrame FrameTelaAtendente;
	JFrame FrameTelaMenuPrincipal;
	TextField respostaRecebida;
	
    CadastroAtendente  cadastroAtendente= new CadastroAtendente();
    
	
	public ControladorTelaAtendente(JFrame frameTelaAtendente, TextField respostaRecebida,JFrame frameMenuPrincipal) {
		FrameTelaAtendente = frameTelaAtendente;
		this.respostaRecebida = respostaRecebida;
		this.FrameTelaMenuPrincipal= frameMenuPrincipal;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		String recebido = respostaRecebida.getText();
		
		if (recebido.equals("1") || recebido.equals("2")) {
			switch(recebido) {
			case "1" :
				cadastroAtendente.CadastroDoAtendente();
				FrameTelaAtendente.setVisible(false);
				break;
			case "2" : 
				FrameTelaAtendente.setVisible(false);
				FrameTelaMenuPrincipal.setVisible(true);
				
			}
		}
		
	}

}
