package btnAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.Tela_Principal;

public class BtnAction implements ActionListener {
	
	private Tela_Principal tela_Principal; // Cóntem a referência da classe Tela_Principal.
	
	/*Construtor principal passando o parámetro tela_principal
	 * desta forma ao chamar a acção somente passar o "this" referenciando
	 * a classe como parâmetro. 
	*/
	public BtnAction(Tela_Principal tela_Principal) {
		this.tela_Principal = tela_Principal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton)e.getSource();
		
		String btnDigited = btn.getText();
		
		tela_Principal.write(btnDigited); //Acessa o método write da classe tela_Principal através da variável tela_Principal.
	}

}
