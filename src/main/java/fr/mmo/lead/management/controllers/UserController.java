package fr.mmo.lead.management.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mmo.lead.management.domain.dtos.UserCreate;
import fr.mmo.lead.management.domain.dtos.UserExistanceView;
import fr.mmo.lead.management.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
	// super();
	this.service = service;
    }

    @PostMapping
    public void create(@Valid @RequestBody UserCreate dto) {
	service.create(dto);
    }

    @GetMapping("/{username}")
    public UserExistanceView getUserExistance(@PathVariable("username") String userName) {
	return service.getUserExistance(userName);
    }
}
