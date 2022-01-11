package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CompaniaDeSeguro {
	private String nombre;
	private Set<Poliza> polizas;
	private Boolean siniestroDenunciado;
	
	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		this.polizas = new TreeSet<Poliza>();
	}
	
	public void agregarPoliza (Poliza poliza) {
		polizas.add(poliza);
		
	}
	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return polizas.size();
	}
	
	public void denunciarSiniestro(Integer numero) throws PolizaInexistente{
		PolizaDeAuto polizaEncontrada = (PolizaDeAuto)getPoliza(numero);
		Auto autoRobado = polizaEncontrada.getAuto();
		autoRobado.setFueRobado(true);
	}
	
	public void denunciarSiniestroVida (Integer numero) throws PolizaInexistente{
		PolizaAccidentesPersonales polizaEncontrada = (PolizaAccidentesPersonales)getPoliza(numero);
		polizaEncontrada.setTuvoAlgunAccidente(true);
	}
	
	public Poliza getPoliza (Integer numero) throws PolizaInexistente{
		Poliza polizaBuscada = null;
		for (Poliza poliza : polizas) {
			if(poliza.getNumeroDePoliza()==numero) {
				polizaBuscada = (Poliza) poliza;
			return polizaBuscada;
			}
		}
			throw new PolizaInexistente();
		
	}
	

}
