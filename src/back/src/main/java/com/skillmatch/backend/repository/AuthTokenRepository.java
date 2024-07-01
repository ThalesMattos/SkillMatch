package com.skillmatch.backend.repository;

import com.skillmatch.backend.entity.AuthToken;
import com.skillmatch.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AuthTokenRepository extends JpaRepository<AuthToken, String> {
    @Query("SELECT at, at.usuario FROM AuthToken at WHERE at.usuario.id = :idUsuario ORDER BY at.expirationDate DESC LIMIT 1")
    AuthToken findByUsuario(@Param("idUsuario") Long idUsuario);
}