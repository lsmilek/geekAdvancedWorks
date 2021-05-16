#第4题作业
题目：4.（必做）根据上述自己对于 1 和 2 的演示，写一段对于不同 GC 和堆内存的总结，提交到 GitHub

总结：
目前支持的GC算法：
1、串行GC（Serial GC）:单线程执行，应用需要暂停，配置参数为：
2、并行GC（ParNew、Parallel Scavenge、Parallel Old）：多线程并行的执行垃圾回收，关注高吞吐；
3、CMS（Concurrent Mark-Sweep）:多线程并发标记和清除，关注与降低延迟；
4、G1（G1 First）：通过划分多个内存区域做增量整理和回收，进一步降低延迟；
5、ZGC（Z Garbage Collector）：通过着色指针和读屏障，实现几乎全部的并发执行，几毫秒级别的延迟，线程可扩展；
6、Epsilion:实验性的GC，供性能分析使用；
7、Shenandoah：G1的改进版本，跟ZGC类似

