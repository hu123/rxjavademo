package rxjava1.examples;

import rx.Observable;
import rx.functions.Func1;

//操作符就是为了解决对Observable对象的变换的问题，操作符用于在Observable和最终的Subscriber之间修改Observable发出的事件。RxJava提供了很多很有用的操作符。
//比如map操作符，就是用来把把一个事件转换为另一个事件的。
public class Main3 {
    public static void main(String[] args) {
        Observable.just("hello").map(new Func1<String, String>() {
            @Override
            public String call(String s) {
                return s + "world";
            }
        }).subscribe(s -> System.out.println("我这边拿到的最终结果是:" + s));

    }
}
