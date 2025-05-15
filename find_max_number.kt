
fun findMaxNumber(numbers: List<Int>): Int {
    // اگر لیست خالی بود، یه استثنا (Exception) پرتاب می‌کنیم چون بیشترین عدد معنی نداره
    if (numbers.isEmpty()) {
        throw IllegalArgumentException("List is empty")
    }

    // فرض می‌کنیم اولین عدد بزرگترینه (برای شروع مقایسه)
    var max = numbers[0]

    // حالا بقیه‌ی لیست رو چک می‌کنیم
    for (number in numbers) {
        // اگه عدد فعلی از مقدار max بزرگتر بود، مقدار max رو آپدیت می‌کنیم
        if (number > max) {
            max = number
        }
    }

    // در نهایت max رو که بزرگ‌ترین عدده برمی‌گردونیم
    return max
}

// یه نمونه استفاده از تابع بالا
fun main() {
    val myList = listOf(12, 45, 3, 98, 23)
    val maxNumber = findMaxNumber(myList)
    println("Bozorgtarin adad: $maxNumber")
}
