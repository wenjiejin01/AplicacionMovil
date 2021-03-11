package chf.upf.myapp.ui

data class CalendarClass(
        val calendar: ArrayList<CalendarInfo>
)

data class CalendarInfo (
    val Date: String,
    val Title: String,
    val Descripcion: String,
    val HoraInicio: String,
    val HoraFinal: String,
    val Prioridad: String,
    val Notificacion: String,
    val done: Boolean
)