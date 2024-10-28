package login_lucciano.login_jwt.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{
    @GetMapping("/login")
    public String mostrarLogin()
    {
        return "login";  // Redirige a login.html
    }

    @PostMapping("/login")
    public String procesarLogin(@RequestParam String username,
                                @RequestParam String password,
                                Model model) {
        if ("admin".equals(username) && "1234".equals(password))
        {
            return "redirect:/buscar";
        }
        else
        {
            model.addAttribute("error", "Credenciales incorrectas");
            return "login";
        }
    }
}
