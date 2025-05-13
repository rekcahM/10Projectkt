
fun main() {
    // از کاربر می‌خوایم یک عدد وارد کنه
    println("یک عدد وارد کن:")
    val number = readLine()?.toIntOrNull()

    // اگه عدد وارد شده قابل تبدیل به عدد صحیح نبود، پیام خطا میدیم
    if (number == null) {
        println("عدد وارد نشده یا اشتباهه!")
        return
    }

    // اگه عدد کوچکتر از ۲ باشه، قطعاً عدد اول نیست
    if (number < 2) {
        println("$number عدد اول نیست.")
        return
    }

    // فرض می‌کنیم عدد اول هست، مگر اینکه خلافش ثابت شه
    var isPrime = true

    // از ۲ تا رادیکال عدد (یا نصفش) چک می‌کنیم
    for (i in 2 until number) {
        if (number % i == 0) {
            // اگه عدد بر یکی از اینا بخش‌پذیر باشه، عدد اول نیست
            isPrime = false
            break
        }
    }

    // در نهایت نتیجه رو چاپ می‌کنیم
    if (isPrime) {
        println("$number یک عدد اول است.")
    } else {
        println("$number عدد اول نیست.")
    }
}
