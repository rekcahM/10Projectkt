
fun countLetters(text: String): Map<Char, Int> {
    val countMap = mutableMapOf<Char, Int>()  // یه مپ برای نگه داشتن تعداد هر حرف

    for (char in text) {
        // اگه حرف قبلاً وجود داشته باشه، مقدارش رو یکی زیاد می‌کنیم
        // وگرنه مقدارش رو یک می‌ذاریم
        if (char in countMap) {
            countMap[char] = countMap[char]!! + 1
        } else {
            countMap[char] = 1
        }
    }

    return countMap
}

// تست تابع با رشته "hello"
fun main() {
    val result = countLetters("hello")
    println("Tedad harfha: $result")
}
