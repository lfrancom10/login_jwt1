package login_lucciano.login_jwt.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import login_lucciano.login_jwt.Modelo.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>
{
    Usuario findByUsername(String username);

}

