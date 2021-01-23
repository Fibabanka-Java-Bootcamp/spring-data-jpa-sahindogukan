package com.hkarabakla.services;


import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Category;
import com.hkarabakla.repositories.BookRepo;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void bookOperations() {
        Book book = new Book();
        book.setName("book");
        book.setCurrency("TRY");
        book.setDescription("Desc");
        book.setPrice(15.0);

        Category category = new Category();
        category.setName("category");

        book.setCategory(category);

        System.out.println(book.getIsbn());

        System.out.println(bookRepo.findByName("book"));
    }
}
