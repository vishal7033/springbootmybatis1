package com.mybatis.springbootmybatis2.controller;

import com.mybatis.springbootmybatis2.mapper.Usermapper;
import com.mybatis.springbootmybatis2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class Usercontroller {

    @Autowired
    private Usermapper usermapper;

    @GetMapping("/all")
    public List<User> getAllUsersWithPuja() {
        return usermapper.getAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return usermapper.getUserById(id);
    }

    @PostMapping("/all")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        int result = usermapper.insertUser(user);

        if (result > 0) {
            return ResponseEntity.status(HttpStatus.CREATED).body("User added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add user");
        }
    }

    @PutMapping("/all")
    public int updateUser(@RequestBody User user) {
        return usermapper.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public int deleteUser(@PathVariable Integer id) {
        return usermapper.deleteUser(id);
    }
}
