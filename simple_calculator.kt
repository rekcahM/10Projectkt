
fun calculator(a: Double, b: Double, op: Char): Double {
    return when (op) {
        '+' -> a + b  // جمع
        '-' -> a - b  // تفریق
        '*' -> a * b  // ضرب
        '/' -> {
            if (b == 0.0) {
                throw IllegalArgumentException("Taqsim bar sefr mojaz nist")
            }
            a / b  // تقسیم
        }
        else -> throw IllegalArgumentException("Amaliyat na motabar ast")
    }
}

// تست تابع ماشین حساب
fun main() {
    val num1 = 10.0
    val num2 = 5.0

    println("Jam: ${calculator(num1, num2, '+')}")
    println("Tafriq: ${calculator(num1, num2, '-')}")
    println("Zarb: ${calculator(num1, num2, '*')}")
    println("Taqsim: ${calculator(num1, num2, '/')}")
}
