package entities;

public class Aluno {

	public String nome;
	public double n1, n2, n3;

	public double notaFinal() {
		return n1 + n2 + n3;
	}

	public void resultado(double notaFinal) {
		if (notaFinal >= 60.0) {
			System.out.println("PASS!");
		} else {
			System.out.println("FAILED");
			double pass = 60.0 - notaFinal;
			System.out.println("Missing " + String.format("%.2f", pass) + " points");
		}
	}

	public String toString() {
		return "Final grade: " + String.format("%.2f", notaFinal());
	}

}
