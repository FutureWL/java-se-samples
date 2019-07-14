package io.github.futurewl.controller;

import io.github.futurewl.repository.RoleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai
 */
@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleRepository roleRepository;

    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping("/{roleId}")
    public String get(@PathVariable Long roleId) {
        return roleRepository.findById(roleId).get().toString();
    }
}
