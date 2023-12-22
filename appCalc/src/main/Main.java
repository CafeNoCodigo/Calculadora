package main;

import java.awt.EventQueue;

import javax.swing.UIManager;

import view.Tela_Principal;

public class Main {
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
					new Tela_Principal();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
