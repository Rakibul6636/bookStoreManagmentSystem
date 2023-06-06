package in.dhrubok.springbootthymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.dhrubok.springbootthymeleaf.entity.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
