package br.com.cadastro.Cadastro.paciente.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cadastro.Cadastro.paciente.Entity.Usuarioentity;

public interface UsuarioRepository extends JpaRepository<Usuarioentity, Long> {

}

