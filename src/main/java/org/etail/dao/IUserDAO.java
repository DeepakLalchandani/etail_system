package org.etail.dao;

import org.etail.model.entity.User;

public interface UserDAO {
    public User findByUserId(String userId);
}
