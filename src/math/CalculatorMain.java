package math;
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 

//Ceci importe toutes les classes du package java.util
import java.util.*;

//Ceci importe toutes les classes du package org.junit.Assert.*
import static org.junit.Assert.*;

public class CalculatorMain {
	public Long add(Long a, Long b) {
		return a+b;
    }
	
	public Long multiply(Long a, Long b) {
		return a+b;
    }
	
	public static void main(String[] args){
		//Nouveau scanner
		Scanner sc = new Scanner(System.in);
		
		//Affichage
		System.out.println("Veuillez saisir une opération :");
		
		//Lecture du scanner et du split
		String operation[] = sc.nextLine().split(" ", 3);
		
		int x = Integer.parseInt(operation[0]);
		char oper = operation[1].charAt(0);
		int y = Integer.parseInt(operation[2]);
		
		//Si l'opération est une addition
		if (oper=='+'){
			int z=x+y;
			//Affichage de l'addition
			System.out.println("La somme de "+x+" et "+y+" est:" +z );
		}
		else
			//Si l'opération est une soustraction
			if (oper=='-'){
			
				int z=x-y;
				//Affichage de la soustraction
				System.out.println("La soustraction de "+x+" et "+y+" est:" +z );
			}
			else
				//Si l'opération est une multiplication
				if(oper=='*'){
					int z=x*y;
					//Affichage de la multiplication
					System.out.println("La multiplication de "+x+" et "+y+" est:" +z );
				}
				else
					//Si l'opération est un division
					if(oper=='/'){
						int z=x/y;
						//Affichage de la division
						System.out.println("La division de "+x+" et "+y+" est:" +z );
					}
	} 
}
