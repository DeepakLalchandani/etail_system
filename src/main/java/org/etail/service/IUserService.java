package org.etail.service;

import java.util.List;

import org.etail.model.dto.UserDTO;

public interface IUserService {
    public UserDTO getUserById(String userId);

    public List<UserDTO> getUsers();

    public UserDTO getUserByFirstNameAndEmail(String firstName, String email);

    public List<String> getAllUsersFirstName();
}
