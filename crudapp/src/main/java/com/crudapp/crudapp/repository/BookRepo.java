package com.crudapp.crudapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.crudapp.crudapp.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>{
    
}
