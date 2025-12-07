enum class TipoLibro {
    NOVELA,
    POESIA,
    CUENTOS
}

enum class EstadoLibro {
    DISPONIBLE,
    PRESTADO,
    RETRASADO
}

class Autor {
    var nombreCompleto: String
    var fechaNacimiento: Date

    fun calcularEdad() {

    }
}

class Libro {
    var titulo: String
    var tipo: TipoLibro
    var estado: EstadoLibro
}

class Socio {
    var nombre: String
    var dni: String
    var fechaInscripcion: Date

    fun puedePedirPrestamo() {

    }

    fun pedirLibroPrestado(libro: Libro) {

    }

    fun devolverLibro(libro: Libro) {

    }
}

class Prestamo {
    var fechaPrestamo: Date
    var fechaLimite: Date

    fun calcularFechaLimite() {

    }
}

class Multa {
    var fechaInicio: Date
    var diasMulta: Int

    fun estaActiva() {

    }
}
