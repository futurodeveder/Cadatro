package br.com.cadastro.Cadastro.paciente.Dto;

import org.springframework.beans.BeanUtils;

import br.com.cadastro.Cadastro.paciente.Entity.Usuarioentity;

public class UsuarioDto {
	private long id;
    private String nome;
    private String login;
    private String senha;
    private String email;
    
    public UsuarioDto(Usuarioentity usuario) {
       BeanUtils.copyProperties(usuario,this);	
    }
    
    public UsuarioDto() {
    	
    }
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
