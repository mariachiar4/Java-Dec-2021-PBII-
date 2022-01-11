package ar.edu.unlam.pb2.eva03;

public interface SegurosGenerales {
	
	abstract void agregarBienAsegurado(Auto auto);
	abstract Auto getAuto();
	abstract Persona getAsegurado();
	abstract Double getPremio();
	abstract Integer getNumeroDePoliza();
}
