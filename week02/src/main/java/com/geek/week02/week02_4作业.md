#第4题作业
题目：4.（必做）根据上述自己对于 1 和 2 的演示，写一段对于不同 GC 和堆内存的总结，提交到 GitHub

总结：<br/>
目前支持的GC算法：<br/>
1、串行GC（Serial GC）:单线程执行，应用需要暂停，配置参数为：-XX:+UseSerialGC ，年轻代：复制算法，老年代：标记-清除-整理算法<br/>
2、并行GC（ParNew、Parallel Scavenge、Parallel Old）：多线程并行的执行垃圾回收，关注高吞吐；配置参数为：-XX:+UseParallelGC，年轻代：复制算法，老年代：标记-清除-整理算法<br/>
并?垃圾收集?适用于多核服务?，其主要目标是增加系统吞吐?(也就是降低GC总体消耗的时间)。为?达成这个目标，会尽?使用尽可能多的CPU资源：在GC事件执?期间，所有 CPU 内核都在并?地清?垃圾，所以暂停时间相对来说?短
在两次GC事件中间的间隔期，?会启动GC线程，所以这段时间内?会消耗任何系统资源另一方面，因为并?GC的所有阶段都?能中断，所以并?GC很可能会出现长时间的卡顿。长时间卡顿的意
思，就是并?GC启动后，一次性完成所有的GC操作，所以单次暂停的时间较长。假如系统延迟是非常重要的性能指标，那么就应该选择其他垃圾收集?。
3、CMS（Concurrent Mark-Sweep）:多线程并发标记和清除，关注与降低延迟；配置参数：-XX:+UseConcMarkSweepGC，默认年轻代使用并?的标记-复制(mark-copy) 垃圾收集?ParNew，CMS只是老年代<br/>
4、G1（G1 First）：通过划分多个内存区域做增量整理和回收，进一步降低延迟；<br/>
5、ZGC（Z Garbage Collector）：通过着色指针和读屏障，实现几乎全部的并发执行，几毫秒级别的延迟，线程可扩展；<br/>
6、Epsilion:实验性的GC，供性能分析使用；<br/>
7、Shenandoah：G1的改进版本，跟ZGC类似<br/>

垃圾回收算法有：<br/>
1、标记-清除算法（Mark-Sweep）<br/>
 不足：（1）效率问题：标记和清除两个过程的效率都不高<br/>
       （2）空间问题：标记清除之后会产生大量不连续的内存碎片<br/>
2、复制算法（Sopying）：为了解决效率问题<br/>
HotSpot虚拟机默认Eden和Survivor0和Survivor1的比例为8:1:1（即每次新生代中可用内存看空间为整个新生代容量的90%）<br/>
不足：在对象存活较高时就要进行较多的复制操作，效率将会变低<br/>
3、标记-整理算法（Mark-Compact）<br/>
一般用在老年代<br/>
4、分代收集算法，目前用的都是这个<br/>




