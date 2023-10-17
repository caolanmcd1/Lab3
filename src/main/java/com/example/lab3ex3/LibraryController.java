package com.example.lab3ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController
{
    private LibraryService libraryService;

    @Autowired
    public void getLibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/library")
    public List<Book> getLibrary()
    {
        return libraryService.getLibrary();
    }
    @PostMapping("/addbook")
    @ResponseStatus(HttpStatus.CREATED)
    public String addToLibrary(@RequestBody Book book)
    {
       return libraryService.addBook(book);
    }
}
