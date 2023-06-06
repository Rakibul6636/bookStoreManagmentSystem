package in.dhrubok.springbootthymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.dhrubok.springbootthymeleaf.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
