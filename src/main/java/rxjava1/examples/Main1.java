package rxjava1.examples;

import rx.Observable;
import rx.functions.Action1;

public class Main1 {
    public static void main(String[] args) {
        Observable<String> myObservable = Observable.just("hello you hello me ");

        Action1<String> onNextAction = new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        };

        myObservable.subscribe(onNextAction);
    }
}
