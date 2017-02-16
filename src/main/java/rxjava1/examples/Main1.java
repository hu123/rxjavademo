package rxjava1.examples;

import rx.Observable;
import rx.functions.Action1;

public class Main1 {
    public static void main(String[] args) {
//        Observable.just就是用来创建只发出一个事件就结束的Observable对象
        Observable<String> myObservable = Observable.just("hello you hello me ");

        //subscribe方法有一个重载版本，接受三个Action1类型的参数，分别对应OnNext，OnComplete， OnError函数
        //这里我们并不关心onError和onComplete，所以只需要第一个参数就可以
        Action1<String> onNextAction = new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        };

        myObservable.subscribe(onNextAction);
    }
}
