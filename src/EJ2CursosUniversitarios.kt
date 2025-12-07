class Curso {
    var codigo: String
    var nombre: String
    var descripcion: String
    var creditosECTS: Int
    var nivel: String

    fun getNivel() {

    }

    fun contarEstudiantes() {

    }
}

class Profesor {
    var idEmpleado: String
    var nombreCompleto: String
    var email: String
    var departamento: String

    fun verCursosImpartidos() {

    }

    fun darClase() {

    }

    fun prepararExamen() {

    }

    fun evaluar() {

    }
}

class Estudiante {
    var numeroExpediente: String
    var nombreCompleto: String
    var email: String
    var fechaIngreso: Date

    fun asistirClase() {

    }

    fun estudiar() {

    }

    fun presentarseExamen() {

    }
}

class Matricula {
    var fechaMatricula: Date
    var nota: Float
}

