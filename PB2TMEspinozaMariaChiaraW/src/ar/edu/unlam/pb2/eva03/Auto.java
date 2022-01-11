package ar.edu.unlam.pb2.eva03;

public class Auto {
	private String marca;
	private String modelo;
	private Integer anio;
	private Double seguro;
	private Boolean fueRobado;
	
	public Auto(String marca, String modelo, Integer anio, Double seguro) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.seguro = seguro;
		this.fueRobado = false;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Double getSeguro() {
		return seguro;
	}

	public void setSeguro(Double seguro) {
		this.seguro = seguro;
	}

	public Boolean getFueRobado() {
		return fueRobado;
	}

	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}
	
	
}
