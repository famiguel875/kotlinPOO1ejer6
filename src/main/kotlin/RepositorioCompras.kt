class RepositorioCompras {
    private val compras: MutableList<Compra> = mutableListOf()

    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    fun domiciliosParaFacturas(): Map<String, List<String>> {
        val domiciliosPorCliente = mutableMapOf<String, MutableList<String>>()

        for (compra in compras) {
            val cliente = compra.cliente.nombre
            val domicilio = compra.cliente.domicilio.dirCompleta()

            val listaDomicilios = domiciliosPorCliente.getOrPut(cliente) { mutableListOf() }

            if (!listaDomicilios.contains(domicilio)) {
                listaDomicilios.add(domicilio)
            }
        }

        return domiciliosPorCliente
    }
}