package com.skillmatch.backend.repository;

import com.skillmatch.backend.entity.Contratante;
import com.skillmatch.backend.entity.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratanteRepository extends JpaRepository<Contratante, Long> {


}
