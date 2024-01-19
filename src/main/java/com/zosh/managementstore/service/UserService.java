package com.zosh.managementstore.service;

import com.zosh.managementstore.exception.UserException;
import com.zosh.managementstore.modal.User;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {
    public User findUserById(Long userId) throws UserException;
    public User findUserProfileByJwt(String jwt) throws UserException;
}
