package login_lucciano.login_jwt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import login_lucciano.login_jwt.Modelo.Dato;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatoRepository extends JpaRepository<Dato, Long>
{
    List<Dato> findByNombreContaining(String nombre);
}
