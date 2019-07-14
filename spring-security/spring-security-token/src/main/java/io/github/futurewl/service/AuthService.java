package io.github.futurewl.service;

import io.github.futurewl.entity.User;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface AuthService {
    String login(String username, String password);

    User register(User userToAdd);

}
