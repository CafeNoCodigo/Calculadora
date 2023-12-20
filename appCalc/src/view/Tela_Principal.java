package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import btnAction.BtnAction;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Tela_Principal{

	private JFrame frame_Principal;
	private JTextField txt;
	private BtnAction btnAction = new BtnAction(this);
	private JLabel labelSimbol;

	public static void main(String[] args) {
		try {
            // Configurar o Look and Feel padrão do Windows
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Principal window = new Tela_Principal();
					window.frame_Principal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela_Principal(JTextField txt) {
		this.txt = txt;
		initialize();
	}
	
	public Tela_Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame_Principal = new JFrame();
		frame_Principal.setResizable(false);
		frame_Principal.setForeground(new Color(183, 32, 73));
		frame_Principal.getContentPane().setBackground(new Color(22, 25, 43));
		frame_Principal.getContentPane().setLayout(null);
		
		JButton btnClean = new JButton("c");
		btnClean.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnClean.setBounds(5, 122, 68, 67);
		btnClean.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnClean);
		
		JButton btnDivision = new JButton("/");
		btnDivision.setBounds(77, 122, 68, 67);
		btnDivision.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnDivision.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnDivision);
		
		JButton btnAdition = new JButton("+");
		btnAdition.setBounds(148, 122, 68, 67);
		btnAdition.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnAdition.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnAdition);
		
		JButton btnMulti = new JButton("x");
		btnMulti.setBounds(220, 122, 50, 67);
		btnMulti.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnMulti.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnMulti);
		
		JButton btnSeven = new JButton("7");
		btnSeven.setBackground(new Color(183, 32, 73));
		btnSeven.setForeground(new Color(183, 32, 73));
		btnSeven.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnSeven.setBounds(5, 196, 68, 65);
		btnSeven.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnSeven);
		
		JButton btnFour = new JButton("4");
		btnFour.setForeground(new Color(183, 32, 73));
		btnFour.setBackground(new Color(183, 32, 73));
		btnFour.setBounds(5, 265, 68, 67);
		btnFour.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnFour.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnFour);
		
		JButton btnOne = new JButton("1");
		btnOne.setBackground(new Color(183, 32, 73));
		btnOne.setForeground(new Color(183, 32, 73));
		btnOne.setBounds(5, 338, 68, 67);
		btnOne.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnOne.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnOne);
		
		JButton btnEight = new JButton("8");
		btnEight.setBackground(new Color(183, 32, 73));
		btnEight.setForeground(new Color(183, 32, 73));
		btnEight.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnEight.setBounds(77, 196, 68, 63);
		btnEight.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnEight);
		
		JButton btnFive = new JButton("5");
		btnFive.setForeground(new Color(183, 32, 73));
		btnFive.setBackground(new Color(183, 32, 73));
		btnFive.setBounds(77, 265, 68, 67);
		btnFive.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnFive.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnFive);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setBackground(new Color(183, 32, 73));
		btnTwo.setForeground(new Color(183, 32, 73));
		btnTwo.setBounds(77, 338, 68, 67);
		btnTwo.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnTwo.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnTwo);
		
		JButton btnNine = new JButton("9");
		btnNine.setForeground(new Color(183, 32, 73));
		btnNine.setBackground(new Color(183, 32, 73));
		btnNine.setBounds(148, 196, 68, 63);
		btnNine.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnNine.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnNine);
		
		JButton btnSix = new JButton("6");
		btnSix.setForeground(new Color(183, 32, 73));
		btnSix.setBackground(new Color(183, 32, 73));
		btnSix.setBounds(148, 265, 68, 67);
		btnSix.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnSix.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnSix);
		
		JButton btnThree = new JButton("3");
		btnThree.setForeground(new Color(183, 32, 73));
		btnThree.setBackground(new Color(183, 32, 73));
		btnThree.setBounds(148, 338, 68, 67);
		btnThree.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnThree.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnThree);
		
		JButton btnCleanAll = new JButton("CL");
		btnCleanAll.setForeground(new Color(183, 32, 73));
		btnCleanAll.setBackground(new Color(183, 32, 73));
		btnCleanAll.setBounds(148, 409, 68, 54);
		btnCleanAll.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnCleanAll.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnCleanAll);
		
		JButton btnPonto = new JButton(".");
		btnPonto.setForeground(new Color(183, 32, 73));
		btnPonto.setBackground(new Color(183, 32, 73));
		btnPonto.setBounds(77, 409, 68, 54);
		btnPonto.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnPonto.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnPonto);
		
		JButton btnZero = new JButton("0");
		btnZero.setBackground(new Color(183, 32, 73));
		btnZero.setForeground(new Color(183, 32, 73));
		btnZero.setBounds(5, 409, 68, 54);
		btnZero.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnZero.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnZero);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(220, 196, 50, 63);
		btnMinus.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnMinus.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnMinus);
		
		JButton btnPlus = new JButton("");
		btnPlus.setEnabled(false);
		btnPlus.setBounds(220, 265, 50, 67);
		btnPlus.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnPlus);
		
		JButton btnIqual = new JButton("=");
		btnIqual.setBounds(220, 338, 50, 125);
		btnIqual.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnIqual.addActionListener(btnAction);
		frame_Principal.getContentPane().add(btnIqual);
		
		labelSimbol = new JLabel("");
		labelSimbol.setFont(new Font("Berlin Sans FB", Font.BOLD, 28));
		labelSimbol.setForeground(new Color(255, 255, 255));
		labelSimbol.setBounds(10, 62, 63, 49);
		frame_Principal.getContentPane().add(labelSimbol);
		
		JLabel labelOperation = new JLabel("");
		labelOperation.setForeground(new Color(255, 255, 255));
		labelOperation.setBounds(148, 11, 127, 25);
		frame_Principal.getContentPane().add(labelOperation);
		
		txt = new JTextField();
		txt.setEditable(false);
		txt.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt.setToolTipText("");
		txt.setForeground(new Color(255, 255, 255));
		txt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt.setFont(new Font("Berlin Sans FB", Font.BOLD, 25));
		txt.setBackground(new Color(22, 25, 43));
		txt.setBounds(77, 62, 198, 49);
		frame_Principal.getContentPane().add(txt);
		txt.setColumns(11);
		frame_Principal.setTitle("Calculadora");
		frame_Principal.setBounds(100, 100, 289, 500);
		frame_Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/*
	 * este método escreve na caixa de texto, "this.txt", os números de 0 a 9 e o ponto.
	 * 
	 * Define o tamanho como 7, ou seja, só podem ser escrito um máximo de 7 dígitos.
	 *  
	 * Verifica se o campo está vazio para determinar se pode ser digitado o ponto ou não,
	 * pois se estiver vazio é impedido de digitar o ponto e impede que depois de 
	 * digitado o ponto ele não possa ser digitado novamente ou dublicado.
	 */
	public void write(String btnText) {
		if((this.txt.getText().length() == 11) || (this.txt.getText().isEmpty() && btnText.equals(".")) || (this.txt.getText().contains(".") && btnText.equals("."))) {
			return;
		}else {
			this.txt.setText((this.txt.getText() + btnText));
		}	
	}
	
	public String getTxt() {
		return txt.getText();
	}

	public void limparTxt() {
		this.txt.setText("");
	}

	public void setTxt(String sum) {
		this.txt.setText(sum);
		
	}
	
	public void labelSimbolTxt(String txt) {
		this.labelSimbol.setText(txt);
	}
}
