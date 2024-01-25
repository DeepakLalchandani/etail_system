package org.etail.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.etail.model.dto.UserDTO;
import org.etail.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * System Code : E-tail System
 * Class Name : UserController
 * Description : Rest Controller used for below
 * activities and the workflow by Buyer & Seller.
 * Add user details, Update User Details,
 * 
 * @version 1.0.0
 * @since 2024/Jan/05 Initial Version.
 * @author Sabari. All Rights Reserved Copyright(c) JavaCafee LTD.,
 * 
 */
@RestController
@RequestMapping("/users/api")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    /**
     * This method is used to get user details
     * 
     * @param id
     * @return ResponseEntity<UserDTO>
     */
    @GetMapping(value = { "/", "/{userid}" })
    public ResponseEntity<List<UserDTO>> getUsersOrUserById(
            @PathVariable(name = "userid", required = false) Optional<String> id) {
        UserDTO userDTO = null;
        if (id.isPresent()) {
            String userId = id.get();
            userDTO = userService.getUserById(userId);
            List<UserDTO> userDTOs = new ArrayList<>();
            userDTOs.add(userDTO);
            return ResponseEntity.ok(userDTOs);
        } else {
            List<UserDTO> userDTOs = userService.getUsers();
            return ResponseEntity.ok(userDTOs);
        }
    }

    @GetMapping(value = { "/usernames" })
    public ResponseEntity<List<String>> getUsers() {
        List<String> userFirstNames = userService.getAllUsersFirstName();
        return ResponseEntity.ok(userFirstNames);
    }

    @GetMapping("/{firstName}/{email}")
    public ResponseEntity<UserDTO> getUserByFirstNameAndEmail(@PathVariable String firstName,
            @PathVariable String email) {
        UserDTO userDTO = userService.getUserByFirstNameAndEmail(firstName, email);
        return ResponseEntity.ok(userDTO);
    }
}