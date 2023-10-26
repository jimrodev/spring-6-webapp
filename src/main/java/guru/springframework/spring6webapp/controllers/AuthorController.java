package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.AuthorRecord;
import guru.springframework.spring6webapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// @Controller
// Este stereotype está relacionado con MVC y los métodos que recibe un Model para usar la capa VIEW y dar formato a la respuesta a traves de thymeleaf for HTML, ETC
@RestController
@RequestMapping("api/v1/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;    }

    /*@GetMapping("api/v1/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors", authorService.findAll());

        return "authors";
    }*/

    @GetMapping
    public List<Author> getAuthors(){

        List<Author> returnvalue = authorService.findAll();

        return  returnvalue;
    }
}
