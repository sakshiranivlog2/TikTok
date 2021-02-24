package com.example.newapplication.Responses;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("posts.php")
    Call<Users> performAllPosts();
}
