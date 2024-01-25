package org.etail.repository;

import java.util.List;

import org.etail.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    public User findByUserId(String userId);

    public User findByFirstNameAndEmail(String firstName, String email);

    public List<User> findAllByOrderByFirstNameDesc();
}
