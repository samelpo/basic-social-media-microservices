package uk.ac.york.eng2.trending.repositories;

import java.util.List;
import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.trending.domain.Hashtag;

@Repository
public interface TrendingRepository extends CrudRepository<Hashtag, Long> {

	Optional<Hashtag> findByName(String name);
	
	List<Hashtag> findTop10OrderByNumberOfLikesDesc();
}
