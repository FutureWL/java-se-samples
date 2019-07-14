package io.github.futurewl.controller;

import io.github.futurewl.entity.User;
import io.github.futurewl.service.AuthService;
import io.github.futurewl.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * 功能描述：
 *
 * @author weilai
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final AuthService authService;
    private final UserService userService;

    public UserController(
            AuthService authService,
            UserService userService) {
        this.authService = authService;
        this.userService = userService;
    }

    @PostMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/login")
    public String login(User user) {
        return authService.login(user.getUsername(), user.getPassword());
    }

    @PostMapping("/register")
    public User register(User user) {
        return authService.register(user);
    }

    @GetMapping("/{userId}")
    public String get(@PathVariable Long userId) {
        return userService.findById(userId).toString();
    }

}
