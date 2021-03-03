package chf.upf.myapp.ui

data class CalendarClass(
        val calendar: List<CalendarInfo>
)

data class CalendarInfo (
    val Date: String,
    val Title: String,
    val Descripcion: String,
    val HoraInicio: String,
    val HoraFinal: String,
    val Prioridad: Int,
    val Notificacion: List<String>
)