package org.etail.service;

import org.etail.model.dto.UserDTO;

public interface IUserService {
    public UserDTO getUserById(String userId);
}
