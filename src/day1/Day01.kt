package day1

import java.io.File

private fun countIncreaseFromPrevious(input: List<Int>) = input.windowed(2).count { (a, b) -> a < b }

private fun sumForward(input: List<Int>): List<Int> = input.windowed(3).map { it.sum() }

fun main() {
    val input =  File("src/day1", "Day01.txt").readLines()
    val nums = input.map { it.toInt() }
    println(countIncreaseFromPrevious(nums)) // part 1
    println(countIncreaseFromPrevious(sumForward(nums))) // part 2
}
