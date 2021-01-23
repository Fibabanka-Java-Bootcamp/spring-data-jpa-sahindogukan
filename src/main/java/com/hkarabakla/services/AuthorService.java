package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.entities.Author;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorService {


    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public void authorOperations() {
        Author author = new Author();
        author.setName("Author");

        Author author2 = new Author();
        author.setName("Author2");

        authorRepo.save(author);
        authorRepo.save(author2);

        System.out.println(author.getID());

        System.out.println(authorRepo.findByName("author2"));
    }
}
