package com.example.github.Interfaces

import com.example.github.Model.DetailUserData
import com.example.github.Model.FollowData
import com.example.github.Model.SearchResponse
import com.example.github.Model.UserData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubService {

    @GET("users")
    @Headers("Authorization: token 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")
    fun getListUsers(): Call<List<UserData>>

    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ) : Call<SearchResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserData(
        @Path("username") username: String
    ): Call<DetailUserData>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<List<FollowData>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<List<FollowData>>
}