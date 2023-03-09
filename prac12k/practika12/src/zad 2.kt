class Repositori {
    var username:String=""
    var  token:String=""
    var countrepos:Int=0
    var block:Boolean=true

    fun Input(){
        println("Введите имя пользователя")
        username= readln().toString()
        println("Введите пароль")
        token= readln().toString()
        println("Введите кол-во репозиториев")
        countrepos= readln().toInt()
        println("Аккаунт приватный ? (да,нет)")
        val flag:String=readln().toString().lowercase()
        when{
            (flag=="да")->block=true
                (flag=="нет")->block=false
            else->throw Exception("Error")
        }
    }

}