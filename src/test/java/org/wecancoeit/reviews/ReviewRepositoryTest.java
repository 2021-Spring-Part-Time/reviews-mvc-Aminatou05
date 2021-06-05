package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {
    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, 23, "review one name", "description", "CornRows");
    private Review reviewTwo = new Review(2L, 25, "review two name", "description", "Senegalese Twist");
    private Review reviewThree = new Review(3L, 13, "review three name", "description", "Box Braids");


    @Test
    public void shouldFindReviewOne() {
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);

    }

    @Test
    public void shouldFindReviewOneReviewTwoAndReviewThree() {
        underTest = new ReviewRepository(reviewOne, reviewTwo, reviewThree);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo, reviewThree);

    }
}
