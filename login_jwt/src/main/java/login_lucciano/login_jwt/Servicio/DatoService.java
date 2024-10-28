package login_lucciano.login_jwt.Servicio;

import login_lucciano.login_jwt.Modelo.Dato;
import login_lucciano.login_jwt.Repository.DatoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DatoService
{
    private final DatoRepository datoRepository;

    public DatoService(DatoRepository datoRepository)
    {
        this.datoRepository = datoRepository;
    }

    public List<Dato> buscarPorNombre(String nombre)
    {
        return datoRepository.findByNombreContaining(nombre);
    }
}
