package kr.ac.kopo.unharpy.bookmarket.repository;

import kr.ac.kopo.unharpy.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}
