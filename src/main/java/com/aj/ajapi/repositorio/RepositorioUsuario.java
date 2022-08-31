package com.aj.ajapi.repositorio;

import com.aj.ajapi.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario,Long>{



}
