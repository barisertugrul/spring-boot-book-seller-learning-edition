package com.ertyazilim.springbootbooksellertrainingedition.repository;

import com.ertyazilim.springbootbooksellertrainingedition.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {

}
