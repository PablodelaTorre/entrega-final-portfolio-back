package com.portfolio.PortfolioBack.controller;

import com.portfolio.PortfolioBack.model.PosibleEmpleador;
import com.portfolio.PortfolioBack.model.Usuario;
import com.portfolio.PortfolioBack.service.IPosibleEmpleadorService;
import com.portfolio.PortfolioBack.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {
    
    @Autowired
    private IPosibleEmpleadorService posibleEmp;
    @Autowired
    private IUsuarioService usu;
    
    @GetMapping("/prueba")
    public String prueba(){
        return "Funcionando";
    }
    
    @PostMapping("/")
    public void agregarPersona(@RequestBody PosibleEmpleador posEm){
        posibleEmp.crearPosibleEmpleador(posEm);
    }
    
    @PostMapping("/login")
    public void agregarUsuario(@RequestBody Usuario usuar){
        usu.crearUsuario(usuar);
    }
    
}
