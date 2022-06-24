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
        Category coaster = new Category("Roller Coaster", "/images/small/BigSplashSM.jpg");
        categoryRepo.save(coaster);
        Destination cedarPoint = new Destination("Cedar Point", "Cedar Point DrSandusky, OH 44870","This place is absolutely wild", 4.5,coaster,"/images/small/CedarPointSM.jpg",fun);
        destinationRepo.save(cedarPoint);

        Hashtag thriller = new Hashtag("#thriller");
        hashtagRepo.save(thriller);
        Destination sixFlags = new Destination("Six Flags", "13710 Central Ave, Bowie, MD 20721","Great roller coasters for kids and adults", 4.5,coaster,"/images/small/SixFlagsMDSM.jpg",thriller);
        destinationRepo.save(sixFlags);

        Category waterPark = new Category("Water Parks", "/images/small/BigSplashSM.jpg");
        categoryRepo.save(waterPark);
        Destination zoombezi = new Destination("Zoombezi Bay", "4850 Powell Rd, Powell, OH 43065","Great place for family and children outing.", 4.5,waterPark,"/images/small/ZoombeziBaySM.jpg",fun);
        destinationRepo.save(zoombezi);
        Destination bigSplash = new Destination("Big Splash", "2831 Southwest Blvd, Grove City, 43123","Good place with Decent price.", 4.2,waterPark,"/images/small/BigSplashSM.jpg",thriller);
        destinationRepo.save(bigSplash);

        Hashtag competitions = new Hashtag("#Competitive");
        hashtagRepo.save(competitions);
        Category fairs = new Category("Fairs", "/images/small/BigSplashSM.jpg");
        categoryRepo.save(fairs);
        Destination ohioStateFair = new Destination("Ohio State Fair", "717 E 17th Ave, Columbus, OH 43211","It’s no Pawnee Harvest Festival, but it’ll do!", 3.0,fairs,"/images/small/OhioStateFairSM.jpg",competitions);
        destinationRepo.save(ohioStateFair);

        Hashtag globalCuisine = new Hashtag("#GlobalCuisine");
        hashtagRepo.save(globalCuisine);
        Destination minnisotaStateFair = new Destination("Minnesota State Fair", "1265 Snelling Ave N, St Paul, MN 55108","Only place that’s not Las Vegas where you can get married, ride a roller coaster,  and win a hot dog eating contest on the same day!", 4.0,fairs,"/images/small/MinnesotaStateFairSM.jpg",globalCuisine);
        destinationRepo.save(minnisotaStateFair);

        Hashtag entertaining = new Hashtag("#Entertaining");
        hashtagRepo.save(entertaining);
        Category circuses = new Category("Circuses", "/images/small/BigSplashSM.jpg");
        categoryRepo.save(circuses);
        Destination gardenBrothers = new Destination("Garden Brothers Circus", "Myakka City, FL 34251","I liked the horse and elephant shows the best, but the motorcycle act was incredible, and the acrobats were all great", 1.5,circuses,"/images/small/GardenBrosCircusSM.jpg",thriller);
        destinationRepo.save(gardenBrothers);

        Hashtag familyFriendly = new Hashtag("#familyfriendly");
        hashtagRepo.save(familyFriendly);
        Category safariParks = new Category("Safari Parks", "/images/small/BigSplashSM.jpg");
        categoryRepo.save(safariParks);
        Destination theWilds = new Destination("The Wilds", "14000 International Rd, Cumberland, OH 43732","Exceeds all expectations. Must visit, out of this world rare and unforgettable experience", 4.8,safariParks,"/images/small/TheWildsSafariSM.jpg",familyFriendly);
        destinationRepo.save(theWilds);

        Hashtag budgetFriendly = new Hashtag("#budgetfriendly");
        hashtagRepo.save(budgetFriendly);
        Destination safariWest = new Destination("Safari West", "3115 Porter Creek Rd, Santa Rosa, CA 95404","Great experience! Definitely worth it", 4.5,safariParks,"/images/small/SafariWestSM.jpg",budgetFriendly);
        destinationRepo.save(safariWest);

        Hashtag animals = new Hashtag("#Animals");
        hashtagRepo.save(animals);
        Category zoo = new Category("Zoo", "/images/small/BigSplashSM.jpg");
        categoryRepo.save(zoo);
        Destination columbusZoo = new Destination("Columbus Zoo", "4850 W Powell Rd, Powell, OH 43065","The bears gave me a weird look, but I’ll still come back!", 5.0,zoo,"/images/small/ColumbusZooSM.jpg",animals);
        destinationRepo.save(columbusZoo);

        Hashtag beautiful = new Hashtag("#beautiful");
        hashtagRepo.save(beautiful);
        Destination clevelandMetroParksZoo = new Destination("Cleveland Metro Parks Zoo", "3900 Wildlife Way, Cleveland, OH 44109","I want to come back year after year!", 4.0,zoo,"/images/small/ClevelandMetroparksZooSM.jpg",beautiful);
        destinationRepo.save(clevelandMetroParksZoo);




















    }
}
