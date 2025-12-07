enum class Categoria {
    SUPERVISOR,
    JEFE_DEPARTAMENTO,
    GERENTE
}

class Persona {
    var nombreCompleto: String
    var fechaNacimiento: Date

    fun calcularEdad() {

    }
}

class Empleado : Persona() {
    var sueldoBruto: Float

    fun calcularSueldoNeto() {

    }
}

class EmpleadoResponsable : Empleado() {
    var categoria: Categoria
}

class Cliente : Persona() {
    var telefono: Int
}

class Empresa {
    var nombreCorporativo: String
    var cif: String
    var direccionFiscal: String
}
