import org.w3c.dom.css.Counter

//Создание класса
fun main() {
    println("Введите длину звонка в минутах")
    val n = readLine()!!.toInt()
    println("Введите стоимость минуты")
    val m = readLine()!!.toInt()
    println("Введите кол-во звонков в день")
    val k = readLine()!!.toInt()
    val thisTalk = TimeTalk()
    thisTalk.Lenght = n
    thisTalk.Cost = m
    val emp = Employee(n, m, k)


    println("Стоимость звонка: " + thisTalk.Res(n, m) + " руб")
    println("Цена всех звонков за день " + emp.talkOnDay(k))

    println("Введите Фамилию солдата")
    val sure = readLine()!!.toString()
    println("Введите рост")
    val height = readLine()!!.toDouble()
    println("Введите вес")
    val weight = readLine()!!.toDouble()
    println("Введите 1 если начальное образование введите 2 если среднее введите 3 если высшее")
    val obr = readLine()!!.toInt()


    val soldat = Soldat()
    soldat.Surename = sure
    soldat.Height = height
    soldat.Weight = weight

    val ms = miniSoldat()
    ms.Height = height
    ms.Weight = weight
    ms.degree = obr
    println("Функция Q = " + ms.Qfun(height,weight))

}

open class TimeTalk {
    var Lenght: Int = 0
    var Cost: Int = 0

    fun Res(Lenght: Int, Cost: Int): Int {
        return Lenght * Cost
    }
}

//Наследование
class Employee : TimeTalk {
    var countTalk: Int = 0

    constructor(_Lenght: Int = 0, _Cost: Int = 0, _countTalk: Int = 0) {
        Lenght = _Lenght
        Cost = _Cost
        countTalk = _countTalk
    }

    fun talkOnDay(countTalk: Int): Int {
        var i = Res(Lenght, Cost) * countTalk
        return i
    }
}