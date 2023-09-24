package org.etail.dao;

import org.etail.model.dto.UserDTO;

public interface IUserDAO {
    public UserDTO findByUserId(String userId);
}
