package co.edu.unbosque.View;

import java.util.Scanner;

public class View {
	
	Scanner sc = new Scanner(System.in);
	
	public View() {
		
	}
	
	public int leer_int(String mensaje) {
		System.out.println(mensaje);
		int leido = sc.nextInt();
		return leido;
	}

	public void imprimir(String mensaje) {
		System.out.println(mensaje);
	}
}

