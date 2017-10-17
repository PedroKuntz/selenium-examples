package br.com.junit.calculadora;

public class Calculadora {

	private Double resultado;

	public Calculadora() {
		this.resultado = 0.0;
	}

	public Calculadora(Double valorInicial) {
		this.resultado = valorInicial;
	}

	public static Calculadora init(Double valorInicial) {
		Calculadora calculadora = new Calculadora(valorInicial);
		return calculadora;
	}

	private void checkValoresNotNull(Object... valores) {
		for (Object v : valores) {
			if (v == null)
				v = 0.0;
		}
	}

	public Calculadora somar(Double valor1, Double valor2) {
		checkValoresNotNull(valor1, valor2);

		if (this.resultado == null) {
			this.resultado = valor1;
		} else {
			this.resultado += valor1;
		}

		this.resultado += valor2;
		return this;
	}
	
	public Double resultado() {
		return resultado;
	}
}
