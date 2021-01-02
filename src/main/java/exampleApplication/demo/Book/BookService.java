package exampleApplication.demo.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRespository bookRespository;

    public List<Book> list() {
        return bookRespository.findAll();
    }

    public void addBook(Book book) {
        bookRespository.save(book);
    }

    public Book getBook(long id){
        return bookRespository.findById(id).orElse(null);
    }
}
