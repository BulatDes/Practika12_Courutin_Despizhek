import kotlinx.coroutines.*
class Student{
    var name:String=""
    var fam:String=""
    var group:String="ПР-21"

    fun Input(){
        println("Введите имя")
        name= readln().toString()
        println("Введите фамилию")
        fam= readln().toString()
        println("Привет $fam $name")
    }

    fun Vyvod(){
        println("Студент группы: $group")
    }



}