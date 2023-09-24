package org.etail.service.impl;

import org.etail.dao.IUserDAO;
import org.etail.model.dto.UserDTO;
import org.etail.repository.UserRepository;
import org.etail.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserDAO userDAO;

    public UserDTO getUserById(String userId) {
        UserDTO userDTO = userDAO.findByUserId(userId);
        return userDTO;
    }
}
