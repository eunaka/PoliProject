/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.poli.polijunior.poliproject.controller;


public interface IAcesso {
	public void inserirPessoa();
	public void inserirCliente();
	public void inserirProjeto();
	public void inserirEvento();
	
	public void editarPessoa();
	public void editarCliente();
	public void editarProjeto();
	public void editarEvento();
	
	public void excluirPessoa(String chave);
	public void excluirCliente(String chave);
	public void excluirProjeto(String chave);
	public void excluirEvento(String chave);
}
