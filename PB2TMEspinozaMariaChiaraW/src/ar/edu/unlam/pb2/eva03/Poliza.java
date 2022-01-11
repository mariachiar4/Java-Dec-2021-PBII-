package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Poliza implements Comparable<Poliza>{
	private Integer numeroDePoliza;
	private Persona asegurado;
	private Double suma;
	private Double prima;
	private Double premio;
	
	
	public Poliza(Integer numeroDePoliza, Persona asegurado, Double suma, Double prima) {
		this.numeroDePoliza = numeroDePoliza;
		this.asegurado = asegurado;
		this.suma = suma;
		this.prima = prima;
		this.premio = this.prima*1.2;
	}

	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}

	public void setNumeroDePoliza(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Double getSuma() {
		return suma;
	}

	public void setSuma(Double suma) {
		this.suma = suma;
	}

	public Double getPrima() {
		return prima;
	}

	public void setPrima(Double prima) {
		this.prima = prima;
	}

	public Double getPremio() {
		return premio;
	}

	public void setPremio(Double premio) {
		this.premio = premio;
	}

	public int compareTo(Poliza o) {
		// TODO Auto-generated method stub
		return this.numeroDePoliza.compareTo(o.numeroDePoliza);
	}



	
	
	
}
