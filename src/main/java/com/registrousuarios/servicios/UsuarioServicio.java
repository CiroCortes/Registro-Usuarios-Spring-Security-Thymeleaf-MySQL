package com.registrousuarios.servicios;

import com.registrousuarios.dto.UsuarioRegistroDTO;
import com.registrousuarios.modelo.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioServicio extends UserDetailsService {

    public Usuario guardar(UsuarioRegistroDTO registroDTO);

    public List<Usuario> listarUsuarios();


}
