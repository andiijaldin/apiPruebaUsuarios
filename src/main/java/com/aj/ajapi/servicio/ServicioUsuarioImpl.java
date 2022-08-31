package com.aj.ajapi.servicio;

import com.aj.ajapi.modelo.Usuario;
import com.aj.ajapi.repositorio.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServicioUsuarioImpl implements ServicioUsuario{

    private final RepositorioUsuario repositorioUsuario;
    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    @Override
    public Optional<Usuario> obtenerUsuario(Long idUsuario) {
        return repositorioUsuario.findById(idUsuario);
    }

    @Override
    public Usuario usuarioModificar(Long id, Usuario usuarioModificar) {
      Usuario usuarioBuscado=repositorioUsuario.findById(id).get();
        usuarioBuscado.setNombre(usuarioModificar.getNombre());
        usuarioBuscado.setApellido(usuarioModificar.getApellido());
        usuarioBuscado.setTelefono(usuarioModificar.getTelefono());
        usuarioBuscado.setDireccion(usuarioModificar.getDireccion());
      return repositorioUsuario.save(usuarioBuscado);
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        try
        {
            repositorioUsuario.deleteById(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    @Override
    public List<Usuario> obtenerTodosUsuarios(){
       return repositorioUsuario.findAll();
    }
}
