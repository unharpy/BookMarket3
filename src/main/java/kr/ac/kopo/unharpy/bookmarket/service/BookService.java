package kr.ac.kopo.unharpy.bookmarket.service;
import kr.ac.kopo.unharpy.bookmarket.domain.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
}
