package com.mugar97.controllers;

import com.mugar97.converters.UserMapper;
import com.mugar97.domain.UserCommand;
import com.mugar97.entities.User;

/**
 * Created by jt on 2018-12-16.
 */
public class UserController {

    User saveUser(UserCommand command) {

        // fake impl
        return UserMapper.INSTANCE.userCommandToUser(command);
    }

}
