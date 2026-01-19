package com.bookstore.mapper;

import com.bookstore.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {
    List<Book> findAll();
    Book findById(@Param("id") Long id);
    int insert(Book book);
    int update(Book book);
    int delete(@Param("id") Long id);
    List<Map<String, Object>> countByCategory();
}
