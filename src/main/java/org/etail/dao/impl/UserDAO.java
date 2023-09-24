package org.etail.dao.impl;

import org.etail.dao.IUserDAO;
import org.etail.model.dto.UserDTO;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO implements IUserDAO {
    public UserDTO findByUserId(String userId) {
        return null;
    }
}
