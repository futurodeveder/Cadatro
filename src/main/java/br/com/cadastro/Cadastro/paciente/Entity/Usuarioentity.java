package br.com.cadastro.Cadastro.paciente.Entity;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import br.com.cadastro.Cadastro.paciente.Dto.UsuarioDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "CDT_Usuario")
public class Usuarioentity {
 	       
          @Id
          @GeneratedValue(strategy= GenerationType.IDENTITY)	
          private long id;
          
          @Column(nullable=false)
          private String nome;
          
          @Column(nullable=false, unique = true)
          private String login;
          
         public Usuarioentity(UsuarioDto usuario) {
        	 BeanUtils.copyProperties(usuario, this);
        	 
  }
         public Usuarioentity() {
        	 
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

		@Column(nullable=false)
          private String senha;
          
          @Column(nullable=false)
          private String email;

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Usuarioentity other = (Usuarioentity) obj;
			return id == other.id;
		}
          
                  	
}





