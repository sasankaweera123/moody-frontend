package me.moody.frontend.service;

import me.moody.frontend.document.ProductPolarity;
import me.moody.frontend.document.Reviews;
import me.moody.frontend.repository.ReviewsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ReviewsServiceTest {

    @Mock
    private ReviewsRepository reviewsRepository;
    private ReviewsService underTest;

    @BeforeEach
    void setUp() {
        underTest = new ReviewsService(reviewsRepository);
    }
    @Test
    void getAllReviews() {
        underTest.getAllReviews();
        verify(reviewsRepository).findAll();
    }

    @Test
    void getReviewById() {
        int id = 3;
        Reviews mockReview = new Reviews("1","1","1",1);
        when(reviewsRepository.findById(id)).thenReturn(Optional.of(mockReview));
        Reviews reviews = underTest.getReviewById(id);
        assertThat(reviews).isEqualTo(mockReview);
        verify(reviewsRepository).findById(id);
    }
}