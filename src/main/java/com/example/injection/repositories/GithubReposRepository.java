package com.example.injection.repositories;

import com.example.injection.dao.DatabaseCrudRepository;
import com.example.injection.models.GithubRepository;
import com.example.injection.models.RepositoryModel;
import com.example.injection.services.GitHubApiRetrofitService;
import com.example.injection.services.RetrofitClientInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository

public class GithubReposRepository {


    private final DatabaseCrudRepository crudRepository;
    private final Retrofit retrofit;

    public GithubReposRepository(DatabaseCrudRepository crudRepository, Retrofit retrofit) {
        this.crudRepository = crudRepository;
        this.retrofit = retrofit;
    }

    public List<GithubRepository> getUserReposFromGithubApi(String userName) throws IOException {
        //Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        GitHubApiRetrofitService githubApiRetrofit = retrofit.create(GitHubApiRetrofitService.class);
        Call<List<GithubRepository>> allRepositories = githubApiRetrofit.getUserRepositories(userName);
        Response<List<GithubRepository>> execute = allRepositories.execute();
        List<GithubRepository> repositories = execute.body();
        return repositories;
    }

    public void SaveUserReposInDatabase( List<GithubRepository>  githubRepositories) {

        for (GithubRepository githubRepository :
                githubRepositories) {
            RepositoryModel model =  this.crudRepository.findByRepositoryid(githubRepository.getId());
            if (model == null) {
                crudRepository.save(new RepositoryModel(null, githubRepository.getId(), githubRepository.getNodeId(), githubRepository.getName(), githubRepository.getFullName(), githubRepository.getHtmlUrl(), githubRepository.getDescription()));
            }
        }
    }
}
