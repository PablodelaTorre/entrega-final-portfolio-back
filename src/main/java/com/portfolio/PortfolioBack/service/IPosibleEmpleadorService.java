package com.portfolio.PortfolioBack.service;

import com.portfolio.PortfolioBack.model.PosibleEmpleador;
import java.util.List;

public interface IPosibleEmpleadorService {
    
    public void crearPosibleEmpleador(PosibleEmpleador posEmp);
    
    public List<PosibleEmpleador> verPosiblesEmpleadores();
    
}
