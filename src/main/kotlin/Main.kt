import kotlin.math.pow

fun main(args: Array<String>) {
    println("Введите целое число")
    var n = readln().toDoubleOrNull()

    println("Введите основание степени")
    var x = readln().toDoubleOrNull()

    for (i in 0 .. 100)
    {
        if (x?.pow(i) == n)
        {
            println("" + x + "^" + i + " = " + n)
            break
        }
        else if (i == 100)
        {
            println("Целочисленный показатель не существует")
        }
    }
}