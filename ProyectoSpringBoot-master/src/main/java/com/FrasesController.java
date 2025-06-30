package com;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;

@CrossOrigin(origins = "http://localhost:8081")  // Ajusta este puerto si es necesario
@RestController
public class FrasesController {

    // Lista de frases predefinidas
    private List<String> frases = List.of(
            "La vida es lo que pasa mientras estás ocupado haciendo otros planes.",
            "El único modo de hacer un gran trabajo es amar lo que haces.",
            "La vida no se mide por las veces que respiramos, sino por los momentos que nos dejan sin aliento.",
            "No cuentes los días, haz que los días cuenten.",
            "Lo único imposible es aquello que no intentas."
    );

    // Endpoint para obtener una frase aleatoria
    @GetMapping("/frase-aleatoria")
    public String obtenerFraseAleatoria() {
        Random random = new Random();
        // Devuelve una frase aleatoria de la lista
        return frases.get(random.nextInt(frases.size()));
    }
}
