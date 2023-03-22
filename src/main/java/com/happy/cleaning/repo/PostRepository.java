package com.happy.cleaning.repo;

import com.happy.cleaning.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
