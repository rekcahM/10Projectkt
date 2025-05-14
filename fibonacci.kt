
// fibonacci.kt

// In tabe n ta az adad haye avaliye dabolaye Fibonacci ro chap mikone
fun printFibonacci(n: Int) {
    var a = 0  // adad aval dabolaye
    var b = 1  // adad dovom dabolaye

    // agar n kamtar ya mosavi 0 bashe, hich kari nemikonim
    if (n <= 0) {
        println("Please enter a number greater than 0")
        return
    }

    // adad aval ro chap mikonim
    print("$a ")

    // agar n az 1 bishtar bashe, adad dovom ro ham chap mikonim
    if (n > 1) {
        print("$b ")
    }

    // az adad sevom be bad ro ba loop hesab mikonim
    for (i in 3..n) {
        val c = a + b  // adad jadid barabar ba majmooe do adad ghabli
        print("$c ")   // chapesh mikonim
        a = b          // a ro update mikonim
        b = c          // b ro ham update mikonim
    }

    println() // baraye raftan be satr jadid
}

// inja tabe ro test mikonim baraye 10 adad
fun main() {
    val count = 10
    println("First $count Fibonacci numbers are:")
    printFibonacci(count)
}
