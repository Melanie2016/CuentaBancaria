package ar.edu.unlam.basica2.recursa3.cuentabancaria;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CuentaBancariaTest {

	@Test
	public void testQueSePuedaCrearUnaCuenta() {
		
		CuentaBancaria miCuenta = new CuentaBancaria("melanie",100.00);
		
		Double valorEsperado = miCuenta.consultarSaldo();
		Double valorActual = 100.00;
		
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void testQueSePuedaDepositarDinero(){
		
	/* si no utilizo el get seria: 
		
		CuentaBancaria miCuenta = new CuentaBancaria("maria",50.00);
		
		Double valorEsperado = 200.00;
		Double valorActual = miCuenta.depositarDinero(150.00);
		
		Assert.assertEquals(valorEsperado,valorActual);
		
		
		pero hay que cambiar el tipo de retorno del metodo depositarDinero()
		y el enunciado no lo sugiere.
		
	*/
		
		CuentaBancaria miCuenta = new CuentaBancaria("maria",50.00);
		
		miCuenta.depositarDinero(150.00);
		
		Double valorEsperado = 200.00;
		
		Assert.assertEquals(valorEsperado, miCuenta.getSaldo());
		
		  
	}
	
	@Test
	public void testQueSePuedaExtraerDineroDentroDeLaCapacidadDeLaCuenata(){
		
		CuentaBancaria miCuenta  = new CuentaBancaria("anabella",100.00);
		
		miCuenta.extraerDinero(90.00);
		
		Double valorEsperado = 10.00;
		Double valorActual = miCuenta.getSaldo();
		
		Assert.assertEquals(valorEsperado,valorActual);
		
	}

	@Test
	public void testQueNoSePuedaExtraerDineroSiElSaldoEsInsuficiente(){
		/* recordatorio= este tes da verde cuando el monto es mayor
		 * al que posee como saldo de cuenta.
		*/
		
		
		CuentaBancaria miCuenta = new CuentaBancaria("gonzalo",100.00);
		
		miCuenta.extraerDinero(110.00);
		
		String esperado	= "error"; 

		String obtenido = miCuenta.getResultadoErroneo();
		
		Assert.assertEquals(esperado,obtenido);
		
	}
	
	@Test
	public void testQueCompruebeLaEfectividadDelRecargoCadaCincoExtracciones(){
	
		CuentaBancaria miCuenta = new CuentaBancaria("paola",300.00);
		
		miCuenta.extraerDinero(50.00);
		miCuenta.extraerDinero(50.00);
		miCuenta.extraerDinero(50.00);
		miCuenta.extraerDinero(50.00);
		miCuenta.extraerDinero(50.00); 
		
		/*  
		String esperado	= "error"; 

		String obtenido = miCuenta.getResultadoErroneo();
		
		Assert.assertEquals(esperado,obtenido);
		*/

		
		Double esperado2 = 49.00;
		Double obtenido2 = miCuenta.getSaldo();
		
		Assert.assertEquals(esperado2,obtenido2);
		
	}
	
	
	
	
	
	
	
}
