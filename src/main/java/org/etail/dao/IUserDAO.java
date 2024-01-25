package org.etail.dao;

import java.util.List;

import org.etail.model.dto.UserDTO;

public interface IUserDAO {
    public UserDTO findByUserId(String userId);

    public List<UserDTO> findAllUsers();

    public UserDTO findByFirstNameAndEmail(String firstName, String email);

    public List<UserDTO> findAllOrderByFirstName();
}
