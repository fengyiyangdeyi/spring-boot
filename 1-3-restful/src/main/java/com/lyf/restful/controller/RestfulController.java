package com.lyf.restful.controller;

import com.lyf.restful.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author liyingfeng
 */
@RestController
@RequestMapping("restful")
public class RestfulController {

    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<>());

    @GetMapping(value = {""})
    public List<User> getUserList() {
        List<User> r = new ArrayList<>(users.values());
        return r;
    }

    @PostMapping(value = "")
    public String postUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @PutMapping(value = "/{id}")
    public String putUser(@PathVariable Long id, @RequestBody User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @DeleteMapping(value = "/{id}")
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }
}
