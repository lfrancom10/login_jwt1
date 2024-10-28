package login_lucciano.login_jwt.Servicio;

import login_lucciano.login_jwt.Modelo.Usuario;
import login_lucciano.login_jwt.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService
{
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository)
    {
        this.usuarioRepository = usuarioRepository;
    }

    public boolean validarUsuario(String username, String password)
    {
        Usuario usuario = usuarioRepository.findByUsername(username);
        return usuario != null && usuario.getPassword().equals(password);
    }
}
