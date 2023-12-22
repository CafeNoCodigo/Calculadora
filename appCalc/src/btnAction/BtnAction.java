package btnAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.Tela_Principal;

public class BtnAction implements ActionListener {
	
	private Tela_Principal tela_Principal; // Cóntem a referência da classe Tela_Principal.
	private double num1;
	private double num2;
	private char sinal;
	private String result;
	
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
		
		if(btnDigited.matches("[0-9.]")) {
			tela_Principal.write(btnDigited); //Acessa o método write da classe tela_Principal através da variável tela_Principal.
			tela_Principal.setLabelTxt(tela_Principal.getLabelTxt() + btnDigited);
		}else if(btnDigited.matches("[+\\-x/%]")) {
			operation(e);
			tela_Principal.setLabelTxt(tela_Principal.getLabelTxt() + btnDigited);
		}else if(btnDigited.equals("=")) {
			btnIqual(e);
			tela_Principal.setLabelTxt(tela_Principal.getLabelTxt()  + "= " + getResult());
		}else if(btnDigited.equals("c")) {
			if(tela_Principal.getTxt().length() > 0) {
				tela_Principal.setTxt(tela_Principal.getTxt().substring(0, tela_Principal.getTxt().length() - 1));
				
			}
			if(tela_Principal.getLabelTxt().length() > 0) {
				tela_Principal.setLabelTxt("");
			}
		}else if(btnDigited.equals("CL")){
			tela_Principal.setTxt("");
			this.num1 = 0;
			this.num2 = 0;
			this.sinal = '\u0000';
			tela_Principal.labelSimbolTxt("");
			tela_Principal.setLabelTxt("");
		}
	}
	
	/*
	 * Método para manipular os botões com os simbolos que 
	 * equivalem as operações matemáticas,
	 * */
	public void operation(ActionEvent e) {
		if(tela_Principal.getTxt().isEmpty()) {
			return;
		}else {
			JButton btn = (JButton)e.getSource();
			
			sinal = btn.getText().charAt(0);
			tela_Principal.labelSimbolTxt("");
			tela_Principal.labelSimbolTxt(btn.getText());
			
			num1 = Double.parseDouble(tela_Principal.getTxt());
			
			tela_Principal.limparTxt();
		}	
	}
	
	public void btnIqual(ActionEvent e) {
		if(tela_Principal.getTxt().isEmpty()) {
			return;
		}else {
			num2 = Double.parseDouble(tela_Principal.getTxt());
			
			switch(sinal) {
			case '+':
				tela_Principal.setTxt(this.sum(this.num1, num2));
				break;
			case '-':
				tela_Principal.setTxt(this.subtracao(this.num1, num2));
				break;
			case '/':
				tela_Principal.setTxt(this.division(this.num1, num2));
				break;
			case 'x':
				tela_Principal.setTxt(this.mult(this.num1, num2));
				break;
			}
		}	
	}
	
	public String sum(double num1, double num2) {
		return setResult(String.valueOf((num1 + num2)));
		
	}
	
	public String subtracao(double num1, double num2) {
		return setResult(String.valueOf((num1 - num2)));
	}
	
	public String division(double num1, double num2) {
		return setResult(String.valueOf((num1 / num2)));
	}
	
	public String mult(double num1, double num2) {
		return setResult(String.valueOf((num1 * num2)));
	}

	public String getResult() {
		return result;
	}

	public String setResult(String result) {
		this.result = result;
		return result;
	}

}
