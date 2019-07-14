package io.github.futurewl.service;

import io.github.futurewl.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface UserService extends UserDetailsService {
    User findById(Long userId);
}
