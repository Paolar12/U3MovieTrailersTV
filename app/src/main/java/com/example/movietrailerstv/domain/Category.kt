package com.example.movietrailerstv.domain

enum class Category(val id: String) {
    POPULAR("popularity.desc"),
    NEW("release_date.desc"),
    VOTES("vote_average.desc"),
    REVENUE("revenue.desc")
}