package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ExerciciosController {

	private Double resultado;
	private Double valor1;
	private Double valor2;
	private String texto;
	private String novoTexto;
	private Double numeroFormatado;
	private Boolean java;
	private Boolean php;
	private Boolean python;
	private Boolean cMaisMais;
	private Double numero;
	private Uf uf = Uf.PR;
	private Sexo sexo;
	
	
	public Sexo[] getListaSexo() {
		return sexo.values();
	}
	
	public Sexo getSexo() {
		return sexo;
	}


	public Uf[] getListaUf() {
		return uf.values();
	}
	
	
	public Uf getUf() {
		return uf;
	}

	public Double getNumeroFormatado() {
		return numeroFormatado;
	}

	public void setNumeroFormatado(Double numeroFormatado) {
		this.numeroFormatado = numeroFormatado;
	}
	
	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}

	public Boolean getJava() {
		return java;
	}

	public void setJava(Boolean java) {
		this.java = java;
	}

	public Boolean getPhp() {
		return php;
	}

	public void setPhp(Boolean php) {
		this.php = php;
	}

	public Boolean getPython() {
		return python;
	}

	public void setPython(Boolean python) {
		this.python = python;
	}

	public Boolean getcMaisMais() {
		return cMaisMais;
	}

	public void setcMaisMais(Boolean cMaisMais) {
		this.cMaisMais = cMaisMais;
	}

	public String getNovoTexto() {
		return novoTexto;
	}

	public void setNovoTexto(String novoTexto) {
		this.novoTexto = novoTexto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
	

	public void somar() {
		setResultado(valor1 + valor2);
	}
	
	public void subtrair() {
		setResultado(valor1 - valor2);
	}
	
	public void multiplicar() {
		setResultado(valor1 * valor2);
	}
	
	public void dividir() {
		setResultado(valor1 / valor2);	
	}
	
	public void maiuscula() {
		novoTexto = texto.toUpperCase();
	}
	
	public void minuscula() {
		novoTexto = texto.toLowerCase();
	}
	
	public void formatar() {
		numeroFormatado = numero;
	}

	
	
}
