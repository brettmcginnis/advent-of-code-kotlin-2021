fun countIncreaseFromPrevious(input: List<Int>): Int {
    var count = 0

    input.forEachIndexed { index, current ->
        val next = input.getOrNull(index + 1)

        next?.let { if (it > current) count++ }
    }

    return count
}

fun sumForward(input: List<Int>): List<Int> {
    val updated = mutableListOf<Int>()

    input.forEachIndexed { index, current ->
        updated.add(current + input.getOrElse(index + 1) { 0 } + input.getOrElse(index + 2) { 0 })
    }

    return updated
}

fun main() {
    val input = readInput("Day01")
    val nums = input.map { it.toInt() }
    println(countIncreaseFromPrevious(nums)) // part 1
    println(countIncreaseFromPrevious(sumForward(nums))) // part 1
}
