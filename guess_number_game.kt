
import kotlin.random.Random
import java.util.Scanner

fun guessNumberGame() {
    val randomNumber = Random.nextInt(1, 101)  // عدد تصادفی بین 1 تا 100
    val scanner = Scanner(System.`in`)
    var guess: Int
    var attempts = 0

    println("Hadse adad (1 ta 100) ra bezan!")

    while (true) {
        print("Adad khod ra vared kon: ")
        guess = scanner.nextInt()
        attempts++

        when {
            guess < randomNumber -> println("Bozorgtar az in adad ast.")
            guess > randomNumber -> println("Koochiktar az in adad ast.")
            else -> {
                println("Afarin! Adad dorost bood: $randomNumber")
                println("Tedad hads ha: $attempts")
                break
            }
        }
    }
}

fun main() {
    guessNumberGame()
}
