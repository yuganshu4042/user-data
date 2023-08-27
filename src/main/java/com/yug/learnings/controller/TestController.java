package com.yug.learnings.controller;

import com.yug.learnings.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private List<User> userDB = new ArrayList<>();


  @GetMapping("/get/users")
  public ResponseEntity<Object> getName() {
    return ResponseEntity.ok(userDB);
  }

  @PostMapping
  public ResponseEntity<Object> saveUser(@RequestBody User user) {

    if (user != null) {
      userDB.add(user);
      return ResponseEntity.ok("User Saved Succesfully");
    } else {
      return ResponseEntity.badRequest().body("Please provide the details");
    }
  }


}
