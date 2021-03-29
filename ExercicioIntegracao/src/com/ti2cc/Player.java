package com.ti2cc;

public class Player {
	private int codigo;
	private String login;
	private String senha;
	private String nickName;
	private char sexo;
	
	public Player() {
		this.codigo = -1;
		this.login = "";
		this.senha = "";
		this.nickName = "";
		this.sexo = '*';
	}
	
	public Player(int codigo, String login, String senha, String nickName, char sexo) {
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
		this.nickName = nickName;
		this.sexo = sexo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Player [codigo =" + codigo + ", login =" + login + ", senha =" + senha + ", nickName =" + nickName + ", sexo =" + sexo + "]";
	}
	

}
