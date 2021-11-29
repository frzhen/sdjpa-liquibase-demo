package guru.ysy.slb.repositories;

import guru.ysy.slb.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhenrui on 2021/11/29 18:15
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
