package me.moody.frontend.repository;

import me.moody.frontend.document.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {
}
