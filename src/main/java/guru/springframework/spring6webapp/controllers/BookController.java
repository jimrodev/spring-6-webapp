package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @Controller
// Este stereotype está relacionado con MVC y los métodos que recibe un Model para usar la capa VIEW y dar formato a la respuesta a traves de thymeleaf for HTML, ETC
@RestController
@RequestMapping("api/v1/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /*
    @GetMapping
    public String getBooks(Model model){
        model.addAttribute("books", bookService.findAll());

        return "books";
    }
    */

    @GetMapping
    public List<Book> getBooks(){
        return bookService.findAll();
    }
}
