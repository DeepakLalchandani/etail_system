package org.etail.dao.impl;

import java.util.ArrayList;
import java.util.List;

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
        userDTO.setFirst_name(user.getFirstName());
        userDTO.setLast_name(user.getLastName());
        userDTO.setPassword(user.getPassword());
        userDTO.setUser_role_type(user.getUserRoleType());
        userDTO.setEmail(user.getEmail());

        return userDTO;
    }

    public List<UserDTO> findAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOs = new ArrayList<>();

        users.forEach((user) -> {
            UserDTO userDTO = new UserDTO();
            userDTO.setUserId(user.getUserId());
            userDTO.setFirst_name(user.getFirstName());
            userDTO.setLast_name(user.getLastName());
            userDTO.setPassword(user.getPassword());
            userDTO.setUser_role_type(user.getUserRoleType());
            userDTO.setEmail(user.getEmail());
            userDTOs.add(userDTO);
        });

        return userDTOs;
    }

    public UserDTO findByFirstNameAndEmail(String firstName, String email) {
        User user = userRepository.findByFirstNameAndEmail(firstName, email);
        UserDTO userDTO = new UserDTO();

        userDTO.setUserId(user.getUserId());
        userDTO.setFirst_name(user.getFirstName());
        userDTO.setLast_name(user.getLastName());
        userDTO.setPassword(user.getPassword());
        userDTO.setUser_role_type(user.getUserRoleType());
        userDTO.setEmail(user.getEmail());

        return userDTO;
    }

    public List<UserDTO> findAllOrderByFirstName() {
        List<User> users = userRepository.findAllByOrderByFirstNameDesc();
        List<UserDTO> userDTOs = new ArrayList<>();

        users.forEach((user) -> {
            UserDTO userDTO = new UserDTO();
            userDTO.setUserId(user.getUserId());
            userDTO.setFirst_name(user.getFirstName());
            userDTO.setLast_name(user.getLastName());
            userDTO.setPassword(user.getPassword());
            userDTO.setUser_role_type(user.getUserRoleType());
            userDTO.setEmail(user.getEmail());
            userDTOs.add(userDTO);
        });

        return userDTOs;
    }
}
