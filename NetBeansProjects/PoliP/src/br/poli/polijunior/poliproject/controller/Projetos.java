package br.poli.polijunior.poliproject.controller;

public class Projetos {
	private String titulo;
	private int dataInicio;
	private int dataFim;
	Cliente Nome[];
	PoliJr pessoa[];
	private String descricao;
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}

	public int getDataFim() {
		return dataFim;
	}

	public void setDataFim(int dataFim) {
		this.dataFim = dataFim;
	}

	public Cliente[] getNome() {
		return Nome;
	}

	public void setNome(Cliente[] nome) {
		Nome = nome;
	}

	public PoliJr[] getPessoa() {
		return pessoa;
	}

	public void setPessoa(PoliJr[] pessoa) {
		this.pessoa = pessoa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}