package org.sid.dao;

import org.sid.entities.Historique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface HistoriqueRepository extends JpaRepository<Historique,Long> {
    public Optional<Historique> findById (Long id);
}
