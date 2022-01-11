package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosDeVida, SegurosGenerales{
	private ArrayList <Persona> beneficiarios;
	private Vivienda vivienda;
	private Auto auto;
	
	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double suma, Double prima) {
		super(numeroDePoliza, asegurado, suma, prima);
		// TODO Auto-generated constructor stub
		this.beneficiarios = new ArrayList <Persona>();
	}
	
	 public void agregarBienAsegurado(Auto auto) {
		this.auto = auto; 
	 }
	 public void agregarBienAsegurado(Vivienda casa) {
		 this.vivienda = casa;
	 }

	 public Double getPremio(){
		 return super.getPremio();
	 }
	 public Integer getNumeroDePoliza(){
		return super.getNumeroDePoliza();
	 }
	 public void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipoBeneficiario){
		 beneficiarios.add(persona);
		 
	 }
	 public int obtenerCantidadDeBeneficiarios(){
		 return beneficiarios.size();
	 }
	 public Persona getAsegurado(){
		 return super.getAsegurado();
	 }

	@Override
	public Auto getAuto() {
		return this.auto;
	}
	
	
}
