package com.aj.ajapi.servicio;

import com.aj.ajapi.modelo.Usuario;

import java.util.Optional;

public interface ServicioUsuario {
    Usuario guardarUsuario(Usuario usuario);

    Usuario obtenerUsuario(Long idUsuario);

    Usuario usuarioModificar(Long id, Usuario usuarioModificar);

    boolean eliminarUsuario(Long id);

}
