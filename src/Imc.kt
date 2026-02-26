//Buena practica
fun calcularIMC(peso: Double, altura: Double): Double{
    val imc = peso/(altura*altura)
    return imc
}

/*Mala practica*/
fun calcularIMC(){
    println("Ingrese el peso")
    val peso = readln().toDouble();
    println("Ingrese la altura")
    val altura = readln().toDouble();
    val imc = peso/(altura*altura)

    println("El imc es $imc")

}

