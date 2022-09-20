package com.microservice.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kube")
public class KubernetesController {

    @GetMapping("/message")
    public String getMessage(){
        return "Welcome to the Kubernetes!";
    }
}
