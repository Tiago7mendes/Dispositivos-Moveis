package POO

class Forma(var comprimento: Double, var altura: Double) {
    var area: Double = 0.0
    init {
        if (comprimento < 0)
            comprimento = 0.0
        if (altura < 0){
            altura = 0.0
        }
        area = comprimento * altura
    }
}
fun main() {
    val forma = Forma(10.0, 5.0)
    println("Area: ${forma.area}")
}