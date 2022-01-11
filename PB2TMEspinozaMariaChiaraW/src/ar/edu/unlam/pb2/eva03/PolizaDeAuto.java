package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends Poliza implements SegurosGenerales{
	private Auto auto;
	
	
	
	



	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double suma, Double prima) {
		super(numeroDePoliza, asegurado, suma, prima);
		// TODO Auto-generated constructor stub
	}







	@Override
	public void agregarBienAsegurado(Auto auto) {
		// TODO Auto-generated method stub
		this.auto = auto;
	}







	@Override
	public Integer getNumeroDePoliza() {
		// TODO Auto-generated method stub
		return super.getNumeroDePoliza();
	}



	@Override
	public void setNumeroDePoliza(Integer numeroDePoliza) {
		// TODO Auto-generated method stub
		super.setNumeroDePoliza(numeroDePoliza);
	}



	@Override
	public Persona getAsegurado() {
		// TODO Auto-generated method stub
		return super.getAsegurado();
	}



	@Override
	public void setAsegurado(Persona asegurado) {
		// TODO Auto-generated method stub
		super.setAsegurado(asegurado);
	}



	@Override
	public Double getSuma() {
		// TODO Auto-generated method stub
		return super.getSuma();
	}



	@Override
	public void setSuma(Double suma) {
		// TODO Auto-generated method stub
		super.setSuma(suma);
	}



	@Override
	public Double getPrima() {
		// TODO Auto-generated method stub
		return super.getPrima();
	}



	@Override
	public void setPrima(Double prima) {
		// TODO Auto-generated method stub
		super.setPrima(prima);
	}



	@Override
	public Double getPremio() {
		// TODO Auto-generated method stub
		return super.getPremio();
	}



	@Override
	public void setPremio(Double premio) {
		// TODO Auto-generated method stub
		super.setPremio(premio);
	}



	@Override
	public Auto getAuto() {
		// TODO Auto-generated method stub
		return this.auto;
	}







	public boolean getFueRobado() {
		// TODO Auto-generated method stub
		return auto.getFueRobado();
	}

	
}

	
