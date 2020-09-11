package view;

import javax.swing.JOptionPane;

import controller.OSProcessManager;

public class Main {
	public static void main(String[] args) {
		OSProcessManager ospm = new OSProcessManager();
		String os = ospm.getOS();
		int opc=Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1-Para Mostrar Processos \n 2-para Matar Processos pelo PID \n 3- Para Matar Processo pelo nome \n 9 - Para Sair  "));
		while (opc != 9) {
			switch (opc) {
			case 1:
				ospm.showTaskList(os);
				break;
			case 2:
				int o = Integer.parseInt(JOptionPane.showInputDialog("Digite O PID"));
				ospm.killProcess(os, o);
				break;
			case 3:
				String s = JOptionPane.showInputDialog("Digite O Nome do Processo");
				ospm.killProcess(os, s);
				break;
			default:
				break;
			}			
			opc=Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1-Para Mostrar Processos \n 2-para Matar Processos pelo PID \n 3- Para Matar Processo pelo nome \n 9 - Para Sair  "));
		} 
	}

}