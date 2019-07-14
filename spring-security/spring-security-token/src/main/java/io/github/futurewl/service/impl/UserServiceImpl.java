package io.github.futurewl.service.impl;

import io.github.futurewl.entity.User;
import io.github.futurewl.repository.UserRepository;
import io.github.futurewl.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findById(Long userId) {
        return userRepository.findById(userId).get();
    }
}
