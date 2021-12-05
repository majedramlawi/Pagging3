package com.example.pagging3.network

import com.example.pagging3.network.RickAndMortyList
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {

    //https://rickandmortyapi.com/api/character?page=1
    @GET("character")
    suspend fun getDataFromAPI(
        @Query("page") page: Int,
        @Query("query") query: String,
    ): RickAndMortyList
}

/*
@GET("posts")
    suspend fun getCustomPosts(
        @Query("userId") userId: Int,
        @Query("_sort") sort: String,
        @Query("_order") order: String
    ): Response<List<PostDto>>
 */
/*
{
    "info": {
        "count": 826,
        "pages": 42,
        "next": "https://rickandmortyapi.com/api/character?page=2",
        "prev": null
    },
    "results": [
        {
            "id": 1,
            "name": "Rick Sanchez",
            "status": "Alive",
 */

/*
{
    "info": {
        "count": 826,
        "pages": 42,
        "next": "https://rickandmortyapi.com/api/character?page=3",
        "prev": "https://rickandmortyapi.com/api/character?page=1"
    },
    "results": [
        {
            "id": 21,
            "name": "Aqua Morty",
            "status": "unknown",
            "species": "Humanoid",
 */

/*
{
    "info": {
        "count": 826,
        "pages": 42,
        "next": null,
        "prev": "https://rickandmortyapi.com/api/character?page=41"
    },
    "results": [
        {
            "id": 821,
            "name": "Gotron",
            "status": "unknown",
 */