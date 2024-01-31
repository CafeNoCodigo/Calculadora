package btnAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Tela_Principal;

public class FuncaoQuadrada implements ActionListener {
	
	//private BtnAction funcaoQuadrada;
	private Tela_Principal tela;
	
	//public FuncaoQuadrada(BtnAction funcaoQuadrada) {
	//	this.funcaoQuadrada = funcaoQuadrada;
	//}
	
	public FuncaoQuadrada(Tela_Principal tela) {
		this.tela = tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//StringBuilder result = new StringBuilder();
		
		/*if(delta > 0) {
		 	long x1 = (long) ((numB*(-1)) - Math.sqrt(Double.parseDouble((String.valueOf(delta)))));
		 	result.append(x1);
			result.append(", ");
			long x2 = (long) ((numB*(-1)) + Math.sqrt(Double.parseDouble((String.valueOf(delta)))));
			result.append(x2);
			
			tela.setLabelTxt(result.toString());
		}
		*/
	}
	
	public void funtion(ActionEvent e) {
		long numA = Long.parseLong(this.tela.numA.getText());
		long numB = Long.parseLong(this.tela.numB.getText());
		long numC = Long.parseLong(this.tela.numA.getText());
		
		long delta = Math.multiplyExact(numB, numB) - 4 * Math.multiplyExact(numA, numC);
		
		tela.setTxt(String.valueOf(delta));
	}

	//public BtnAction getFuncaoQuadrada() {
	//	return funcaoQuadrada;
	//}

	//public void setFuncaoQuadrada(BtnAction funcaoQuadrada) {
	//	this.funcaoQuadrada = funcaoQuadrada;
	//}
	//
	//public void funtion() {
	//	addActionListener(this);
	//}

}
