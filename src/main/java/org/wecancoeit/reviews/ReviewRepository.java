package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review cornRows = new Review(1L, 23, "CornRows", "Half Up, Half Down Braided Ponytail The next hairstyle we have to show you is super stylish! Most of the braids have been left loose with a small section that has been styled into a high ponytail.", "/images/African-Hair-Braiding-Styles.jpg");
        Review senegaleseTwist = new Review(2L, 25, "Senegalese Twist ", "As you see above, you can put these twist styles in updos and various wrap around styles. This would make a gorgeous bridesmaid hairdo, imagine a bridal party rocking these small Senegalese twist crochet hairstyles down the aisle, looking fab-u-lous!", "/images/SenegaleseTwist.jpg");
        Review boxBraids = new Review(3L, 13, "BoxBraids", "Need a glam hairstyle for a special event or maybe you would like to try a new, stylish updo? If so, this is the place to be. We have found 23 of the most beautiful braided updos for black hair. There is a hair idea for", "/images/BoxBraids.jpg");


        reviewsList.put(cornRows.getId(), cornRows);
        reviewsList.put(senegaleseTwist.getId(), senegaleseTwist);
        reviewsList.put(boxBraids.getId(), boxBraids);
    }


    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }

    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}