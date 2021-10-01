package org.sid.dao;


import org.sid.entities.DzmandeStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DemandeStockRepository extends JpaRepository<DzmandeStock,Long> {
    public DzmandeStock findById(long id);
}
