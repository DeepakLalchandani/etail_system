package org.etail.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.etail.dao.IUserDAO;
import org.etail.model.dto.UserDTO;
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

    public List<UserDTO> getUsers() {
        List<UserDTO> userDTO = userDAO.findAllUsers();
        return userDTO;
    }

    public UserDTO getUserByFirstNameAndEmail(String firstName, String email) {
        UserDTO userDTO = userDAO.findByFirstNameAndEmail(firstName, email);
        return userDTO;
    }

    public List<String> getAllUsersFirstName() {
        List<UserDTO> userDTOs = userDAO.findAllOrderByFirstName();

        List<String> userFirstNames = new ArrayList<>();

        userDTOs.forEach(user -> userFirstNames.add(user.getFirst_name()));

        return userFirstNames;
    }
}
