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
                        System.out.println("测试一下onNext()方法调用后是否马上进入subscribe的方法,而不是在往下执行...");
                        sub.onError(new RuntimeException("我这边故意的....."));
                        sub.onCompleted();
                    }
                }
        );

        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) {
                System.out.println("onNext方法里面捕获到的是->"+ s);
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
