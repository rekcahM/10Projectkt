
// factorial.kt

// Tabe factorial ke ye adad sahih mosbat ro migire va factorial esho hesab mikone.
fun factorial(n: Int): Int {
    // Agar adad 0 ya 1 bashe, factorial esho mishe 1 (base case)
    if (n == 0 || n == 1) {
        return 1
    }
    // Dar gheyre in surat, factorial ro ba estefade az tabe bazgashti hesab mikonim
    return n * factorial(n - 1)
}

// Dar inja test mikonim tabe ro ba meghdar 5
fun main() {
    val number = 5
    val result = factorial(number)
    println("Factorial $number is: $result")  // Bayad chap kone: Factorial 5 is: 120
}
