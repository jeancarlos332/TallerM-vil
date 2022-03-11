@file:Suppress("DEPRECATED_IDENTITY_EQUALS")

fun main(args: Array<String>) {
        menu()
    }

    fun menu() {
        var option: Int
        option = 1
        while (option != 0) {
            println("Menú principal")
            println("Seleccione una opción: ")

            println("Opt. 1 - Generar los N primeros  números de la serie Fibonacci")
            println("Opt. 2 - Calcular la sumatoria de un número N")
            println("Opt. 3 - Generar los 10 primeros números primos")
            println("Opt. 4 - Calcular el área de un círculo")
            println("Opt. 5 - Convertir centígrados a Fahrenheit y Kelvin")
            println("Opt. 0 - Salir")

            option = readLine()?.toInt() as Int


            when (option) {
                1 -> calcFibonacci()
                2 -> getSum()
                3 -> getPrimeNumbers()
                4 -> calcCircleArea()
                5 -> convertCentrigades()
                0 -> break

                else -> {
                    println("Opción inválida")
                }
            }

            }

        }

    fun calcFibonacci() {
            var n: Int
            var t1 = 0
            var t2 = 1
            println("Digite un número para calcular serie Fibonacci: ")
            n = readLine()?.toInt() as Int
            print("Primeros $n números: ")

            for (i in 1..n) {
                if(i < n){
                    print("$t1 + ")
                } else {
                    print("$t1  \n")
                }

                val sum = t1 + t2
                t1 = t2
                t2 = sum
            }

    }

    fun getSum() {
        var suma: Int = 0
        var n: Int
        println("Digite un número para calcular la sumatoria: ")
        n = readLine()?.toInt() as Int

        for (i in 1..n) {
            suma += i
        }
        println("La sumatoria del número $n : $suma \n")
    }

    fun calcCircleArea() {
        var n: Double
        var area: Double
        var PI = 3.1416
        println("Ingrese el radio del círculo: ")
        n = readLine()?.toDouble() as Double
        area = (n * n) * PI
        println("El área del círculo es $area \n")
    }

fun convertCentrigades(){
    var kelvin: Double = 0.0
    var Fahrenheit: Double = 0.0
    var n: Double
    println("Digite grados centígrados: ")
    n = readLine()?.toDouble() as Double

    kelvin = n + 273
    Fahrenheit = (1.8 * n) + 32

    println("Los grados $n convertidos en kelvin son $kelvin")
    println("Los grados $n convertidos en Fahrenheit son $Fahrenheit")
}



fun getPrimeNumbers() {

    var contador: Int = 0
    var resultado: String = ""

    for (i in 2..100) {

        var p = 1
        var k = 2
        while (k < i) {
            if (i % k == 0) {
                p = 0
                break
            }
            k++
        }
        if (p == 1) {
           contador = contador + 1

            if (contador<10) {
                resultado = resultado + i + ","
            }else{
                resultado = resultado + i
            }


        }

        if (contador == 10){
            break
        }
    }
    println("Los primeros 10 primos son: $resultado")
    }

