package org.sid.dao;


import org.sid.entities.DemandeRep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface DemandeRepository extends JpaRepository<DemandeRep,Long> {
     public DemandeRep findById(long id);
}
