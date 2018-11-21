package org.sopt.report2.api;

import org.sopt.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController
public class UserController {

    private final static List<User> userList = new LinkedList<>();

    @GetMapping("")
    public String getTime() {
        return new Date().toString();
    }

    @GetMapping("/users")
    public String getUser(
            @RequestParam(value = "name",defaultValue = "") final String name,
            @RequestParam(value = "part",defaultValue = "") final String part
    ) {
        if (name.equals("") && part.equals("")) {
            return userList.toString();
        }else{
            for (User u : userList) {
                if (!name.equals("")) {
                    if (u.getName().equals(name)) {
                        return u.toString();
                    }
                } else if (!part.equals("")) {
                    if (u.getPart().equals(part)) {
                        return u.toString();
                    }
                }
            }
        }
        return "없습니다.";
    }

    @GetMapping("/users/{user_idx}")
    public String findByUser_idx(@PathVariable final int user_idx) {
        for (User u : userList) {
            if (u.getUser_idx() == user_idx) {
                return u.toString();
            }
        }
        return "없습니다.";
    }

    @PostMapping("/users")
    public String postUser(@RequestBody final User user) {
        userList.add(user);
        return user.getName();
    }

    @PutMapping("/users/{user_idx}")
    public String putUser(@PathVariable final int user_idx,
                          @RequestBody final String name, @RequestBody final String part) {
        for (User u : userList) {
            if (u.getUser_idx() == user_idx) {
                u.setName(name);
                u.setPart(part);
                return "update success";
            }
        }
        return "This user doesn't exist";
    }

    @DeleteMapping("/users/{user_idx}")
    public String deleteUser(@PathVariable final int user_idx) {
        for (User u : userList) {
            if (u.getUser_idx() == user_idx) {
                userList.remove(u);
                return "delete success";
            }
        }
        return "This user doesn't exist";
    }

}
