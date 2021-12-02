package day2

import java.io.File

private val input = File("src/day2", "Day02.txt").readLines()

data class Vector(
    val up: Int = 0,
    val down: Int = 0,
    val forward: Int = 0,
)

private fun List<String>.parse(): Vector {
    var vector = Vector()

    forEach { d ->
        val split = d.split(" ")

        val command = split.getOrNull(0) ?: ""
        val amount = split.getOrNull(1)?.toInt() ?: 0

        when (command) {
            "up" -> vector = vector.copy(up = vector.up + amount)
            "down" -> vector = vector.copy(down = vector.down + amount)
            "forward" -> vector = vector.copy(forward = vector.forward + amount)
        }
    }

    return vector
}

fun main() {
    val vector = input.parse()
    println(vector.forward * (vector.down - vector.up))
}
