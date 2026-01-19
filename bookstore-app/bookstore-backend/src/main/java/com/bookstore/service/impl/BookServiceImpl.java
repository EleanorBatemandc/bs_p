package com.bookstore.service.impl;

import com.bookstore.entity.Book;
import com.bookstore.mapper.BookMapper;
import com.bookstore.service.BookService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
    private final BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> list() {
        return bookMapper.findAll();
    }

    @Override
    public Book get(Long id) {
        return bookMapper.findById(id);
    }

    @Override
    public Book create(Book book) {
        LocalDateTime now = LocalDateTime.now();
        book.setCreatedAt(now);
        book.setUpdatedAt(now);
        bookMapper.insert(book);
        return book;
    }

    @Override
    public Book update(Long id, Book book) {
        Book existing = bookMapper.findById(id);
        if (existing == null) {
            return null;
        }
        book.setId(id);
        book.setCreatedAt(existing.getCreatedAt());
        book.setUpdatedAt(LocalDateTime.now());
        bookMapper.update(book);
        return book;
    }

    @Override
    public void delete(Long id) {
        bookMapper.delete(id);
    }

    @Override
    public List<Map<String, Object>> countByCategory() {
        return bookMapper.countByCategory();
    }
}
