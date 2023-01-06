package com.portfolio.PortfolioBack.repository;

import com.portfolio.PortfolioBack.model.PosibleEmpleador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosibleEmpleadorRepository extends JpaRepository<PosibleEmpleador, Long> {
    
    
    
}
