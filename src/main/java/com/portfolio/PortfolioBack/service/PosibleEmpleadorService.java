package com.portfolio.PortfolioBack.service;

import com.portfolio.PortfolioBack.model.PosibleEmpleador;
import com.portfolio.PortfolioBack.repository.PosibleEmpleadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PosibleEmpleadorService implements IPosibleEmpleadorService {

    @Autowired
    public PosibleEmpleadorRepository posEmp;
    
    @Override
    public void crearPosibleEmpleador(PosibleEmpleador posibleEmp) {
        posEmp.save(posibleEmp);
    }

    @Override
    public List<PosibleEmpleador> verPosiblesEmpleadores() {
       return posEmp.findAll();
    }
    
}
