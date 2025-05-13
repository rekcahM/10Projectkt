
fun main() {
    // از کاربر می‌خوایم یه رشته وارد کنه
    println("یه رشته وارد کن:")
    val input = readLine()

    // اگه رشته خالی بود یا چیزی وارد نشد، پیام خطا میدیم
    if (input.isNullOrEmpty()) {
        println("رشته‌ای وارد نشده!")
        return
    }

    // رشته رو معکوس می‌کنیم
    val reversed = input.reversed()

    // رشته معکوس‌شده رو چاپ می‌کنیم
    println("رشته معکوس‌شده: $reversed")
}
