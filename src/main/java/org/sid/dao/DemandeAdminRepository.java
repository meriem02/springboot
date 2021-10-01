package org.sid.dao;

import org.sid.entities.DemandeAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface DemandeAdminRepository extends JpaRepository<DemandeAdmin,Long> {
    public Optional<DemandeAdmin> findById (Long id);
}
