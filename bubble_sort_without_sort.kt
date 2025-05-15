
fun bubbleSort(numbers: MutableList<Int>): List<Int> {
    // به تعداد اعضای لیست، حلقه می‌زنیم
    for (i in 0 until numbers.size) {
        // حلقه داخلی برای مقایسه و جابجایی عناصر
        for (j in 0 until numbers.size - i - 1) {
            // اگر عنصر فعلی از عنصر بعدی بزرگتر بود، جاشون رو عوض می‌کنیم
            if (numbers[j] > numbers[j + 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }
    // لیست مرتب‌شده رو برمی‌گردونیم
    return numbers
}

// نمونه استفاده از تابع مرتب‌سازی
fun main() {
    val myList = mutableListOf(64, 34, 25, 12, 22, 11, 90)
    val sortedList = bubbleSort(myList)
    println("Liste moratab shode: $sortedList")
}
