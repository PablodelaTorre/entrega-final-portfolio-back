package com.portfolio.PortfolioBack.service;

import com.portfolio.PortfolioBack.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    public void crearUsuario(Usuario usuario);
    
    public List<Usuario> verUsuarios();
    
}
