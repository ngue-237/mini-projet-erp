package com.miniprojet.gestionuser.Services;

import com.miniprojet.gestionuser.Models.User;
import com.miniprojet.gestionuser.Repositories.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(final  String id){
        return  userRepository.findById(id);
    }

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(final String id) {
        userRepository.deleteById(id);
    }

    public User saveUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    public User editUser(final String id,User newUser){
        if (userRepository.findById(id).isPresent()){
            User editedUser = userRepository.findById(id).get();
            editedUser.setAdresse(newUser.getAdresse());
            editedUser.setNom(newUser.getNom());
            editedUser.setPrenom(newUser.getPrenom());
            editedUser.setTel(newUser.getTel());
            editedUser.setEmail(newUser.getEmail());
            editedUser.setRole(newUser.getRole());
            return userRepository.save(editedUser);
        }
        else {
            return null;
        }
    }
}
