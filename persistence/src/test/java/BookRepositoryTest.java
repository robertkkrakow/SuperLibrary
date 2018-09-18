
import com.rk.repository.BookRepository;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookRepositoryTest {

    @Test
    void testInitRepository(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        BookRepository bookRepository = new BookRepository(entityManager);
    }
}