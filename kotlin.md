# Kotlin inAction

1. null空安全
只要变量可能为空都要必须进行下面的一种判断操作
````
var b: String? = "abc"
//在条件中检查 null
var l:int =if(b!=null) b.length else -1
//安全的调用
var l= b?.length
//Elvis 操作符 ?: 左侧不为空则返回会左侧值否则返回右侧
var l=b?.length?:-1
````
声明ｂ可能为空,那么操作时必须检查他是否为空
2. Java-to-Kotlin converter
3. >most controlstructures, except for the loops ( for , do , and do / while ) are expressions
   (带有返回值)
4. expression body
>If a function is written with its body in curly braces, we say that this function has a
block body. If it returns an expression directly, it has an expression body.
缺少return只能在expression body的函数中


````
fun max (a:int,b: int):int =if(a>b) a else b;
````
５.
- val  value   (final in java)不可变，但他引用的可变
- var  variable　　变量可变

6."Hello, ${if (args.size > 0) args[0] else "someone"}!"
  ---------------- ${}

7.声明一个类的属性,自定义的访问器
````
var <propertyName>[: <PropertyType>] [= <property_initializer>]
    [<getter>]
    [<setter>]
//例子
    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            setDataFromString(value) // 解析字符串并赋值给其他属性
        }
    ````




８．语句
````
    for (i in 1..100) { …… }  // 闭区间：包含 100
    for (i in 1 until 100) { …… } // 半开区间：不包含 100
    for (x in 2..10 step 2) { …… }
    for (x in 10 downTo 1) { …… }
    if (x in 1..10) { …… }
    ````

    when---switch
      () ->()

      分之条件可以是任何表达式


9. 数组
Kotlin 中Array代表数组
｀｀｀｀
class Array<T> private constructor() {
    val size: Int
    operator fun get(index: Int): T
    operator fun set(index: Int, value: T): Unit

    operator fun iterator(): Iterator<T>
    // ……
}

或者是无装箱的原生数组ByteArray、 ShortArray、IntArray 等等
｀｀｀｀
### 函数
一级公民
````
fun example (a:Int,b:Arry<>)Int()

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun multi(a: Int, b: Int): Int = a * b

fun maxOf(a: Int, b: Int): Int = if (a > b) a else b
````
- field 标识符只允许在属性的访问器函数内使用.
- 扩展函数
声明拓展函数要加接受的对象;
在扩展函数内, this 关键字指代接收者对象;
###### 实例方法：
- 匿名函数
就是不带名字的函数　　fun (x:Int):Int=if(x>0) 1 else 0
- lambda
用 () 的形式调用这个 Lambda 表达式，其实这个 () 对应的是 invoke 方法
Lambda 只有一个参数可默认为 it
lambda 表达式中的最后一个表达式是返回值
- 函数变量
val a:(index:int)->Boolean
还可以用::引用一般的函数　a=::example（函数指针）
````
fun<T>  doMap(list: List, function: (it: T) -> Any) {
    for (item in list) {
        function(item)
    }
}
````
[函数１](https://juejin.im/entry/58a382da61ff4b0058ab4542)
[函数２](https://pqpo.me/2017/05/25/kotlin-function/)
- 所有类的超类　any


-　语法糖
1. 区间　i in 1..10 (1<=i&&i<=10)
2.is 检查类型（并转换）
