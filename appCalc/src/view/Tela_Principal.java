package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Tela_Principal {

	private JFrame frame_Principal;

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

	public Tela_Principal() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame_Principal = new JFrame();
		frame_Principal.setForeground(new Color(183, 32, 73));
		frame_Principal.getContentPane().setBackground(new Color(22, 25, 43));
		frame_Principal.getContentPane().setLayout(null);
		
		JButton btnClean = new JButton("c");
		btnClean.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnClean.setBounds(5, 122, 68, 67);
		frame_Principal.getContentPane().add(btnClean);
		
		JButton btnDivision = new JButton("%");
		btnDivision.setBounds(77, 122, 68, 67);
		btnDivision.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnDivision);
		
		JButton btnAdition = new JButton("+");
		btnAdition.setBounds(148, 122, 68, 67);
		btnAdition.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnAdition);
		
		JButton btnMulti = new JButton("x");
		btnMulti.setBounds(220, 122, 55, 67);
		btnMulti.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnMulti);
		
		JButton btnSeven = new JButton("7");
		btnSeven.setBackground(new Color(183, 32, 73));
		btnSeven.setForeground(new Color(183, 32, 73));
		btnSeven.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnSeven.setBounds(5, 196, 68, 65);
		frame_Principal.getContentPane().add(btnSeven);
		
		JButton btnFour = new JButton("4");
		btnFour.setForeground(new Color(183, 32, 73));
		btnFour.setBackground(new Color(183, 32, 73));
		btnFour.setBounds(5, 265, 68, 67);
		btnFour.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnFour);
		
		JButton btnOne = new JButton("1");
		btnOne.setBackground(new Color(183, 32, 73));
		btnOne.setForeground(new Color(183, 32, 73));
		btnOne.setBounds(5, 338, 68, 67);
		btnOne.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnOne);
		
		JButton btnEight = new JButton("8");
		btnEight.setBackground(new Color(183, 32, 73));
		btnEight.setForeground(new Color(183, 32, 73));
		btnEight.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnEight.setBounds(77, 196, 68, 63);
		frame_Principal.getContentPane().add(btnEight);
		
		JButton btnFive = new JButton("5");
		btnFive.setForeground(new Color(183, 32, 73));
		btnFive.setBackground(new Color(183, 32, 73));
		btnFive.setBounds(77, 265, 68, 67);
		btnFive.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnFive);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setBackground(new Color(183, 32, 73));
		btnTwo.setForeground(new Color(183, 32, 73));
		btnTwo.setBounds(77, 338, 68, 67);
		btnTwo.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnTwo);
		
		JButton btnNine = new JButton("9");
		btnNine.setForeground(new Color(183, 32, 73));
		btnNine.setBackground(new Color(183, 32, 73));
		btnNine.setBounds(148, 196, 68, 63);
		btnNine.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnNine);
		
		JButton btnSix = new JButton("6");
		btnSix.setForeground(new Color(183, 32, 73));
		btnSix.setBackground(new Color(183, 32, 73));
		btnSix.setBounds(148, 265, 68, 67);
		btnSix.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnSix);
		
		JButton btnThree = new JButton("3");
		btnThree.setForeground(new Color(183, 32, 73));
		btnThree.setBackground(new Color(183, 32, 73));
		btnThree.setBounds(148, 338, 68, 67);
		btnThree.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnThree);
		
		JButton btnNewButton_13 = new JButton("CL");
		btnNewButton_13.setForeground(new Color(183, 32, 73));
		btnNewButton_13.setBackground(new Color(183, 32, 73));
		btnNewButton_13.setBounds(148, 409, 68, 54);
		btnNewButton_13.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnNewButton_13);
		
		JButton btnPonto = new JButton(".");
		btnPonto.setForeground(new Color(183, 32, 73));
		btnPonto.setBackground(new Color(183, 32, 73));
		btnPonto.setBounds(77, 409, 68, 54);
		btnPonto.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnPonto);
		
		JButton btnZero = new JButton("0");
		btnZero.setBackground(new Color(183, 32, 73));
		btnZero.setForeground(new Color(183, 32, 73));
		btnZero.setBounds(5, 409, 68, 54);
		btnZero.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnZero);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(220, 196, 55, 63);
		btnMinus.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnMinus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(220, 265, 55, 67);
		btnPlus.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnPlus);
		
		JButton btnIqual = new JButton("=");
		btnIqual.setBounds(220, 338, 55, 125);
		btnIqual.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		frame_Principal.getContentPane().add(btnIqual);
		
		JLabel labelSimbol = new JLabel("");
		labelSimbol.setBounds(10, 62, 63, 49);
		frame_Principal.getContentPane().add(labelSimbol);
		
		JLabel labelWriting = new JLabel("");
		labelWriting.setBounds(148, 57, 127, 54);
		frame_Principal.getContentPane().add(labelWriting);
		
		JLabel labelOperation = new JLabel("");
		labelOperation.setBounds(148, 11, 127, 25);
		frame_Principal.getContentPane().add(labelOperation);
		frame_Principal.setTitle("Calculadora");
		frame_Principal.setResizable(false);
		frame_Principal.setBounds(100, 100, 289, 500);
		frame_Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
