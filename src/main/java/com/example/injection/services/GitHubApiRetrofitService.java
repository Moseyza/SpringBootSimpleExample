package com.example.injection.services;

import com.example.injection.models.GithubRepository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface GitHubApiRetrofitService {
    @GET("/users/{userName}/repos")
    Call<List<GithubRepository>> getUserRepositories(@Path("userName") String userName);
}
