package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional {

	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);
	}

	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("aplicando desconto no Ebook");
		return true;
	}

	public void setWatermark(String waterMark) {
		this.waterMark = waterMark;
	}

	public String getWaterMark() {
		return waterMark;
	}

}
