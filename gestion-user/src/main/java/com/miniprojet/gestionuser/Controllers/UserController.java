package com.miniprojet.gestionuser.Controllers;

import com.miniprojet.gestionuser.Models.User;
import com.miniprojet.gestionuser.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Validated
@RequestMapping(value = "/userManager")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public Iterable<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable("id") final  String id){
        Optional<User> user= userService.getUser(id);
        if (user.isPresent()) {
            return user.get();
        }else {
            return null;
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> postUser(@RequestBody User user){
        return  new ResponseEntity<> (userService.saveUser(user),HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable("id") final String id){
        userService.deleteUser(id);
    }
}
