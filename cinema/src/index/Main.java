package index;

import dao.*;
import model.*;
import util.*;

public class Main {

	static ListaSeq<Usuario> lista = new ListaSeq<Usuario>();
	static String[][] poltronas = new String[10][10];
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub	
		int opcao;
		do{
			//Keyboard.clrscr();
			opcao = Keyboard.menu("Login/Comprar Ingresso/Sair");
			switch(opcao){
            case 1:
            	AcaoMenuGerente.realizarLogin();
            	break;
            case 2:            
            	String letras[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
            	for(int i = 0; i < 10; i++) {
                	for(int j = 0; j < 10; j++) {
                		poltronas[i][j] = (j+1) + letras[i] + " ";
                	}
            	}
            	
            	//pergunta quantos ingresso vai comprar 
            	//deixa selecionar a quantidade de poltronas de acordo com os ingressos
            	//informa o valor a ser pago e confirma a reserva
            	//exibe as informações da sessao
            	System.out.println("                    POLTRONAS                  \n ");            	
            	for(int i = 0; i < 10; i++) {
                	for(int j = 0; j < 10; j++) {
                		System.out.print(poltronas[i][j]);
                	}
                	System.out.println();
            	}
            	break;
			}			
		}while(opcao < 3);
		
	}
}
