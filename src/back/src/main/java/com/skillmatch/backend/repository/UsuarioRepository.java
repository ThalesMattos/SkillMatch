package com.skillmatch.backend.repository;

import com.skillmatch.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("SELECT u FROM Usuario u WHERE u.usuario = :usuario AND u.senha = :senha")
    Usuario findByLoginInformation(@Param("usuario") String usuario, @Param("senha") String senha);

}
