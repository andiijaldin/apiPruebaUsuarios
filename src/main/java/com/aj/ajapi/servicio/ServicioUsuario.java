package com.aj.ajapi.servicio;

import com.aj.ajapi.modelo.Usuario;

import java.util.List;
import java.util.Optional;

public interface ServicioUsuario {
    Usuario guardarUsuario(Usuario usuario);

    Optional<Usuario> obtenerUsuario(Long idUsuario);

    List<Usuario> obtenerTodosUsuarios();
    Usuario usuarioModificar(Long id, Usuario usuarioModificar);

    boolean eliminarUsuario(Long id);

}
