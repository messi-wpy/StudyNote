**observer观察者**  
创建observer接口或subscriber实例，实现各个方法
他决定onNext,OnError(Thrower),onCompleted()方法具体执行的内容


**observable被观察者**  
他决定什么时候发送next,error,completed，如何发送，发送什么  
new Observable.OnSubscribe<T>的唯一call()方法传入Subscriber<? super T> subscriber,这是一个抽象类实现了observer观察者接口，二者通过此调用。


- 创建
unsafecreate(OnSubscribe<T> )或(create(OnSubscribe<T>)被废弃，这两个只是名字不同)　为什么unsafe？

  [why unsafe?](https://stackoverflow.com/questions/47759508/rxjava-create-consumer-unsafe)  
    * 文档也中写到 unsubscription and backpressure handlingis the responsibility of the OnSubscribe implementation.
所以不推荐这两种创建方法
    *  应该是使用
    ```
        public static <T> Observable<T> create(Action1<Emitter<T>> emitter, Emitter.BackpressureMode backpressure)
```
   **用emitter代替**
- 背压，emitter  
  - [什么是背压](https://zhuanlan.zhihu.com/p/24473022)   
  背压是一种策略，具体措施是下游观察者通知上游的被观察者发送事件,主要是观察者的反应处理速度慢于被观察者导致时间积压

- 异常处理  
    [checked与unchecked](https://blog.csdn.net/mouzu/article/details/78027434)
  - checked: 代表编译时检测，如果不处理编译时通不过的
  - unchecked: unchecked异常在编译时不会检查，这意味着即使你没有声明或者处理异常你的程序也会抛出一个unchecked异常


  rxjava中的异常处理很方便，都在onError()这个方法里，任何一个observable出现异常，都会在onError中消费，也就像一个try-catch块
  所以check异常要在里面调用try catch块显示处理，unchecked则会直接进入onError中处理，如果想拦截，有
  - onErrorReturn
  - onErrorResumeNext()



- 包装体
对于网络异常，只要非２００直接进入onError中处理，并且可以转换成httpException等其他异常，也可以用response包装（则httpException在onNext里），用result包装（所有都会进入onNext中，可以向下转换成个个具体异常处理）
  - [网络错误处理](https://juejin.im/entry/572fec5471cfe4006cac80e7)
