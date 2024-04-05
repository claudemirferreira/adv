package com.setebit.adv;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("")
public class SampleController {
    @GetMapping
    public ResponseEntity<String> find() {
        return ResponseEntity.ok().body("ok");
    }
}
