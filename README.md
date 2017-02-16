## rxjava 1.x版本的demo  


***总结: Observable可以是一个数据库查询，Subscriber用来显示查询结果；  
Observable可以是屏幕上的点击事件，Subscriber用来响应点击事件；  
Observable可以是一个网络请求，Subscriber用来显示请求结果,  
值得一提的是前端开发angular2中使用http从restful服务器上拉取数据也是用的 
类似的方式,但是是用过rxjs实现的,而不是使用rxjava***


***Observable和Subscriber是独立于中间的变换过程的。
   在Observable和Subscriber中间可以增减任何数量的map。整个系统是高度可组合的，操作数据是一个很简单的过程。***
