package br.com.casadocodigo.livraria.teste;

import java.util.*;

public class GerenciadorDeCupons {

	 private Map<String, Double> cupons;

	 public GerenciadorDeCupons() {

		this.cupons = new HashMap<>();

		cupons.put("CUP10", 10.0);
		cupons.put("CUP15", 15.0);
		cupons.put("CUP20", 20.0);
		cupons.put("CUP25", 25.0);
	 }

	 public Double validaCupom(String cupom) {
		 return this.cupons.get(cupom);
	 }

}
