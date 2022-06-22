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

        Hashtag fun = new Hashtag("#fun");
        hashtagRepo.save(fun);
        Category coaster = new Category("Roller Coaster");
        categoryRepo.save(coaster);
        Destination cedarPoint = new Destination("Cedar Point", "Cedar Point DrSandusky, OH 44870","This place is absolutely wild", 4.5,coaster,fun);
        destinationRepo.save(cedarPoint);

        Hashtag thriller = new Hashtag("#thriller");
        hashtagRepo.save(thriller);
        Destination sixFlags = new Destination("Six Flags", "13710 Central Ave, Bowie, MD 20721","Great roller coasters for kids and adults", 4.5,coaster,thriller);
        destinationRepo.save(sixFlags);

        Category waterPark = new Category("Water Parks");
        categoryRepo.save(waterPark);
        Destination zoombezi = new Destination("Zoombezi Bay", "4850 Powell Rd, Powell, OH 43065","Great place for family and children outing.", 4.5,waterPark,fun);
        destinationRepo.save(zoombezi);
        Destination bigSplash = new Destination("Big Splash", "2831 Southwest Blvd, Grove City, 43123","Good place with Decent price.", 4.2,waterPark,thriller);
        destinationRepo.save(bigSplash);

        Hashtag competitions = new Hashtag("#Competitive");
        hashtagRepo.save(competitions);
        Category fairs = new Category("Fairs");
        categoryRepo.save(fairs);
        Destination ohioStateFair = new Destination("Ohio State Fair", "717 E 17th Ave, Columbus, OH 43211","It’s no Pawnee Harvest Festival, but it’ll do!", 3.0,fairs,competitions);
        destinationRepo.save(ohioStateFair);

        Hashtag globalCuisine = new Hashtag("#GlobalCuisine");
        hashtagRepo.save(globalCuisine);
        Destination minnisotaStateFair = new Destination("Minnisota State Fair", "1265 Snelling Ave N, St Paul, MN 55108","Only place that’s not Las Vegas where you can get married, ride a roller coaster,  and win a hot dog eating contest on the same day!", 4.0,fairs,globalCuisine);
        destinationRepo.save(minnisotaStateFair);

        Hashtag entertaining = new Hashtag("#Entertaining");
        hashtagRepo.save(entertaining);
        Category circuses = new Category("Circuses");
        categoryRepo.save(circuses);
        Destination gardenBrothers = new Destination("Garden Brothers Circus", "Myakka City, FL 34251","I liked the horse and elephant shows the best, but the motorcycle act was incredible, and the acrobats were all great", 1.5,circuses,globalCuisine);











    }
}
