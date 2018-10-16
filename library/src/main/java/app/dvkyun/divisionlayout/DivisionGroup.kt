package app.dvkyun.divisionlayout

data class DivisionGroup(val name : String) {
    val leftPosition = name.plus(".left")
    val topPosition = name.plus(".top")
    val rightPosition = name.plus(".right")
    val bottomPosition = name.plus(".bottom")

    var left : Any = 0F
    var top : Any = 0F
    var right : Any = 0F
    var bottom : Any = 0F
    var height : Any = 1F
    var width : Any = 1F
}