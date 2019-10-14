package com.car.maintain

enum class Direction {
    NORTH, SOUTH, EAST, WEIGHT
}

fun main() {
    val userRedirection = Direction.SOUTH;
    if (userRedirection == Direction.SOUTH) {
        println("You are at south")
    }
}