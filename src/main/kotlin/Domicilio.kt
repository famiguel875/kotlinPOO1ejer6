class Domicilio(val calle: String, val numero: Int) {
    fun dirCompleta(): String {
        return "$calle $numero"
    }
}