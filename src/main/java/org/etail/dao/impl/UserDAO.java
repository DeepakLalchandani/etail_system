package org.etail.dao.impl;

import org.etail.dao.IUserDAO;
import org.etail.model.dto.UserDTO;
import org.etail.model.entity.User;
import org.etail.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO implements IUserDAO {

    @Autowired
    UserRepository userRepository;

    public UserDTO findByUserId(String userId) {
        User user = userRepository.findByUserId(userId);
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setFirst_name(user.getFirst_name());
        userDTO.setLast_name(user.getLast_name());
        userDTO.setPassword(user.getPassword());
        userDTO.setUser_role_type(user.getUser_role_type());
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }
}
