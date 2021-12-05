package com.example.pagging3.network

data class CharacterData(val name: String?, val species: String?, val image: String?)
data class Info(val count: Int?, val pages: String?, val next: String?,val prev: String?)

data class RickAndMortyList(val info: Info, val results: List<CharacterData> )

/*
"info": {
        "count": 826,
        "pages": 42,
        "next": null,
        "prev": "https://rickandmortyapi.com/api/character?page=41"
    }
 */

//CharacterData
/*
"results": [
        {
            "id": 821,
            "name": "Gotron",
            "status": "unknown",
            "species": "Robot",
            "type": "Ferret Robot",
            "gender": "Genderless",

            "image": "https://rickandmortyapi.com/api/character/avatar/821.jpeg",
 */