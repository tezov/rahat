package com.tezov.rahat.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform