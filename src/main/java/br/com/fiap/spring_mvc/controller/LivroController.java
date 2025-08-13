package br.com.fiap.spring_mvc.controller;

import br.com.fiap.spring_mvc.entity.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/livros")
public class LivroController {
    @GetMapping("/lista")
    public String ListarLivros(Model model ) {

        Livro Livro1 = new Livro();
        livro1.setId(1l);
        return "livroLista";
    }
}
