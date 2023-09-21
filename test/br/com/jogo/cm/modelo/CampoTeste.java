package br.com.jogo.cm.modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CampoTeste {

	private Campo campo;
	
	void inicialCampo () { 
		campo = new Campo(3,3);
	}
	
	@Test 
	void testeVizinhoRealDistancia1() {
		
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		//assertTrue(resultado);
		assertFalse(resultado);
		
	}

}
