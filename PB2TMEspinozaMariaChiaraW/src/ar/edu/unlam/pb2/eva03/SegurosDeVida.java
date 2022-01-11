package ar.edu.unlam.pb2.eva03;

public interface SegurosDeVida {

	abstract void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipoBeneficiario);
	abstract int obtenerCantidadDeBeneficiarios();
	abstract Persona getAsegurado();
	abstract Double getPremio();
}
