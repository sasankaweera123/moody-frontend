package me.moody.frontend.service;

import me.moody.frontend.document.Reviews;
import me.moody.frontend.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewsService {

    private final ReviewsRepository reviewsRepository;

    @Autowired
    public ReviewsService(ReviewsRepository reviewsRepository) {
        this.reviewsRepository = reviewsRepository;
    }

    public List<Reviews> getAllReviews() {
        return reviewsRepository.findAll();
    }

    public Reviews getReviewById(int id) {
        return reviewsRepository.findById(id).orElseThrow(() -> new IllegalStateException("Review not found for id: " + id));
    }
    public void addReviews(Reviews reviews) {
        reviewsRepository.save(reviews);
    }

    public void deleteReviews(int id) {
        boolean exists = reviewsRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Review with id " + id + " does not exists");
        }
        reviewsRepository.deleteById(id);
    }

}
