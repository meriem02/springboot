package org.sid.dao;

import org.sid.entities.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface EquipementRepository extends JpaRepository<Equipement,Long> {
    public Optional<Equipement> findById (Long id);

}
