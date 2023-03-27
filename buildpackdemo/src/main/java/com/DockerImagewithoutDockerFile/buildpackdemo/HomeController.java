package com.DockerImagewithoutDockerFile.buildpackdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Welcome to this SpringBoot Application " +
                "to create a Docker Image " +
                "without Docker File !! ";
    }
}
