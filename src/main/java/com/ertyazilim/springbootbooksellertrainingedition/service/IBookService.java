package com.ertyazilim.springbootbooksellertrainingedition.service;

import com.ertyazilim.springbootbooksellertrainingedition.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
