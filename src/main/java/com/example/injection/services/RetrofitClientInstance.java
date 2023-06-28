package com.example.injection.services;

import com.example.injection.configs.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
@Configuration
public class RetrofitClientInstance {

   // private  static Retrofit retrofit;

    final
    Config config;

    public RetrofitClientInstance(Config config) {
        this.config = config;
    }


    @Bean
    public  Retrofit getRetrofitInstance(){
        //if(retrofit == null){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(config.getBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
       //}
        return retrofit;
    }
}
