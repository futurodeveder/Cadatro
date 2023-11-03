package br.com.cadastro.Cadastro.paciente.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cadastro.Cadastro.paciente.Dto.UsuarioDto;
import br.com.cadastro.Cadastro.paciente.Entity.Usuarioentity;
import br.com.cadastro.Cadastro.paciente.Repository.UsuarioRepository;

@Service
public class UsuarioSevice {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioDto> listartodos(){
		List<Usuarioentity> usuario = usuarioRepository.findAll();
		return usuario.stream() .map(UsuarioDto::new).toList();
			
		}
        public void inserir(UsuarioDto usuario) {
        	Usuarioentity usuarioEntity = new Usuarioentity(usuario);
        	usuarioRepository.save(usuarioEntity);
        	
        }
        public UsuarioDto alterar(UsuarioDto usuario) {
        	Usuarioentity usuarioEntity = new Usuarioentity(usuario);
        	return new UsuarioDto(usuarioRepository.save(usuarioEntity));	
        }
        public void excluir (long id) {
        	Usuarioentity usuario = usuarioRepository.findById(id).get();
        	usuarioRepository.delete(usuario);
        	
        }
        public UsuarioDto buscarPorld(long id) {
        	return new UsuarioDto(usuarioRepository.findById(id).get());
        	
        	
        	
        }
        
        
        
        
        
}
