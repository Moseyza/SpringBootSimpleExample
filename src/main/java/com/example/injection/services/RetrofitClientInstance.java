package com.example.injection.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
@Configuration
public class RetrofitClientInstance {

   // private  static Retrofit retrofit;

    @Bean
    public  Retrofit getRetrofitInstance(){
        //if(retrofit == null){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
       //}
        return retrofit;
    }
}
