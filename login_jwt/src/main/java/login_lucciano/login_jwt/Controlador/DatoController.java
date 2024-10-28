package login_lucciano.login_jwt.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import login_lucciano.login_jwt.Modelo.Dato;
import login_lucciano.login_jwt.Servicio.DatoService;

import java.util.List;

@Controller
public class DatoController
{
    private final DatoService datoService;

    public DatoController(DatoService datoService)
    {
        this.datoService = datoService;
    }

    @GetMapping("/buscar")
    public String mostrarBusqueda()
    {
        return "buscar";
    }

    @GetMapping("/resultados")
    public String mostrarResultados(@RequestParam String nombre, Model model)
    {
        List<Dato> datos = datoService.buscarPorNombre(nombre);
        model.addAttribute("datos", datos);
        return "resultados";
    }
}
