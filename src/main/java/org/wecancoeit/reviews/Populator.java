package org.wecancoeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.model.Category;
import org.wecancoeit.reviews.model.Destination;
import org.wecancoeit.reviews.model.Hashtag;
import org.wecancoeit.reviews.repos.CategoryRepository;
import org.wecancoeit.reviews.repos.DestinationRepository;
import org.wecancoeit.reviews.repos.HashtagRepository;

@Component
public class Populator implements CommandLineRunner {
    private CategoryRepository categoryRepo;
    private DestinationRepository destinationRepo;
    private HashtagRepository hashtagRepo;

    public Populator(CategoryRepository categoryRepo, DestinationRepository destinationRepo, HashtagRepository hashtagRepo) {
        this.categoryRepo = categoryRepo;
        this.destinationRepo = destinationRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Hashtag newHashTag = new Hashtag("#New");
        hashtagRepo.save(newHashTag);
        Category newCategory = new Category("Roller Coaster");
        categoryRepo.save(newCategory);
        Destination newDestination = new Destination("Cedar Point", "123","asdf", 4.5,newCategory,newHashTag);
        destinationRepo.save(newDestination);




    }
}
