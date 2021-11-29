package guru.ysy.slb.repositories;

import guru.ysy.slb.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhenrui on 2021/11/29 18:14
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
