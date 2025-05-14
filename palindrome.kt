
// palindrome.kt

// In tabe check mikone ke aya yek string palindrome hast ya na
fun isPalindrome(text: String): Boolean {
    // toLowerCase mikonim ta be horoof bozorg/kochik hassas nabashe
    val cleanText = text.lowercase()

    // string ro reverse mikonim
    val reversed = cleanText.reversed()

    // agar string ba reverse es yeki bashe yani palindrome hast
    return cleanText == reversed
}

// inja tabe ro test mikonim ba chand meghdar
fun main() {
    val examples = listOf("madam", "racecar", "hello", "1221", "Test")

    for (word in examples) {
        if (isPalindrome(word)) {
            println("$word is a palindrome")
        } else {
            println("$word is NOT a palindrome")
        }
    }
}
