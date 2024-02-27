package com.appdevteam.agrofundxbackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdevteam.agrofundxbackend.dto.request.AppUserRequest;
import com.appdevteam.agrofundxbackend.entity.AppUser;
import com.appdevteam.agrofundxbackend.service.AppUserService;

import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@AllArgsConstructor
@RequestMapping("/api/appuser")
@RestController
public class AppUserController {

    private AppUserService auserv;

    @GetMapping("/get")
    public ResponseEntity<List<AppUser>> getMethodName() {
        return ResponseEntity.ok(auserv.getAllAppUser());
    }
    @PostMapping("/post")
    public ResponseEntity<AppUser> postMethodName(@RequestBody AppUserRequest aur) {
        //TODO: process POST request
        return ResponseEntity.ok(auserv.createAppUser(aur));
    }
    
}
