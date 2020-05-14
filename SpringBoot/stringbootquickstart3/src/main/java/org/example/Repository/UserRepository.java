package org.example.Repository;

import org.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-05-14 22:00
 */
public interface UserRepository extends JpaRepository<User,Long> {
    public List<User> findAll();
}
