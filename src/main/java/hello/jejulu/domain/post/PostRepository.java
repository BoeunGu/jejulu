package hello.jejulu.domain.post;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByHostId(Long hostId);
    List<Post> findTop4ByCategory(Category category, Sort sort);
    Slice<Post> findAllByCategory(Category category, Pageable pageable);
}
