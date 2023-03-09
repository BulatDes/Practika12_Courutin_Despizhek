import kotlinx.coroutines.*
suspend fun main()= coroutineScope {
   /* val student=Student()
    println("Введите количество повторений")
    val num:Int= readln().toInt()
    if(num>0){
        for(i in 0..num){
    launch {
        student.Input()
        delay(3000L)
    }
            student.Vyvod()
          runBlocking {delay(10000L)}
    }
    }*/
    try{
    val rep=Repositori()
        println("Введите кол-во пользователей")
        var n:Int= readln().toInt()
        val LRep:ArrayList<Int> = arrayListOf()
        var LUsername:ArrayList<String> = arrayListOf()
        var i:Int=1
    if (n>0){
        while(i<=n) {
            i++
            launch {
                rep.Input()
            }
            runBlocking { delay(15000L) }
            if(rep.block==false) {
                LRep.add(rep.countrepos)
                LUsername.add(rep.username)
            }
            else{
                i--
                println("Блокировка")
            }
        }
        for(i in 0..n-1){
            println("${LUsername[i]} ${LRep[i]}")
        }
        LRep.sort()
        LRep.forEach{ println(it) }
    }


    }catch (ex:Exception){
        println(ex.message)
    }



}

