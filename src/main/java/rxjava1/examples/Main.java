package rxjava1.examples;


import rx.Observable;
import rx.Subscriber;

public class Main {
    public static void main(String[] args) {
        Observable<String> myObservable = Observable.create(
                new Observable.OnSubscribe<String>() {
                    @Override
                    public void call(Subscriber<? super String> sub) {
                        System.out.println("我这边的Observable得到了调用了哦");
                        sub.onNext("如果我这边的参数是这样的呢????");
                        System.out.println("辣么帅");
                        sub.onError(new RuntimeException("我这边故意的....."));
                        sub.onCompleted();
                    }
                }
        );

        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) {
                System.out.println(s);
            }

            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("这边捕获到的是->" + e.getMessage());

            }
        };

        myObservable.subscribe(mySubscriber);

        System.out.println("得到调用哦");

    }
}
