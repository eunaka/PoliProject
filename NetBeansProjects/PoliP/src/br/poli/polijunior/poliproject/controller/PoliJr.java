/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.poli.polijunior.poliproject.controller;

public class PoliJr extends Pessoas {
	private String login;
	private String chave;//algo para identificar - CPF
	private String cargo;
	
	public PoliJr (String login, String cargo){
		setLogin(login);
	    setCargo(cargo);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public void validarLogin(String login) throws ValorInvalidoException{
		if(login.equals(this.login)==false){
			throw new ValorInvalidoException("Login Inváldo");
		}
		
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

}
