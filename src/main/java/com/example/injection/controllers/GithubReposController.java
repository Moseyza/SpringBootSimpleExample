package com.example.injection.controllers;


import com.example.injection.models.GithubRepository;
import com.example.injection.repositories.GithubReposRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/repos")
public class GithubReposController {


    private final GithubReposRepository reposRepository;
    public GithubReposController(GithubReposRepository reposRepository) {
        this.reposRepository = reposRepository;
    }

    @GetMapping()
    public ResponseEntity getUserRepos(@RequestParam(value = "user", required = true) String user){
        try {
            List<GithubRepository> githubRepositories = this.reposRepository.getUserReposFromGithubApi(user);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            reposRepository.SaveUserReposInDatabase(githubRepositories);
            return  new ResponseEntity(githubRepositories, headers, HttpStatus.OK);
        } catch (IOException e) {
            return  new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
