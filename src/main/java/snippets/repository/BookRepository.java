package snippets.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book,String> {

    public Book findByTitle(String title);
    public List<Book> findByType(String type);
    public List<Book> findByAuthor(String author);
}
