fun main() {
    val repoCompras = RepositorioCompras()

    val compra1 = Compra(Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355)), 5, 12780.78)
    val compra2 = Compra(Cliente("Jorge Russo", Domicilio("Mirasol", 218)), 7, 699.0)
    val compra3 = Compra(Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355)), 7, 532.90)
    val compra4 = Compra(Cliente("Julián Rodriguez", Domicilio("La Mancha", 761)), 12, 5715.99)
    val compra5 = Compra(Cliente("Jorge Russo", Domicilio("Mirasol", 218)), 15, 958.0)

    repoCompras.agregarCompra(compra1)
    repoCompras.agregarCompra(compra2)
    repoCompras.agregarCompra(compra3)
    repoCompras.agregarCompra(compra4)
    repoCompras.agregarCompra(compra5)

    val domiciliosPorCliente = repoCompras.domiciliosParaFacturas()

    println("Domicilios para enviar facturas por cliente:")
    domiciliosPorCliente.forEach { (cliente, domicilios) ->
        println("$cliente: ${domicilios.joinToString(", ")}")
    }
}

