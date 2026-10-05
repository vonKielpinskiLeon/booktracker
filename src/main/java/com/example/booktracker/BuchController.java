package com.example.booktracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BuchController {

    @GetMapping("/")
    public List<Buch> getBuecher(){
        return List.of(
                new Buch("Der Herr der Ringe", "J.R.R. Tolkien", 5),
                new Buch("Harry Potter", "J.K. Rowling", 4)
        );
    }
}
