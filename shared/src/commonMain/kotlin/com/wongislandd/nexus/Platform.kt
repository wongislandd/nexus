package com.wongislandd.nexus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform