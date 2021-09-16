
package com.springbootexample.backend.api;

import com.springbootexample.backend.dto.UserViewDTO;
import com.springbootexample.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserAPI {
    
    private final UserService userService;
    
    @GetMapping("v1/user/{id}")
    public ResponseEntity<UserViewDTO> getUserById(@PathVariable Long id)
    {
          final UserViewDTO userViewDTO = userService.getUserById(id);
        return ResponseEntity.ok(userViewDTO);
    }
    
}
