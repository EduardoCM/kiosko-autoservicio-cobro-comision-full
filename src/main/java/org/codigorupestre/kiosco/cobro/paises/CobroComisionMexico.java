package org.codigorupestre.kiosco.cobro.paises;

import org.codigorupestre.kiosco.cobro.CobroComision;

public class CobroComisionMexico extends CobroComision {

	@Override
	protected void calculaIVA() {
		importeIVA = importeSinIVA * 0.16;
	}

	
}
