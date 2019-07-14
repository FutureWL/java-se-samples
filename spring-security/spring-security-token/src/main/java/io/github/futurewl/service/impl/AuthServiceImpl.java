package io.github.futurewl.service.impl;

import io.github.futurewl.entity.User;
import io.github.futurewl.repository.UserRepository;
import io.github.futurewl.service.AuthService;
import io.github.futurewl.service.UserService;
import io.github.futurewl.util.JwtTokenUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil;

    public AuthServiceImpl(
            UserRepository userRepository,
            UserService userService,
            AuthenticationManager authenticationManager,
            JwtTokenUtil jwtTokenUtil) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.authenticationManager = authenticationManager;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public String login(String username, String password) {
        UsernamePasswordAuthenticationToken upToken = new UsernamePasswordAuthenticationToken(username, password);
        final Authentication authentication = authenticationManager.authenticate(upToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final UserDetails userDetails = userService.loadUserByUsername(username);
        return jwtTokenUtil.generateToken(userDetails);

    }

    @Override
    public User register(User user) {
        final String username = user.getUsername();
        if (userRepository.findByUsername(username) != null) {
            return null;
        }
        final String rawPassword = user.getPassword();
        user.setPassword(new BCryptPasswordEncoder().encode(rawPassword));
        return userRepository.save(user);

    }
}
