package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
