package com.example.randomgenerator

sealed class Screens (val screen: String){
    data object Home: Screens("home") //data object mostly used as singleton
    data object Search: Screens("search")
    data object Notification: Screens("notification")
    data object Profile: Screens("profile")

}