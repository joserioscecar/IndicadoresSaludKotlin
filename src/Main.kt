//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var opc = 0;

    do {
        println("===Menu principal===")
        println("1. Calcular IMC")
        println("2. Calcular Clasificación IMC")
        println("3. Calcular FCM")
        println("4. Calcular TMB")
        println("5. Calcular Porcentaje de Grasa Corporal")
        println("6. Calcular Consumo Diario de Agua")
        println("0. Salir")

        println("Selecione una opcion:")
        opc = readln().toInt()
        when (opc) {

            1 -> opcionIMC()
            2 -> println("Has seleccionado la opcion 2")
            3 -> println("Has seleccionado la opcion 3")
            4 -> println("Has seleccionado la opcion 4")
            5 -> println("Has seleccionado la opcion 5")
            6 -> println("Has seleccionado la opcion 6")
            7 -> println("Has seleccionado la opcion 7")
            else -> println("Has ingresado una opcion invalida")


        }

    } while (opc != 0)


}

fun opcionIMC(){
    println("Ingrese el peso")
    val peso = readln().toDouble();
    println("Ingrese la altura")
    val altura = readln().toDouble();
    println(calcularIMC(peso,altura))
}