package com.bookstore.service;

import com.bookstore.entity.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<Book> list();
    Book get(Long id);
    Book create(Book book);
    Book update(Long id, Book book);
    void delete(Long id);
    List<Map<String, Object>> countByCategory();
}
