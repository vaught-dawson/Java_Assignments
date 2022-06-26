package dev.dawsonvaught.bookclub.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.dawsonvaught.bookclub.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
    ArrayList<Book> findAll();
}