package org.codigorupestre.kiosco.cobro;

import java.util.logging.Logger;

public abstract class CobroComision {

	private final Logger LOG = Logger.getLogger(CobroComision.class.getName());

	protected double importeSinIVA;
	protected double importeIVA;
	protected double importeConIVA;

	protected abstract void calculaIVA();

	public void calculaPrecioConIVA() {
		this.calculaIVA();
		importeConIVA = importeSinIVA + importeIVA;
	}

	public void imprimirTicket() {
		//LOG.info("Servicio Realizado EXITOSAMENTE");
		//LOG.info("Importe sin IVA: " + importeSinIVA);
		//LOG.info("IVA: " + importeIVA);
		//LOG.info("Importe con IVA: " + importeConIVA);
		
		System.out.println("Servicio Realizado EXITOSAMENTE");
		System.out.println("Importe sin IVA: " + importeSinIVA);
		System.out.println("IVA: " + importeIVA);
		System.out.println("Importe a pagar: " + importeConIVA);
	}

	public void setImporteSinIVA(double importeSinIVA) {
		this.importeSinIVA = importeSinIVA;
	}
	
	
	

}
