package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite as 3 notas do aluno " + aluno.nome + ": ");
		System.out.print("Nota 1: ");
		aluno.n1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		aluno.n2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		aluno.n3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(aluno);
		
		aluno.resultado(aluno.notaFinal());
		
		
		sc.close();

	}

}
