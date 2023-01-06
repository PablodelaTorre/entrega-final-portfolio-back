package com.portfolio.PortfolioBack.service;

import com.portfolio.PortfolioBack.model.Usuario;
import com.portfolio.PortfolioBack.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    public UsuarioRepository usuario;
    
    @Override
    public void crearUsuario(Usuario usu){
        usuario.save(usu);
    }

    @Override
    public List<Usuario> verUsuarios() {
        return usuario.findAll();
    }
    
}
