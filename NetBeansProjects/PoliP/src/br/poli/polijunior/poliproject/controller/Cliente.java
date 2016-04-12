package br.poli.polijunior.poliproject.controller;
import java.util.ArrayList;

public class Cliente extends Pessoas{
	
	ArrayList<Pessoas> funcionario = new ArrayList();

	public ArrayList<Pessoas> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(ArrayList<Pessoas> funcionario) {
		this.funcionario = funcionario;
	}
	
}
