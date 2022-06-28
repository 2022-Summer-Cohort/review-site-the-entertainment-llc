package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.model.Hashtag;

import java.util.Optional;

public interface HashtagRepository extends CrudRepository<Hashtag, Long> {
    Optional<Hashtag> findByhashtagDescriptionIgnoreCase(String hashtagDescription);

}
