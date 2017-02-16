package rxjava1.examples;

import rx.Observable;

//相比于Main1.java文件中的写法,利用Lambda表达式来极大地减少了代码量
public class Main2 {
    public static void main(String[] args) {
        Observable.just("利用了lambda表达式来减少代码量").subscribe((s) -> System.out.println("我这边的捕获到的是->" + s));
    }
}
