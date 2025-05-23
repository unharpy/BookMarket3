package kr.ac.kopo.unharpy.bookmarket.repository;

import kr.ac.kopo.unharpy.bookmarket.domain.Book;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.*;


@Repository
public class BookRepositoryImpl implements BookRepository {
    private List<Book> listOfBooks = new ArrayList<>();

    public  BookRepositoryImpl() {
        Book book1 = new Book();
        book1.setBookId("isbn0001");
        book1.setName("스프링완전정복");
        book1.setUnitPrice(BigDecimal.valueOf(35000));
        book1.setAuthor("송미영");
        book1.setDescription("‘개념-실습-프로젝트’로 끝내는 쉽고 빠른 스프링 부트! 스프링 부트는 " +
                "스프링을 기반으로 쉽고 빠르게 웹 애플리케이션을 개발할 수 있는 도구입니다. " +
                "이 책에서는 스프링 부트의 기본 개념을 쉽게 이해하고 다양한 실습 예제로 빠르게 익힐 수 있습니다. " +
                "그리고 단계별 실습을");
        book1.setPublisher("길벗캠퍼스");
        book1.setCategory("IT교재");
        book1.setUnitsInStock(1000);
        book1.setReleaseDate("2024/12/31");
        book1.setCondition("신규도서");
        book1.setFileName("isbn0001.jpg");
        Book book2 = new Book();

        book2.setBookId("isbn0002");
        book2.setName("로스트 심벌1");
        book2.setUnitPrice(BigDecimal.valueOf(11000));
        book2.setAuthor("댄 브라운");
        book2.setDescription("프리메이슨의 숨겨진 상징과 비밀을 파헤치다! 세계적인 베스트셀러 " +
                "《다빈치 코드》의 작가 댄 브라운이 6년 만에 펴낸 소설『로스트 심벌』." +
                " 미국의 수도 워싱턴 D.C.를 중심으로 도시 곳곳에 숨겨진 비밀 결사조직 ");
        book2.setPublisher("문학수첩");
        book2.setCategory("소설");
        book2.setUnitsInStock(500);
        book2.setReleaseDate("2009/11/23");
        book2.setCondition("중고도서");
        book2.setFileName("isbn0002.jpg");
        Book book3 = new Book();

        book3.setBookId("isbn0003");
        book3.setName("데일 카네기 인간관계론");
        book3.setUnitPrice(BigDecimal.valueOf(10000));
        book3.setAuthor("데일 카네기");
        book3.setDescription("영문학 박사 임상훈이 원작의 의도와 말맛을 고스란히 살려 우리말로 옮긴, " +
                "가장 카네기다운 번역 ★ 최초·최고의 자기계발서로 꼽히는 카네기 불후의 명저를 개정판 " +
                "누락 내용(5~6부)까지 온전히 담아낸 초판 완역");
        book3.setPublisher("현대지성");
        book3.setCategory("자기계발");
        book3.setUnitsInStock(2000);
        book3.setReleaseDate("2019/10/07");
        book3.setCondition("중고도서");
        book3.setFileName("isbn0003.jpg");

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
    }
    @Override
    public List<Book> getAllBookList() {
        return listOfBooks;
    }
    @Override
    public Book getBookById(String bookId) {
        Book bookInfo = null;
        for (Book book : listOfBooks) {
            if(book!=null && book.getBookId()!=null && book.getBookId().equals(bookId)) {
                bookInfo = book;
                break;
            }
        }
        if(bookInfo == null)
            throw new IllegalArgumentException("도서ID가 " + bookId + "인 해당 도서를 찾을 수 없습니다.");
        return bookInfo;
    }

    @Override
    public List<Book> getBookListByCategory(String category) {
        List<Book> booksByCategory = new ArrayList<Book>();
        for (Book book : listOfBooks) {
            if(book.getCategory()!=null && book.getCategory().equals(category)) {
                booksByCategory.add(book);
            }
        }
        return booksByCategory;
    }

    @Override
    public Set<Book> getBookListByFilter(Map<String, List<String>> filter) {
        Set<Book> booksByPublisher = new HashSet<Book>();
        Set<Book> booksByCategory = new HashSet<Book>();
        Set<String> booksByFilter = filter.keySet();

        if(booksByFilter.contains("publisher")) {
            for(int j = 0 ; j < filter.get("publisher").size(); j++) {
                String publisherName = filter.get("publisher").get(j);
                for (int i = 0; i < listOfBooks.size(); i++) {
                    Book book = listOfBooks.get(i);
                    if(publisherName.equalsIgnoreCase(book.getPublisher())) {
                        booksByPublisher.add(book);
                    }
                }
            }
            if(booksByFilter.contains("category")) {
                for(int i = 0 ; i < filter.get("category").size(); i++) {
                    String category = filter.get("category").get(i);
                    List<Book> list = getBookListByCategory(category);
                    booksByCategory.addAll(list);
                }
            }
            // 저장된 요소 중에서 2 Set의 비교하여 같은 값만 남기고 나머지는 제거하는 역할(교집합만 남김)
            booksByCategory.retainAll(booksByPublisher);
            return booksByCategory;
        }
        return Set.of();
    }

    @Override
    public void setNewBook(Book book) {
        listOfBooks.add(book);
    }
}
