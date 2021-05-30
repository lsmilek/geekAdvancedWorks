2.（必做）思考有多少种方式，在 main 函数启动一个新线程，运行一个方法，拿到这
个方法的返回值后，退出主线程? 写出你的方法，越多越好，提交到 GitHub。<br>

方法一：直接用Thread，因为没有Thread没有返回值，可以用join或者sleep来等待子线程执行完（Homework03_1.java）<br>
方法二：可以实现Callable接口，用get()方法取得返回值（Homework03_2.java）<br>
方法三：使用CompletableFuture（Homework03_3.java）<br>
方法四：使用CountDownLatch（Homework03_4.java）<br>
