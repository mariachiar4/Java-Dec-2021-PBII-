package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida{
	private ArrayList <Persona> beneficiarios;
	private Boolean tuvoAlgunAccidente;
	
	public PolizaAccidentesPersonales(Integer numeroDePoliza, Persona asegurado, Double suma, Double prima) {
		super(numeroDePoliza, asegurado, suma, prima);
		// TODO Auto-generated constructor stub
		this.beneficiarios = new ArrayList <Persona>();
		this.tuvoAlgunAccidente = false;
	}

	@Override
	public void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipoBeneficiario) {
		// TODO Auto-generated method stub
		beneficiarios.add(persona);
	}

	@Override
	public int obtenerCantidadDeBeneficiarios() {
		return beneficiarios.size();
	}

	@Override
	public Persona getAsegurado() {
		// TODO Auto-generated method stub
		return super.getAsegurado();
	}

	@Override
	public Double getPremio() {
		// TODO Auto-generated method stub
		return super.getPremio();
	}

	public Boolean getTuvoAlgunAccidente() {
		return tuvoAlgunAccidente;
	}

	public void setTuvoAlgunAccidente(Boolean tuvoAlgunAccidente) {
		this.tuvoAlgunAccidente = tuvoAlgunAccidente;
	}

	

}
