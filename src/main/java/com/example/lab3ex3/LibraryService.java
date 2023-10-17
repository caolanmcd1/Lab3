package com.example.lab3ex3;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Data
@AllArgsConstructor
public class LibraryService
{
    private ArrayList<Book> library;

    public String addBook(Book book)
    {
        library.add(book);
        return "Book " +book.getTitle()+" added";
    }
}
