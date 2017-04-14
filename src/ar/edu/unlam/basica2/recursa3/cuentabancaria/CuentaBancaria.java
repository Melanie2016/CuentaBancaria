package ar.edu.unlam.basica2.recursa3.cuentabancaria;

public class CuentaBancaria {
	
	private String nombre;
	private Double saldo;
	private String resultadoErroneo;
	private Integer cantidadExtracciones;
	final Double RECARGO=1.00;
	
	public CuentaBancaria(String nombre, Double saldo){
		this.nombre=nombre;
		this.saldo=saldo;
		this.cantidadExtracciones = 0; // ? 
	}
	
	public Double consultarSaldo(){
		return this.saldo;
	}
	
	public void depositarDinero(Double monto){
		this.saldo = this.saldo + monto;
	}
	
	public void extraerDinero(Double monto){
	
		if(this.saldo>=monto){
			this.saldo = this.saldo - monto;
			this.cantidadExtracciones ++;
			
			if(this.cantidadExtracciones==5){
				this.saldo = this.saldo - RECARGO; 
			}		
		}
		else{
			this.resultadoErroneo = "error";
		}
	
	}



	
	
	
	
	
	/////////////// GET Y SET ///////////////

	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
	
	public Integer getCantidadExtracciones() {
		return cantidadExtracciones;
	}
	public void setCantidadExtracciones(Integer cantidadExtracciones) {
		this.cantidadExtracciones = cantidadExtracciones;
	}
	
	
	
	public String getResultadoErroneo() {
		return resultadoErroneo;
	}
	public void setResultadoErroneo(String resultadoErroneo) {
		this.resultadoErroneo = resultadoErroneo;
	}
	
	

	
}
