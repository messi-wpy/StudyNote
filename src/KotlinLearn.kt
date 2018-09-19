fun main (args:Array<String>){
    println("hello world")
    print(out(10))
}

fun out (a:Int) :Int=if (a>0) a else -1
val test=60
val t:Int=50


class wpy(var name:String,var age:Int){
    init {
        println("hello kotlin")
    }
    val a= arrayListOf(2,2,2,2);
    var n:String="as"
    get() = n.toString()
    set(value) = field=value.filter { str }
    val str={ p:Char->true }

    val index=n.filter(this.str)

    var size: Int = 2
        get() = if (field > 10) 15 else 0
        set(value) {
            field = if (value > 10) 15 else 0
        }


    fun  <T>doMap(list: List, function: (it: T) -> Any) {
        for (item in list) {
            function(item)
        }
    }
}