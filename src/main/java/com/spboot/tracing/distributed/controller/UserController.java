package com.spboot.tracing.distributed.controller;


import com.spboot.tracing.distributed.model.User;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

  @GetMapping
  public ResponseEntity<User> getUsers() {
    log.info("Request Received at USerController");
    return ResponseEntity.ok(User.builder().firstName("Dave").lastName("Beaumont")
        .emailId("dave@gmail.com").permissions(
        Arrays.asList("Authz_READ")).build());
  }
}
