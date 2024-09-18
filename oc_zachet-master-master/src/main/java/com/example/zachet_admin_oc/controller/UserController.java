package com.example.zachet_admin_oc.controller;



import com.example.zachet_admin_oc.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/get_all_users")
    public List<User> getAllUsers() {
        List usr = new ArrayList<>();
        User user1 = new User(1, "Ilya");
        User user2 = new User(2, "Nikita");
        User user3 = new User(1, "Danya");
        User user4 = new User(1, "Denis");
        User user5 = new User(1, "Kirill");
        usr.add(user1);
        usr.add(user2);
        usr.add(user3);
        usr.add(user4);
        usr.add(user5);
        return usr;
    }
}
