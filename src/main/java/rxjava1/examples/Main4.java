package rxjava1.examples;

import rx.Observable;

//基于Main3.java我们将map操作转换成了用lambda表达式的写法,用以简化代码
public class Main4 {
    public static void main(String[] args) {
        Observable.just("hello").map(s -> s + "world").subscribe(s -> System.out.println("我这边拿到的是" + s));

    }
}
