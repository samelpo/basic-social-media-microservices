package uk.ac.york.eng2.subscription.repositories;

import java.util.List;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.subscription.domain.Video;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {

	List<Video> findOrderByLikeCountDesc(Pageable pageable);
	
	@Query("SELECT v FROM Video v WHERE :hashtag MEMBER OF v.hashtags ORDER BY v.likeCount DESC")
    List<Video> findByHashtagOrderByLikeCountDesc(@Parameter("hashtag") String hashtag);
}
