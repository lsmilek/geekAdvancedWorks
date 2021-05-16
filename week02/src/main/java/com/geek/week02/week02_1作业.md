#第1题作业
题目：（选做）使用 GCLogAnalysis.java 自己演练一遍串行 / 并行 /CMS/G1 的案例。

作业：

1、默认执行
```
D:\>java -Xloggc:ftp.log -XX:+PrintGCDetails GCLogAnalysis
正在执行...
执行结束!共生成对象次数:17302
```
生成GC日志部分如下：
```
Java HotSpot(TM) 64-Bit Server VM (25.171-b11) for windows-amd64 JRE (1.8.0_171-b11), built on Mar 28 2018 16:06:12 by "java_re" with MS VC++ 10.0 (VS2010)
Memory: 4k page, physical 8230708k(3266980k free), swap 15570740k(6830808k free)
CommandLine flags: -XX:InitialHeapSize=131691328 -XX:MaxHeapSize=2107061248 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC 
0.086: [GC (Allocation Failure) [PSYoungGen: 32704K->5117K(37888K)] 32704K->10508K(123904K), 0.0027394 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
0.097: [GC (Allocation Failure) [PSYoungGen: 37844K->5112K(70656K)] 43235K->20733K(156672K), 0.0027975 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
0.117: [GC (Allocation Failure) [PSYoungGen: 70320K->5112K(70656K)] 85941K->43697K(156672K), 0.0049736 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
0.130: [GC (Allocation Failure) [PSYoungGen: 70648K->5107K(136192K)] 109233K->63931K(222208K), 0.0042862 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
0.134: [Full GC (Ergonomics) [PSYoungGen: 5107K->0K(136192K)] [ParOldGen: 58823K->59507K(129024K)] 63931K->59507K(265216K), [Metaspace: 2597K->2597K(1056768K)], 0.0093753 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
0.176: [GC (Allocation Failure) [PSYoungGen: 130813K->5107K(136192K)] 190321K->106698K(265216K), 0.0070015 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
0.183: [Full GC (Ergonomics) [PSYoungGen: 5107K->0K(136192K)] [ParOldGen: 101591K->97533K(201216K)] 106698K->97533K(337408K), [Metaspace: 2597K->2597K(1056768K)], 0.0123084 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
0.210: [GC (Allocation Failure) [PSYoungGen: 130982K->42790K(247296K)] 228515K->140324K(448512K), 0.0062687 secs] [Times: user=0.08 sys=0.05, real=0.02 secs] 
0.260: [GC (Allocation Failure) [PSYoungGen: 247078K->55292K(265216K)] 344612K->199811K(466432K), 0.0139370 secs] [Times: user=0.03 sys=0.09, real=0.02 secs] 
0.299: [GC (Allocation Failure) [PSYoungGen: 265212K->89085K(385024K)] 409731K->254381K(586240K), 0.0145293 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
0.313: [Full GC (Ergonomics) [PSYoungGen: 89085K->0K(385024K)] [ParOldGen: 165295K->199814K(322560K)] 254381K->199814K(707584K), [Metaspace: 2597K->2597K(1056768K)], 0.0246964 secs] [Times: user=0.24 sys=0.01, real=0.03 secs] 
0.377: [GC (Allocation Failure) [PSYoungGen: 295812K->93418K(410112K)] 495626K->293232K(732672K), 0.0121124 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
0.418: [GC (Allocation Failure) [PSYoungGen: 389354K->125431K(491520K)] 589168K->362538K(814080K), 0.0210109 secs] [Times: user=0.14 sys=0.09, real=0.03 secs] 
0.475: [GC (Allocation Failure) [PSYoungGen: 491511K->116805K(483328K)] 728618K->445839K(813056K), 0.0219158 secs] [Times: user=0.05 sys=0.08, real=0.02 secs] 
0.497: [Full GC (Ergonomics) [PSYoungGen: 116805K->0K(483328K)] [ParOldGen: 329033K->308578K(473088K)] 445839K->308578K(956416K), [Metaspace: 2597K->2597K(1056768K)], 0.0372752 secs] [Times: user=0.22 sys=0.05, real=0.05 secs] 
0.582: [GC (Allocation Failure) [PSYoungGen: 366076K->110774K(505344K)] 674654K->419353K(978432K), 0.0115750 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
0.630: [GC (Allocation Failure) [PSYoungGen: 446369K->106367K(442368K)] 754947K->493337K(915456K), 0.0193010 secs] [Times: user=0.09 sys=0.03, real=0.02 secs] 
0.649: [Full GC (Ergonomics) [PSYoungGen: 106367K->0K(442368K)] [ParOldGen: 386969K->338027K(529408K)] 493337K->338027K(971776K), [Metaspace: 2597K->2597K(1056768K)], 0.0389812 secs] [Times: user=0.23 sys=0.02, real=0.03 secs] 
0.736: [GC (Allocation Failure) [PSYoungGen: 335872K->98147K(510976K)] 673899K->436175K(1040384K), 0.0109646 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
0.784: [GC (Allocation Failure) [PSYoungGen: 431971K->102059K(436224K)] 769999K->507076K(965632K), 0.0179324 secs] [Times: user=0.09 sys=0.03, real=0.02 secs] 
0.839: [GC (Allocation Failure) [PSYoungGen: 435883K->94137K(513024K)] 840900K->575105K(1042432K), 0.0189915 secs] [Times: user=0.08 sys=0.05, real=0.02 secs] 
0.858: [Full GC (Ergonomics) [PSYoungGen: 94137K->0K(513024K)] [ParOldGen: 480967K->361352K(586752K)] 575105K->361352K(1099776K), [Metaspace: 2597K->2597K(1056768K)], 0.0438968 secs] [Times: user=0.27 sys=0.00, real=0.05 secs] 
0.950: [GC (Allocation Failure) [PSYoungGen: 338432K->100054K(508416K)] 699784K->461407K(1095168K), 0.0107290 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
0.999: [GC (Allocation Failure) [PSYoungGen: 438486K->96799K(512512K)] 799839K->531569K(1099264K), 0.0174097 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
1.055: [GC (Allocation Failure) [PSYoungGen: 441785K->100106K(509440K)] 876554K->603979K(1096192K), 0.0199724 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
1.075: [Full GC (Ergonomics) [PSYoungGen: 100106K->0K(509440K)] [ParOldGen: 503873K->362726K(613376K)] 603979K->362726K(1122816K), [Metaspace: 2597K->2597K(1056768K)], 0.0427813 secs] [Times: user=0.38 sys=0.00, real=0.05 secs] 
Heap
 PSYoungGen      total 509440K, used 13903K [0x00000000d6200000, 0x00000000ff800000, 0x0000000100000000)
  eden space 345088K, 4% used [0x00000000d6200000,0x00000000d6f93f38,0x00000000eb300000)
  from space 164352K, 0% used [0x00000000eb300000,0x00000000eb300000,0x00000000f5380000)
  to   space 161792K, 0% used [0x00000000f5a00000,0x00000000f5a00000,0x00000000ff800000)
 ParOldGen       total 613376K, used 362726K [0x0000000082600000, 0x00000000a7d00000, 0x00000000d6200000)
  object space 613376K, 59% used [0x0000000082600000,0x0000000098839b68,0x00000000a7d00000)
 Metaspace       used 2603K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 287K, capacity 386K, committed 512K, reserved 1048576K

```
分析如下：
（1）从GC日志中可以看出，默认-Xms为131691328/1024/1024约等于125M，-Xmx为2107061248/1024/1024/1024约等于1.96G，
我的笔记本物理内存为8G，JDK8默认初始堆大小为物理内存的1/64，默认最大堆内存为物理内存的1/4（官方文档参见：https://docs.oracle.com/javase/8/docs/technotes/guides/vm/gc-ergonomics.html），
和GC日志里是相符的，默认使用ParallelGC，1秒的时间总共进行了7次Full GC，
（2）第一次Young GC  [PSYoungGen: 32704K->5117K(37888K)] 32704K->10508K(123904K), 0.0027394 secs]，
年轻代减少了32704-5117=27587k，GC之后年轻代使用率为13%，堆内存从32704K到10508K，减少了22200K，GC之后堆内存使用量为8%，
从中可看出5387K（22200K-27587K）数据转移到老年代，老年代内存容量为123904K-37888K=86016K

2、限定堆初始大小
```
D:\>java -Xms512m -Xmx512m -Xloggc:ftp.log512 -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
执行结束!共生成对象次数:9436
```
GC日志如下：
```
Java HotSpot(TM) 64-Bit Server VM (25.171-b11) for windows-amd64 JRE (1.8.0_171-b11), built on Mar 28 2018 16:06:12 by "java_re" with MS VC++ 10.0 (VS2010)
Memory: 4k page, physical 8230708k(3205424k free), swap 15570740k(6518948k free)
CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC 
2021-05-15T22:06:54.335+0800: 0.187: [GC (Allocation Failure) [PSYoungGen: 131584K->21491K(153088K)] 131584K->40299K(502784K), 0.0060215 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.351+0800: 0.209: [GC (Allocation Failure) [PSYoungGen: 153075K->21494K(153088K)] 171883K->83570K(502784K), 0.0093521 secs] [Times: user=0.02 sys=0.11, real=0.01 secs] 
2021-05-15T22:06:54.382+0800: 0.234: [GC (Allocation Failure) [PSYoungGen: 153078K->21498K(153088K)] 215154K->120208K(502784K), 0.0079169 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.398+0800: 0.257: [GC (Allocation Failure) [PSYoungGen: 152894K->21502K(153088K)] 251604K->166642K(502784K), 0.0089389 secs] [Times: user=0.03 sys=0.09, real=0.02 secs] 
2021-05-15T22:06:54.429+0800: 0.281: [GC (Allocation Failure) [PSYoungGen: 153077K->21484K(153088K)] 298217K->202371K(502784K), 0.0076977 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.445+0800: 0.304: [GC (Allocation Failure) [PSYoungGen: 153068K->21498K(80384K)] 333955K->234831K(430080K), 0.0076422 secs] [Times: user=0.00 sys=0.13, real=0.02 secs] 
2021-05-15T22:06:54.460+0800: 0.318: [GC (Allocation Failure) [PSYoungGen: 80378K->38336K(116736K)] 293711K->254680K(466432K), 0.0048513 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.476+0800: 0.329: [GC (Allocation Failure) [PSYoungGen: 97216K->54341K(116736K)] 313560K->277270K(466432K), 0.0068974 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.491+0800: 0.344: [GC (Allocation Failure) [PSYoungGen: 113147K->57819K(116736K)] 336075K->292345K(466432K), 0.0080779 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.507+0800: 0.360: [GC (Allocation Failure) [PSYoungGen: 116624K->34547K(116736K)] 351150K->305881K(466432K), 0.0085283 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.523+0800: 0.376: [GC (Allocation Failure) [PSYoungGen: 93380K->20107K(116736K)] 364715K->323371K(466432K), 0.0067202 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.523+0800: 0.383: [Full GC (Ergonomics) [PSYoungGen: 20107K->0K(116736K)] [ParOldGen: 303264K->233530K(349696K)] 323371K->233530K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0303768 secs] [Times: user=0.11 sys=0.02, real=0.04 secs] 
2021-05-15T22:06:54.574+0800: 0.425: [GC (Allocation Failure) [PSYoungGen: 58757K->22097K(116736K)] 292287K->255627K(466432K), 0.0030961 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.589+0800: 0.437: [GC (Allocation Failure) [PSYoungGen: 80977K->23515K(116736K)] 314507K->278153K(466432K), 0.0051273 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.589+0800: 0.450: [GC (Allocation Failure) [PSYoungGen: 82395K->21882K(116736K)] 337033K->299093K(466432K), 0.0051457 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
2021-05-15T22:06:54.605+0800: 0.463: [GC (Allocation Failure) [PSYoungGen: 80762K->23723K(116736K)] 357973K->319074K(466432K), 0.0049960 secs] [Times: user=0.01 sys=0.00, real=0.02 secs] 
2021-05-15T22:06:54.621+0800: 0.475: [GC (Allocation Failure) [PSYoungGen: 82603K->22189K(116736K)] 377954K->339733K(466432K), 0.0057577 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.621+0800: 0.481: [Full GC (Ergonomics) [PSYoungGen: 22189K->0K(116736K)] [ParOldGen: 317543K->265577K(349696K)] 339733K->265577K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0311755 secs] [Times: user=0.14 sys=0.00, real=0.03 secs] 
2021-05-15T22:06:54.667+0800: 0.524: [GC (Allocation Failure) [PSYoungGen: 58797K->17439K(116736K)] 324375K->283016K(466432K), 0.0027135 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.683+0800: 0.537: [GC (Allocation Failure) [PSYoungGen: 76173K->23164K(116736K)] 341750K->304631K(466432K), 0.0046893 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.699+0800: 0.551: [GC (Allocation Failure) [PSYoungGen: 82044K->17217K(116736K)] 363511K->320061K(466432K), 0.0045634 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.714+0800: 0.565: [GC (Allocation Failure) [PSYoungGen: 76097K->21378K(116736K)] 378941K->340666K(466432K), 0.0048593 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.714+0800: 0.570: [Full GC (Ergonomics) [PSYoungGen: 21378K->0K(116736K)] [ParOldGen: 319287K->289204K(349696K)] 340666K->289204K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0325841 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
2021-05-15T22:06:54.761+0800: 0.615: [GC (Allocation Failure) [PSYoungGen: 58813K->19621K(116736K)] 348018K->308826K(466432K), 0.0029821 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.777+0800: 0.630: [GC (Allocation Failure) [PSYoungGen: 78414K->19838K(116736K)] 367619K->326810K(466432K), 0.0046402 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.792+0800: 0.644: [GC (Allocation Failure) [PSYoungGen: 78619K->21031K(116736K)] 385591K->347033K(466432K), 0.0049064 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.792+0800: 0.649: [Full GC (Ergonomics) [PSYoungGen: 21031K->0K(116736K)] [ParOldGen: 326001K->300809K(349696K)] 347033K->300809K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0333566 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
2021-05-15T22:06:54.839+0800: 0.695: [GC (Allocation Failure) [PSYoungGen: 58688K->19464K(116736K)] 359497K->320273K(466432K), 0.0027806 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.855+0800: 0.706: [GC (Allocation Failure) [PSYoungGen: 78133K->21559K(116736K)] 378942K->340891K(466432K), 0.0046993 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.855+0800: 0.711: [Full GC (Ergonomics) [PSYoungGen: 21559K->0K(116736K)] [ParOldGen: 319332K->305605K(349696K)] 340891K->305605K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0329451 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
2021-05-15T22:06:54.902+0800: 0.755: [GC (Allocation Failure) [PSYoungGen: 58880K->21456K(116736K)] 364485K->327061K(466432K), 0.0028910 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.917+0800: 0.766: [GC (Allocation Failure) [PSYoungGen: 80336K->20052K(116736K)] 385941K->346585K(466432K), 0.0046246 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.917+0800: 0.771: [Full GC (Ergonomics) [PSYoungGen: 20052K->0K(116736K)] [ParOldGen: 326532K->313956K(349696K)] 346585K->313956K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0345909 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
2021-05-15T22:06:54.964+0800: 0.816: [GC (Allocation Failure) [PSYoungGen: 58759K->21802K(119808K)] 372716K->335759K(469504K), 0.0028636 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.980+0800: 0.829: [GC (Allocation Failure) [PSYoungGen: 84137K->41356K(103936K)] 398094K->355313K(453632K), 0.0046236 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:06:54.980+0800: 0.842: [GC (Allocation Failure) [PSYoungGen: 103820K->57846K(116736K)] 417777K->375790K(466432K), 0.0067548 secs] [Times: user=0.11 sys=0.02, real=0.01 secs] 
2021-05-15T22:06:54.995+0800: 0.857: [GC (Allocation Failure) [PSYoungGen: 116653K->57731K(116736K)] 434597K->392855K(466432K), 0.0083201 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
2021-05-15T22:06:55.011+0800: 0.865: [Full GC (Ergonomics) [PSYoungGen: 57731K->0K(116736K)] [ParOldGen: 335123K->326056K(349696K)] 392855K->326056K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0367697 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
2021-05-15T22:06:55.058+0800: 0.914: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 326056K->330300K(349696K)] 384936K->330300K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0405603 secs] [Times: user=0.38 sys=0.00, real=0.04 secs] 
2021-05-15T22:06:55.111+0800: 0.966: [Full GC (Ergonomics) [PSYoungGen: 58685K->0K(116736K)] [ParOldGen: 330300K->327898K(349696K)] 388986K->327898K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0398820 secs] [Times: user=0.28 sys=0.00, real=0.05 secs] 
2021-05-15T22:06:55.161+0800: 1.018: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 327898K->327340K(349696K)] 386778K->327340K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0391153 secs] [Times: user=0.25 sys=0.00, real=0.04 secs] 
2021-05-15T22:06:55.218+0800: 1.068: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 327340K->326058K(349696K)] 386220K->326058K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0414931 secs] [Times: user=0.22 sys=0.00, real=0.03 secs] 
Heap
 PSYoungGen      total 116736K, used 12973K [0x00000000f5580000, 0x0000000100000000, 0x0000000100000000)
  eden space 58880K, 22% used [0x00000000f5580000,0x00000000f622b548,0x00000000f8f00000)
  from space 57856K, 0% used [0x00000000f8f00000,0x00000000f8f00000,0x00000000fc780000)
  to   space 57856K, 0% used [0x00000000fc780000,0x00000000fc780000,0x0000000100000000)
 ParOldGen       total 349696K, used 326058K [0x00000000e0000000, 0x00000000f5580000, 0x00000000f5580000)
  object space 349696K, 93% used [0x00000000e0000000,0x00000000f3e6abb8,0x00000000f5580000)
 Metaspace       used 2603K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 287K, capacity 386K, committed 512K, reserved 1048576K

```
分析如下：

3、串行GC
```
D:\>java -XX:+UseSerialGC -Xms512m -Xmx512m -Xloggc:ftp.logSerial -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
执行结束!共生成对象次数:12243
```
生成GC日志如下：
```
Java HotSpot(TM) 64-Bit Server VM (25.171-b11) for windows-amd64 JRE (1.8.0_171-b11), built on Mar 28 2018 16:06:12 by "java_re" with MS VC++ 10.0 (VS2010)
Memory: 4k page, physical 8230708k(3058060k free), swap 15570740k(6376012k free)
CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC 
2021-05-15T22:09:46.419+0800: 0.140: [GC (Allocation Failure) 2021-05-15T22:09:46.419+0800: 0.140: [DefNew: 139776K->17471K(157248K), 0.0218840 secs] 139776K->49205K(506816K), 0.0220217 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
2021-05-15T22:09:46.450+0800: 0.179: [GC (Allocation Failure) 2021-05-15T22:09:46.450+0800: 0.179: [DefNew: 156976K->17469K(157248K), 0.0285776 secs] 188709K->98104K(506816K), 0.0286332 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:09:46.497+0800: 0.223: [GC (Allocation Failure) 2021-05-15T22:09:46.497+0800: 0.223: [DefNew: 156697K->17471K(157248K), 0.0208548 secs] 237332K->141569K(506816K), 0.0209108 secs] [Times: user=0.01 sys=0.01, real=0.03 secs] 
2021-05-15T22:09:46.544+0800: 0.259: [GC (Allocation Failure) 2021-05-15T22:09:46.544+0800: 0.259: [DefNew: 156970K->17470K(157248K), 0.0200946 secs] 281068K->184004K(506816K), 0.0201507 secs] [Times: user=0.01 sys=0.00, real=0.02 secs] 
2021-05-15T22:09:46.575+0800: 0.296: [GC (Allocation Failure) 2021-05-15T22:09:46.575+0800: 0.296: [DefNew: 157246K->17469K(157248K), 0.0199980 secs] 323780K->225862K(506816K), 0.0200506 secs] [Times: user=0.00 sys=0.02, real=0.01 secs] 
2021-05-15T22:09:46.606+0800: 0.331: [GC (Allocation Failure) 2021-05-15T22:09:46.606+0800: 0.331: [DefNew: 157245K->17470K(157248K), 0.0212881 secs] 365638K->270226K(506816K), 0.0213434 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:09:46.642+0800: 0.366: [GC (Allocation Failure) 2021-05-15T22:09:46.642+0800: 0.366: [DefNew: 157246K->17471K(157248K), 0.0225043 secs] 410002K->317603K(506816K), 0.0225565 secs] [Times: user=0.00 sys=0.03, real=0.03 secs] 
2021-05-15T22:09:46.688+0800: 0.403: [GC (Allocation Failure) 2021-05-15T22:09:46.688+0800: 0.403: [DefNew: 157247K->157247K(157248K), 0.0000127 secs]2021-05-15T22:09:46.688+0800: 0.403: [Tenured: 300132K->275408K(349568K), 0.0286119 secs] 457379K->275408K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0286998 secs] [Times: user=0.01 sys=0.00, real=0.02 secs] 
2021-05-15T22:09:46.720+0800: 0.446: [GC (Allocation Failure) 2021-05-15T22:09:46.720+0800: 0.446: [DefNew: 139763K->17468K(157248K), 0.0066498 secs] 415172K->321037K(506816K), 0.0067028 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
2021-05-15T22:09:46.751+0800: 0.468: [GC (Allocation Failure) 2021-05-15T22:09:46.751+0800: 0.468: [DefNew: 157133K->157133K(157248K), 0.0000124 secs]2021-05-15T22:09:46.751+0800: 0.468: [Tenured: 303568K->295403K(349568K), 0.0312517 secs] 460702K->295403K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0313253 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:09:46.798+0800: 0.514: [GC (Allocation Failure) 2021-05-15T22:09:46.798+0800: 0.514: [DefNew: 139776K->17469K(157248K), 0.0124219 secs] 435179K->343057K(506816K), 0.0124712 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:09:46.813+0800: 0.541: [GC (Allocation Failure) 2021-05-15T22:09:46.813+0800: 0.541: [DefNew: 157245K->157245K(157248K), 0.0000126 secs]2021-05-15T22:09:46.813+0800: 0.541: [Tenured: 325587K->312116K(349568K), 0.0336269 secs] 482833K->312116K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0337058 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:09:46.860+0800: 0.590: [GC (Allocation Failure) 2021-05-15T22:09:46.860+0800: 0.590: [DefNew: 139444K->139444K(157248K), 0.0000131 secs]2021-05-15T22:09:46.860+0800: 0.590: [Tenured: 312116K->308502K(349568K), 0.0353010 secs] 451560K->308502K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0353777 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2021-05-15T22:09:46.923+0800: 0.639: [GC (Allocation Failure) 2021-05-15T22:09:46.923+0800: 0.639: [DefNew: 139626K->17470K(157248K), 0.0091088 secs] 448128K->354287K(506816K), 0.0091629 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:09:46.938+0800: 0.663: [GC (Allocation Failure) 2021-05-15T22:09:46.938+0800: 0.663: [DefNew: 157246K->157246K(157248K), 0.0000124 secs]2021-05-15T22:09:46.938+0800: 0.663: [Tenured: 336816K->342948K(349568K), 0.0333035 secs] 494063K->342948K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0333800 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:09:46.985+0800: 0.711: [GC (Allocation Failure) 2021-05-15T22:09:46.985+0800: 0.711: [DefNew: 139581K->139581K(157248K), 0.0000125 secs]2021-05-15T22:09:46.985+0800: 0.711: [Tenured: 342948K->345546K(349568K), 0.0344191 secs] 482530K->345546K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0345011 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:09:47.032+0800: 0.760: [GC (Allocation Failure) 2021-05-15T22:09:47.032+0800: 0.760: [DefNew: 139776K->139776K(157248K), 0.0000126 secs]2021-05-15T22:09:47.032+0800: 0.760: [Tenured: 345546K->345838K(349568K), 0.0350043 secs] 485322K->345838K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0350792 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2021-05-15T22:09:47.095+0800: 0.809: [GC (Allocation Failure) 2021-05-15T22:09:47.095+0800: 0.809: [DefNew: 139776K->139776K(157248K), 0.0000139 secs]2021-05-15T22:09:47.095+0800: 0.809: [Tenured: 345838K->335848K(349568K), 0.0386198 secs] 485614K->335848K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0387007 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:09:47.147+0800: 0.862: [GC (Allocation Failure) 2021-05-15T22:09:47.147+0800: 0.862: [DefNew: 139776K->139776K(157248K), 0.0000128 secs]2021-05-15T22:09:47.147+0800: 0.862: [Tenured: 335848K->349514K(349568K), 0.0275250 secs] 475624K->356173K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0276029 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2021-05-15T22:09:47.182+0800: 0.905: [Full GC (Allocation Failure) 2021-05-15T22:09:47.182+0800: 0.905: [Tenured: 349514K->349382K(349568K), 0.0328865 secs] 506750K->361881K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0329483 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:09:47.229+0800: 0.954: [Full GC (Allocation Failure) 2021-05-15T22:09:47.229+0800: 0.954: [Tenured: 349382K->349214K(349568K), 0.0365235 secs] 506262K->371903K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0365842 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2021-05-15T22:09:47.276+0800: 1.004: [Full GC (Allocation Failure) 2021-05-15T22:09:47.276+0800: 1.004: [Tenured: 349214K->349537K(349568K), 0.0418375 secs] 505836K->351327K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0419019 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2021-05-15T22:09:47.338+0800: 1.062: [Full GC (Allocation Failure) 2021-05-15T22:09:47.338+0800: 1.062: [Tenured: 349537K->349258K(349568K), 0.0277877 secs] 506718K->376511K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0278481 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
Heap
 def new generation   total 157248K, used 32882K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
  eden space 139776K,  23% used [0x00000000e0000000, 0x00000000e201cba0, 0x00000000e8880000)
  from space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
  to   space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
 tenured generation   total 349568K, used 349258K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
   the space 349568K,  99% used [0x00000000eaaa0000, 0x00000000fffb2950, 0x00000000fffb2a00, 0x0000000100000000)
 Metaspace       used 2603K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 287K, capacity 386K, committed 512K, reserved 1048576K

```
分析如下：
串行的整个在GC期间内存容量都不变，年轻代157248K，老年代：349568K，堆：506816K
4、并行GC
```
D:\>java -XX:+UseParallelGC -Xms512m -Xmx512m -Xloggc:ftp.logParallel -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
执行结束!共生成对象次数:9451
```
生成GC日志如下：
```
Java HotSpot(TM) 64-Bit Server VM (25.171-b11) for windows-amd64 JRE (1.8.0_171-b11), built on Mar 28 2018 16:06:12 by "java_re" with MS VC++ 10.0 (VS2010)
Memory: 4k page, physical 8230708k(3161800k free), swap 15570740k(6408660k free)
CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC 
2021-05-15T22:11:34.697+0800: 0.135: [GC (Allocation Failure) [PSYoungGen: 131584K->21497K(153088K)] 131584K->42745K(502784K), 0.0066143 secs] [Times: user=0.06 sys=0.06, real=0.02 secs] 
2021-05-15T22:11:34.728+0800: 0.158: [GC (Allocation Failure) [PSYoungGen: 153081K->21500K(153088K)] 174329K->90074K(502784K), 0.0093328 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:34.744+0800: 0.182: [GC (Allocation Failure) [PSYoungGen: 153084K->21500K(153088K)] 221658K->131517K(502784K), 0.0081567 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
2021-05-15T22:11:34.775+0800: 0.202: [GC (Allocation Failure) [PSYoungGen: 153084K->21500K(153088K)] 263101K->176460K(502784K), 0.0083879 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:34.791+0800: 0.226: [GC (Allocation Failure) [PSYoungGen: 153084K->21501K(153088K)] 308044K->219471K(502784K), 0.0084276 secs] [Times: user=0.02 sys=0.11, real=0.02 secs] 
2021-05-15T22:11:34.822+0800: 0.249: [GC (Allocation Failure) [PSYoungGen: 153085K->21499K(80384K)] 351055K->265010K(430080K), 0.0086307 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:34.838+0800: 0.264: [GC (Allocation Failure) [PSYoungGen: 80379K->30505K(116736K)] 323890K->281101K(466432K), 0.0043295 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:34.838+0800: 0.275: [GC (Allocation Failure) [PSYoungGen: 89385K->44803K(116736K)] 339981K->300068K(466432K), 0.0057715 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
2021-05-15T22:11:34.853+0800: 0.287: [GC (Allocation Failure) [PSYoungGen: 103683K->57798K(116736K)] 358948K->320296K(466432K), 0.0074752 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
2021-05-15T22:11:34.869+0800: 0.301: [GC (Allocation Failure) [PSYoungGen: 116678K->42171K(116736K)] 379176K->338228K(466432K), 0.0089241 secs] [Times: user=0.03 sys=0.09, real=0.02 secs] 
2021-05-15T22:11:34.885+0800: 0.310: [Full GC (Ergonomics) [PSYoungGen: 42171K->0K(116736K)] [ParOldGen: 296057K->239626K(349696K)] 338228K->239626K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0319678 secs] [Times: user=0.13 sys=0.00, real=0.03 secs] 
2021-05-15T22:11:34.916+0800: 0.353: [GC (Allocation Failure) [PSYoungGen: 58723K->24799K(116736K)] 298350K->264426K(466432K), 0.0034938 secs] [Times: user=0.11 sys=0.00, real=0.02 secs] 
2021-05-15T22:11:34.933+0800: 0.365: [GC (Allocation Failure) [PSYoungGen: 83129K->21007K(116736K)] 322756K->284790K(466432K), 0.0052152 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:34.948+0800: 0.379: [GC (Allocation Failure) [PSYoungGen: 79887K->22211K(116736K)] 343670K->305192K(466432K), 0.0047980 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:34.964+0800: 0.392: [GC (Allocation Failure) [PSYoungGen: 81091K->16499K(116736K)] 364072K->321097K(466432K), 0.0048943 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:34.964+0800: 0.397: [Full GC (Ergonomics) [PSYoungGen: 16499K->0K(116736K)] [ParOldGen: 304598K->267037K(349696K)] 321097K->267037K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0301751 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
2021-05-15T22:11:35.011+0800: 0.438: [GC (Allocation Failure) [PSYoungGen: 58732K->20990K(116736K)] 325769K->288028K(466432K), 0.0029365 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.026+0800: 0.451: [GC (Allocation Failure) [PSYoungGen: 79512K->16251K(116736K)] 346549K->302292K(466432K), 0.0042392 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.042+0800: 0.468: [GC (Allocation Failure) [PSYoungGen: 75131K->16713K(116736K)] 361172K->317295K(466432K), 0.0040155 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.042+0800: 0.481: [GC (Allocation Failure) [PSYoungGen: 75593K->20760K(116736K)] 376175K->336600K(466432K), 0.0050775 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
2021-05-15T22:11:35.058+0800: 0.487: [Full GC (Ergonomics) [PSYoungGen: 20760K->0K(116736K)] [ParOldGen: 315840K->275591K(349696K)] 336600K->275591K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0305458 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
2021-05-15T22:11:35.104+0800: 0.529: [GC (Allocation Failure) [PSYoungGen: 58880K->17376K(116736K)] 334471K->292967K(466432K), 0.0026341 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.104+0800: 0.540: [GC (Allocation Failure) [PSYoungGen: 75941K->25608K(116736K)] 351532K->317533K(466432K), 0.0049099 secs] [Times: user=0.00 sys=0.01, real=0.02 secs] 
2021-05-15T22:11:35.120+0800: 0.553: [GC (Allocation Failure) [PSYoungGen: 84488K->18963K(116736K)] 376413K->334955K(466432K), 0.0049504 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.120+0800: 0.558: [Full GC (Ergonomics) [PSYoungGen: 18963K->0K(116736K)] [ParOldGen: 315991K->287489K(349696K)] 334955K->287489K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0320756 secs] [Times: user=0.14 sys=0.00, real=0.03 secs] 
2021-05-15T22:11:35.167+0800: 0.601: [GC (Allocation Failure) [PSYoungGen: 58880K->19323K(116736K)] 346369K->306813K(466432K), 0.0028166 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.189+0800: 0.614: [GC (Allocation Failure) [PSYoungGen: 77457K->18737K(116736K)] 364946K->324176K(466432K), 0.0044138 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.193+0800: 0.628: [GC (Allocation Failure) [PSYoungGen: 77601K->22975K(116736K)] 383040K->346954K(466432K), 0.0059667 secs] [Times: user=0.05 sys=0.08, real=0.01 secs] 
2021-05-15T22:11:35.208+0800: 0.634: [Full GC (Ergonomics) [PSYoungGen: 22975K->0K(116736K)] [ParOldGen: 323978K->305210K(349696K)] 346954K->305210K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0357759 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
2021-05-15T22:11:35.255+0800: 0.682: [GC (Allocation Failure) [PSYoungGen: 58708K->18901K(116736K)] 363918K->324111K(466432K), 0.0027683 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.271+0800: 0.697: [GC (Allocation Failure) [PSYoungGen: 77499K->17718K(116736K)] 382709K->341585K(466432K), 0.0043261 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.271+0800: 0.701: [Full GC (Ergonomics) [PSYoungGen: 17718K->0K(116736K)] [ParOldGen: 323866K->311422K(349696K)] 341585K->311422K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0359347 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
2021-05-15T22:11:35.318+0800: 0.748: [GC (Allocation Failure) [PSYoungGen: 58880K->23085K(116736K)] 370302K->334508K(466432K), 0.0030875 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.333+0800: 0.760: [GC (Allocation Failure) [PSYoungGen: 81965K->14937K(116736K)] 393388K->348852K(466432K), 0.0049643 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.333+0800: 0.765: [Full GC (Ergonomics) [PSYoungGen: 14937K->0K(116736K)] [ParOldGen: 333915K->316219K(349696K)] 348852K->316219K(466432K), [Metaspace: 2597K->2597K(1056768K)], 0.0345327 secs] [Times: user=0.24 sys=0.00, real=0.03 secs] 
2021-05-15T22:11:35.380+0800: 0.811: [GC (Allocation Failure) [PSYoungGen: 58820K->24534K(116736K)] 375040K->340754K(466432K), 0.0031581 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.399+0800: 0.823: [GC (Allocation Failure) [PSYoungGen: 83414K->43124K(113664K)] 399634K->359344K(463360K), 0.0046943 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:11:35.399+0800: 0.836: [GC (Allocation Failure) --[PSYoungGen: 102004K->102004K(113664K)] 418224K->451652K(463360K), 0.0166309 secs] [Times: user=0.13 sys=0.00, real=0.03 secs] 
2021-05-15T22:11:35.428+0800: 0.853: [Full GC (Ergonomics) [PSYoungGen: 102004K->0K(113664K)] [ParOldGen: 349648K->326043K(349696K)] 451652K->326043K(463360K), [Metaspace: 2597K->2597K(1056768K)], 0.0578763 secs] [Times: user=0.38 sys=0.00, real=0.05 secs] 
2021-05-15T22:11:35.491+0800: 0.927: [Full GC (Ergonomics) [PSYoungGen: 58845K->0K(113664K)] [ParOldGen: 326043K->330558K(349696K)] 384889K->330558K(463360K), [Metaspace: 2597K->2597K(1056768K)], 0.0384374 secs] [Times: user=0.38 sys=0.00, real=0.05 secs] 
2021-05-15T22:11:35.538+0800: 0.976: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(113664K)] [ParOldGen: 330558K->335710K(349696K)] 389438K->335710K(463360K), [Metaspace: 2597K->2597K(1056768K)], 0.0365953 secs] [Times: user=0.27 sys=0.00, real=0.05 secs] 
2021-05-15T22:11:35.584+0800: 1.024: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(113664K)] [ParOldGen: 335710K->339335K(349696K)] 394590K->339335K(463360K), [Metaspace: 2597K->2597K(1056768K)], 0.0387556 secs] [Times: user=0.38 sys=0.00, real=0.05 secs] 
Heap
 PSYoungGen      total 113664K, used 56345K [0x00000000f5580000, 0x0000000100000000, 0x0000000100000000)
  eden space 58880K, 95% used [0x00000000f5580000,0x00000000f8c864a8,0x00000000f8f00000)
  from space 54784K, 0% used [0x00000000fca80000,0x00000000fca80000,0x0000000100000000)
  to   space 57856K, 0% used [0x00000000f8f00000,0x00000000f8f00000,0x00000000fc780000)
 ParOldGen       total 349696K, used 339335K [0x00000000e0000000, 0x00000000f5580000, 0x00000000f5580000)
  object space 349696K, 97% used [0x00000000e0000000,0x00000000f4b61e60,0x00000000f5580000)
 Metaspace       used 2603K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 287K, capacity 386K, committed 512K, reserved 1048576K

```
分析如下：
（1）为什么最后的年轻代比最初的年轻代分配的内存少了？？？？
5、CMS
```
D:\>java -XX:+UseConcMarkSweepGC -Xms512m -Xmx512m -Xloggc:ftp.logCMS -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
执行结束!共生成对象次数:12216
```
生成GC日志如下：
```
Java HotSpot(TM) 64-Bit Server VM (25.171-b11) for windows-amd64 JRE (1.8.0_171-b11), built on Mar 28 2018 16:06:12 by "java_re" with MS VC++ 10.0 (VS2010)
Memory: 4k page, physical 8230708k(3124684k free), swap 15570740k(6479504k free)
CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:MaxNewSize=178958336 -XX:MaxTenuringThreshold=6 -XX:NewSize=178958336 -XX:OldPLABSize=16 -XX:OldSize=357912576 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC 
2021-05-15T22:13:53.979+0800: 0.143: [GC (Allocation Failure) 2021-05-15T22:13:53.979+0800: 0.143: [ParNew: 139776K->17466K(157248K), 0.0067307 secs] 139776K->39974K(506816K), 0.0068660 secs] [Times: user=0.08 sys=0.05, real=0.01 secs] 
2021-05-15T22:13:54.010+0800: 0.167: [GC (Allocation Failure) 2021-05-15T22:13:54.010+0800: 0.168: [ParNew: 157242K->17472K(157248K), 0.0090144 secs] 179750K->82559K(506816K), 0.0090717 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.026+0800: 0.192: [GC (Allocation Failure) 2021-05-15T22:13:54.026+0800: 0.192: [ParNew: 157248K->17472K(157248K), 0.0212252 secs] 222335K->129563K(506816K), 0.0212832 secs] [Times: user=0.22 sys=0.03, real=0.03 secs] 
2021-05-15T22:13:54.073+0800: 0.228: [GC (Allocation Failure) 2021-05-15T22:13:54.073+0800: 0.228: [ParNew: 157248K->17471K(157248K), 0.0143400 secs] 269339K->172004K(506816K), 0.0143968 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.088+0800: 0.258: [GC (Allocation Failure) 2021-05-15T22:13:54.088+0800: 0.258: [ParNew: 157247K->17471K(157248K), 0.0158188 secs] 311780K->214690K(506816K), 0.0158753 secs] [Times: user=0.08 sys=0.03, real=0.02 secs] 
2021-05-15T22:13:54.104+0800: 0.274: [GC (CMS Initial Mark) [1 CMS-initial-mark: 197219K(349568K)] 218330K(506816K), 0.0002912 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2021-05-15T22:13:54.119+0800: 0.274: [CMS-concurrent-mark-start]
2021-05-15T22:13:54.119+0800: 0.276: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.119+0800: 0.276: [CMS-concurrent-preclean-start]
2021-05-15T22:13:54.119+0800: 0.276: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.119+0800: 0.276: [CMS-concurrent-abortable-preclean-start]
2021-05-15T22:13:54.119+0800: 0.290: [GC (Allocation Failure) 2021-05-15T22:13:54.119+0800: 0.290: [ParNew: 157185K->17468K(157248K), 0.0158518 secs] 354404K->259387K(506816K), 0.0159082 secs] [Times: user=0.03 sys=0.02, real=0.03 secs] 
2021-05-15T22:13:54.151+0800: 0.320: [GC (Allocation Failure) 2021-05-15T22:13:54.151+0800: 0.320: [ParNew: 157244K->17470K(157248K), 0.0129844 secs] 399163K->300446K(506816K), 0.0130404 secs] [Times: user=0.11 sys=0.01, real=0.01 secs] 
2021-05-15T22:13:54.182+0800: 0.347: [GC (Allocation Failure) 2021-05-15T22:13:54.182+0800: 0.347: [ParNew: 157246K->17471K(157248K), 0.0199054 secs] 440222K->351280K(506816K), 0.0199613 secs] [Times: user=0.09 sys=0.03, real=0.02 secs] 
2021-05-15T22:13:54.198+0800: 0.367: [CMS-concurrent-abortable-preclean: 0.003/0.091 secs] [Times: user=0.25 sys=0.06, real=0.08 secs] 
2021-05-15T22:13:54.198+0800: 0.367: [GC (CMS Final Remark) [YG occupancy: 20356 K (157248 K)]2021-05-15T22:13:54.198+0800: 0.367: [Rescan (parallel) , 0.0003383 secs]2021-05-15T22:13:54.198+0800: 0.368: [weak refs processing, 0.0000087 secs]2021-05-15T22:13:54.198+0800: 0.368: [class unloading, 0.0001823 secs]2021-05-15T22:13:54.198+0800: 0.368: [scrub symbol table, 0.0003272 secs]2021-05-15T22:13:54.213+0800: 0.368: [scrub string table, 0.0001002 secs][1 CMS-remark: 333808K(349568K)] 354164K(506816K), 0.0010122 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
2021-05-15T22:13:54.213+0800: 0.368: [CMS-concurrent-sweep-start]
2021-05-15T22:13:54.213+0800: 0.369: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.213+0800: 0.369: [CMS-concurrent-reset-start]
2021-05-15T22:13:54.213+0800: 0.370: [CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.213+0800: 0.383: [GC (Allocation Failure) 2021-05-15T22:13:54.213+0800: 0.383: [ParNew: 157247K->157247K(157248K), 0.0000154 secs]2021-05-15T22:13:54.213+0800: 0.383: [CMS: 299130K->265804K(349568K), 0.0313798 secs] 456378K->265804K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0314668 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:13:54.244+0800: 0.414: [GC (CMS Initial Mark) [1 CMS-initial-mark: 265804K(349568K)] 269230K(506816K), 0.0003278 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.244+0800: 0.415: [CMS-concurrent-mark-start]
2021-05-15T22:13:54.260+0800: 0.416: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.05 sys=0.00, real=0.02 secs] 
2021-05-15T22:13:54.260+0800: 0.416: [CMS-concurrent-preclean-start]
2021-05-15T22:13:54.260+0800: 0.416: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.260+0800: 0.416: [CMS-concurrent-abortable-preclean-start]
2021-05-15T22:13:54.260+0800: 0.429: [GC (Allocation Failure) 2021-05-15T22:13:54.260+0800: 0.429: [ParNew: 139573K->17470K(157248K), 0.0062448 secs] 405378K->311151K(506816K), 0.0063029 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
2021-05-15T22:13:54.291+0800: 0.450: [GC (Allocation Failure) 2021-05-15T22:13:54.291+0800: 0.450: [ParNew: 157246K->17468K(157248K), 0.0075116 secs] 450927K->348859K(506816K), 0.0075685 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.291+0800: 0.458: [CMS-concurrent-abortable-preclean: 0.002/0.042 secs] [Times: user=0.14 sys=0.00, real=0.03 secs] 
2021-05-15T22:13:54.291+0800: 0.458: [GC (CMS Final Remark) [YG occupancy: 27422 K (157248 K)]2021-05-15T22:13:54.291+0800: 0.458: [Rescan (parallel) , 0.0005059 secs]2021-05-15T22:13:54.291+0800: 0.458: [weak refs processing, 0.0000087 secs]2021-05-15T22:13:54.291+0800: 0.458: [class unloading, 0.0001791 secs]2021-05-15T22:13:54.291+0800: 0.459: [scrub symbol table, 0.0002804 secs]2021-05-15T22:13:54.291+0800: 0.459: [scrub string table, 0.0000986 secs][1 CMS-remark: 331390K(349568K)] 358812K(506816K), 0.0011161 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.291+0800: 0.459: [CMS-concurrent-sweep-start]
2021-05-15T22:13:54.291+0800: 0.460: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.291+0800: 0.460: [CMS-concurrent-reset-start]
2021-05-15T22:13:54.291+0800: 0.460: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.311+0800: 0.472: [GC (Allocation Failure) 2021-05-15T22:13:54.311+0800: 0.472: [ParNew: 157244K->157244K(157248K), 0.0000147 secs]2021-05-15T22:13:54.311+0800: 0.472: [CMS: 330973K->295276K(349568K), 0.0341915 secs] 488218K->295276K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0342756 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:13:54.342+0800: 0.506: [GC (CMS Initial Mark) [1 CMS-initial-mark: 295276K(349568K)] 298187K(506816K), 0.0006097 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.342+0800: 0.507: [CMS-concurrent-mark-start]
2021-05-15T22:13:54.342+0800: 0.508: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.342+0800: 0.508: [CMS-concurrent-preclean-start]
2021-05-15T22:13:54.342+0800: 0.509: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.342+0800: 0.509: [CMS-concurrent-abortable-preclean-start]
2021-05-15T22:13:54.358+0800: 0.522: [GC (Allocation Failure) 2021-05-15T22:13:54.358+0800: 0.522: [ParNew: 139730K->17471K(157248K), 0.0066543 secs] 435007K->343294K(506816K), 0.0067123 secs] [Times: user=0.00 sys=0.00, real=0.02 secs] 
2021-05-15T22:13:54.374+0800: 0.529: [CMS-concurrent-abortable-preclean: 0.001/0.021 secs] [Times: user=0.02 sys=0.00, real=0.03 secs] 
2021-05-15T22:13:54.374+0800: 0.529: [GC (CMS Final Remark) [YG occupancy: 27578 K (157248 K)]2021-05-15T22:13:54.374+0800: 0.529: [Rescan (parallel) , 0.0004548 secs]2021-05-15T22:13:54.374+0800: 0.530: [weak refs processing, 0.0000097 secs]2021-05-15T22:13:54.374+0800: 0.530: [class unloading, 0.0001910 secs]2021-05-15T22:13:54.374+0800: 0.530: [scrub symbol table, 0.0003080 secs]2021-05-15T22:13:54.374+0800: 0.530: [scrub string table, 0.0000998 secs][1 CMS-remark: 325822K(349568K)] 353401K(506816K), 0.0011131 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.374+0800: 0.531: [CMS-concurrent-sweep-start]
2021-05-15T22:13:54.374+0800: 0.531: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.374+0800: 0.531: [CMS-concurrent-reset-start]
2021-05-15T22:13:54.374+0800: 0.531: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.374+0800: 0.543: [GC (Allocation Failure) 2021-05-15T22:13:54.374+0800: 0.543: [ParNew: 157247K->157247K(157248K), 0.0000148 secs]2021-05-15T22:13:54.374+0800: 0.543: [CMS: 325253K->317590K(349568K), 0.0365488 secs] 482501K->317590K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0366315 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2021-05-15T22:13:54.421+0800: 0.580: [GC (CMS Initial Mark) [1 CMS-initial-mark: 317590K(349568K)] 320845K(506816K), 0.0004740 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.421+0800: 0.581: [CMS-concurrent-mark-start]
2021-05-15T22:13:54.421+0800: 0.582: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.421+0800: 0.582: [CMS-concurrent-preclean-start]
2021-05-15T22:13:54.421+0800: 0.582: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.421+0800: 0.582: [CMS-concurrent-abortable-preclean-start]
2021-05-15T22:13:54.436+0800: 0.595: [GC (Allocation Failure) 2021-05-15T22:13:54.436+0800: 0.595: [ParNew (promotion failed): 139776K->157245K(157248K), 0.0122608 secs]2021-05-15T22:13:54.452+0800: 0.607: [CMS2021-05-15T22:13:54.452+0800: 0.607: [CMS-concurrent-abortable-preclean: 0.000/0.025 secs] [Times: user=0.14 sys=0.00, real=0.03 secs] 
 (concurrent mode failure): 349433K->330166K(349568K), 0.0378559 secs] 457366K->330166K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0502090 secs] [Times: user=0.16 sys=0.00, real=0.05 secs] 
2021-05-15T22:13:54.499+0800: 0.660: [GC (Allocation Failure) 2021-05-15T22:13:54.499+0800: 0.660: [ParNew: 139776K->139776K(157248K), 0.0000152 secs]2021-05-15T22:13:54.499+0800: 0.660: [CMS: 330166K->332174K(349568K), 0.0379118 secs] 469942K->332174K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0379959 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:13:54.530+0800: 0.698: [GC (CMS Initial Mark) [1 CMS-initial-mark: 332174K(349568K)] 335257K(506816K), 0.0005587 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.530+0800: 0.699: [CMS-concurrent-mark-start]
2021-05-15T22:13:54.530+0800: 0.700: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.530+0800: 0.700: [CMS-concurrent-preclean-start]
2021-05-15T22:13:54.546+0800: 0.701: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.03 sys=0.00, real=0.02 secs] 
2021-05-15T22:13:54.546+0800: 0.701: [CMS-concurrent-abortable-preclean-start]
2021-05-15T22:13:54.546+0800: 0.701: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.546+0800: 0.701: [GC (CMS Final Remark) [YG occupancy: 19164 K (157248 K)]2021-05-15T22:13:54.546+0800: 0.701: [Rescan (parallel) , 0.0005162 secs]2021-05-15T22:13:54.546+0800: 0.701: [weak refs processing, 0.0000093 secs]2021-05-15T22:13:54.546+0800: 0.701: [class unloading, 0.0001809 secs]2021-05-15T22:13:54.546+0800: 0.702: [scrub symbol table, 0.0002787 secs]2021-05-15T22:13:54.546+0800: 0.702: [scrub string table, 0.0001030 secs][1 CMS-remark: 332174K(349568K)] 351339K(506816K), 0.0011369 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.546+0800: 0.702: [CMS-concurrent-sweep-start]
2021-05-15T22:13:54.546+0800: 0.703: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.546+0800: 0.703: [CMS-concurrent-reset-start]
2021-05-15T22:13:54.546+0800: 0.703: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.546+0800: 0.715: [GC (Allocation Failure) 2021-05-15T22:13:54.546+0800: 0.715: [ParNew: 139625K->139625K(157248K), 0.0000148 secs]2021-05-15T22:13:54.546+0800: 0.715: [CMS: 331715K->340651K(349568K), 0.0386903 secs] 471340K->340651K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0387713 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2021-05-15T22:13:54.592+0800: 0.754: [GC (CMS Initial Mark) [1 CMS-initial-mark: 340651K(349568K)] 343646K(506816K), 0.0005681 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.592+0800: 0.755: [CMS-concurrent-mark-start]
2021-05-15T22:13:54.592+0800: 0.756: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.592+0800: 0.756: [CMS-concurrent-preclean-start]
2021-05-15T22:13:54.592+0800: 0.756: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.592+0800: 0.756: [CMS-concurrent-abortable-preclean-start]
2021-05-15T22:13:54.592+0800: 0.756: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.592+0800: 0.757: [GC (CMS Final Remark) [YG occupancy: 24097 K (157248 K)]2021-05-15T22:13:54.592+0800: 0.757: [Rescan (parallel) , 0.0005665 secs]2021-05-15T22:13:54.592+0800: 0.757: [weak refs processing, 0.0000096 secs]2021-05-15T22:13:54.592+0800: 0.757: [class unloading, 0.0001859 secs]2021-05-15T22:13:54.592+0800: 0.757: [scrub symbol table, 0.0002784 secs]2021-05-15T22:13:54.592+0800: 0.758: [scrub string table, 0.0000990 secs][1 CMS-remark: 340651K(349568K)] 364749K(506816K), 0.0011860 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.592+0800: 0.758: [CMS-concurrent-sweep-start]
2021-05-15T22:13:54.592+0800: 0.758: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.592+0800: 0.758: [CMS-concurrent-reset-start]
2021-05-15T22:13:54.592+0800: 0.759: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.608+0800: 0.771: [GC (Allocation Failure) 2021-05-15T22:13:54.608+0800: 0.771: [ParNew: 139776K->139776K(157248K), 0.0000154 secs]2021-05-15T22:13:54.608+0800: 0.771: [CMS: 340600K->342733K(349568K), 0.0389321 secs] 480376K->342733K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0390263 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2021-05-15T22:13:54.655+0800: 0.810: [GC (CMS Initial Mark) [1 CMS-initial-mark: 342733K(349568K)] 346133K(506816K), 0.0005099 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.655+0800: 0.810: [CMS-concurrent-mark-start]
2021-05-15T22:13:54.655+0800: 0.812: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.655+0800: 0.812: [CMS-concurrent-preclean-start]
2021-05-15T22:13:54.655+0800: 0.812: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.655+0800: 0.812: [CMS-concurrent-abortable-preclean-start]
2021-05-15T22:13:54.655+0800: 0.812: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.655+0800: 0.812: [GC (CMS Final Remark) [YG occupancy: 25500 K (157248 K)]2021-05-15T22:13:54.655+0800: 0.812: [Rescan (parallel) , 0.0005236 secs]2021-05-15T22:13:54.655+0800: 0.813: [weak refs processing, 0.0000095 secs]2021-05-15T22:13:54.655+0800: 0.813: [class unloading, 0.0002203 secs]2021-05-15T22:13:54.655+0800: 0.813: [scrub symbol table, 0.0002782 secs]2021-05-15T22:13:54.655+0800: 0.814: [scrub string table, 0.0000984 secs][1 CMS-remark: 342733K(349568K)] 368234K(506816K), 0.0011848 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.655+0800: 0.814: [CMS-concurrent-sweep-start]
2021-05-15T22:13:54.655+0800: 0.814: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.655+0800: 0.814: [CMS-concurrent-reset-start]
2021-05-15T22:13:54.655+0800: 0.814: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.671+0800: 0.826: [GC (Allocation Failure) 2021-05-15T22:13:54.671+0800: 0.826: [ParNew: 139776K->139776K(157248K), 0.0000146 secs]2021-05-15T22:13:54.671+0800: 0.826: [CMS: 341687K->346616K(349568K), 0.0395177 secs] 481463K->346616K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0396000 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:13:54.702+0800: 0.865: [GC (CMS Initial Mark) [1 CMS-initial-mark: 346616K(349568K)] 349679K(506816K), 0.0006272 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.702+0800: 0.866: [CMS-concurrent-mark-start]
2021-05-15T22:13:54.702+0800: 0.867: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.702+0800: 0.867: [CMS-concurrent-preclean-start]
2021-05-15T22:13:54.702+0800: 0.868: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.702+0800: 0.868: [CMS-concurrent-abortable-preclean-start]
2021-05-15T22:13:54.702+0800: 0.868: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.702+0800: 0.868: [GC (CMS Final Remark) [YG occupancy: 24261 K (157248 K)]2021-05-15T22:13:54.702+0800: 0.868: [Rescan (parallel) , 0.0004884 secs]2021-05-15T22:13:54.702+0800: 0.869: [weak refs processing, 0.0000094 secs]2021-05-15T22:13:54.702+0800: 0.869: [class unloading, 0.0001873 secs]2021-05-15T22:13:54.702+0800: 0.869: [scrub symbol table, 0.0002763 secs]2021-05-15T22:13:54.702+0800: 0.869: [scrub string table, 0.0000987 secs][1 CMS-remark: 346616K(349568K)] 370878K(506816K), 0.0011068 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.702+0800: 0.869: [CMS-concurrent-sweep-start]
2021-05-15T22:13:54.702+0800: 0.870: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.702+0800: 0.870: [CMS-concurrent-reset-start]
2021-05-15T22:13:54.702+0800: 0.870: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.717+0800: 0.881: [GC (Allocation Failure) 2021-05-15T22:13:54.717+0800: 0.881: [ParNew: 139776K->139776K(157248K), 0.0000156 secs]2021-05-15T22:13:54.717+0800: 0.881: [CMS: 346244K->349498K(349568K), 0.0395935 secs] 486020K->352071K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0396763 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2021-05-15T22:13:54.764+0800: 0.920: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349498K(349568K)] 352408K(506816K), 0.0001893 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.764+0800: 0.921: [CMS-concurrent-mark-start]
2021-05-15T22:13:54.764+0800: 0.922: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.764+0800: 0.922: [CMS-concurrent-preclean-start]
2021-05-15T22:13:54.764+0800: 0.923: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.764+0800: 0.923: [CMS-concurrent-abortable-preclean-start]
2021-05-15T22:13:54.764+0800: 0.923: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.764+0800: 0.923: [GC (CMS Final Remark) [YG occupancy: 32622 K (157248 K)]2021-05-15T22:13:54.764+0800: 0.923: [Rescan (parallel) , 0.0007055 secs]2021-05-15T22:13:54.764+0800: 0.924: [weak refs processing, 0.0000137 secs]2021-05-15T22:13:54.764+0800: 0.924: [class unloading, 0.0001806 secs]2021-05-15T22:13:54.764+0800: 0.924: [scrub symbol table, 0.0002876 secs]2021-05-15T22:13:54.764+0800: 0.924: [scrub string table, 0.0000984 secs][1 CMS-remark: 349498K(349568K)] 382120K(506816K), 0.0013392 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.764+0800: 0.925: [CMS-concurrent-sweep-start]
2021-05-15T22:13:54.764+0800: 0.925: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.764+0800: 0.925: [CMS-concurrent-reset-start]
2021-05-15T22:13:54.764+0800: 0.926: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.780+0800: 0.937: [GC (Allocation Failure) 2021-05-15T22:13:54.780+0800: 0.937: [ParNew: 157020K->157020K(157248K), 0.0000148 secs]2021-05-15T22:13:54.780+0800: 0.937: [CMS: 348755K->349565K(349568K), 0.0401619 secs] 505775K->354869K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0402461 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2021-05-15T22:13:54.811+0800: 0.977: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349565K(349568K)] 358246K(506816K), 0.0003563 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.811+0800: 0.978: [CMS-concurrent-mark-start]
2021-05-15T22:13:54.811+0800: 0.979: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.811+0800: 0.979: [CMS-concurrent-preclean-start]
2021-05-15T22:13:54.811+0800: 0.980: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.811+0800: 0.980: [CMS-concurrent-abortable-preclean-start]
2021-05-15T22:13:54.811+0800: 0.980: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.811+0800: 0.980: [GC (CMS Final Remark) [YG occupancy: 31099 K (157248 K)]2021-05-15T22:13:54.811+0800: 0.980: [Rescan (parallel) , 0.0005187 secs]2021-05-15T22:13:54.811+0800: 0.981: [weak refs processing, 0.0000088 secs]2021-05-15T22:13:54.811+0800: 0.981: [class unloading, 0.0001861 secs]2021-05-15T22:13:54.811+0800: 0.981: [scrub symbol table, 0.0003010 secs]2021-05-15T22:13:54.827+0800: 0.981: [scrub string table, 0.0001196 secs][1 CMS-remark: 349565K(349568K)] 380664K(506816K), 0.0011921 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2021-05-15T22:13:54.827+0800: 0.982: [CMS-concurrent-sweep-start]
2021-05-15T22:13:54.827+0800: 0.982: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.827+0800: 0.982: [CMS-concurrent-reset-start]
2021-05-15T22:13:54.827+0800: 0.982: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.827+0800: 0.995: [GC (Allocation Failure) 2021-05-15T22:13:54.827+0800: 0.995: [ParNew: 156792K->156792K(157248K), 0.0000150 secs]2021-05-15T22:13:54.827+0800: 0.995: [CMS: 347780K->348981K(349568K), 0.0419718 secs] 504573K->358165K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0420506 secs] [Times: user=0.06 sys=0.00, real=0.05 secs] 
2021-05-15T22:13:54.878+0800: 1.037: [GC (CMS Initial Mark) [1 CMS-initial-mark: 348981K(349568K)] 361459K(506816K), 0.0004128 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.878+0800: 1.038: [CMS-concurrent-mark-start]
2021-05-15T22:13:54.878+0800: 1.039: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.878+0800: 1.039: [CMS-concurrent-preclean-start]
2021-05-15T22:13:54.878+0800: 1.040: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.878+0800: 1.040: [CMS-concurrent-abortable-preclean-start]
2021-05-15T22:13:54.878+0800: 1.040: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.878+0800: 1.041: [GC (CMS Final Remark) [YG occupancy: 35255 K (157248 K)]2021-05-15T22:13:54.878+0800: 1.041: [Rescan (parallel) , 0.0004592 secs]2021-05-15T22:13:54.878+0800: 1.041: [weak refs processing, 0.0000089 secs]2021-05-15T22:13:54.878+0800: 1.041: [class unloading, 0.0001907 secs]2021-05-15T22:13:54.878+0800: 1.041: [scrub symbol table, 0.0002782 secs]2021-05-15T22:13:54.878+0800: 1.041: [scrub string table, 0.0000991 secs][1 CMS-remark: 348981K(349568K)] 384237K(506816K), 0.0010843 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.878+0800: 1.042: [CMS-concurrent-sweep-start]
2021-05-15T22:13:54.878+0800: 1.042: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.878+0800: 1.042: [CMS-concurrent-reset-start]
2021-05-15T22:13:54.878+0800: 1.042: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.894+0800: 1.054: [GC (Allocation Failure) 2021-05-15T22:13:54.894+0800: 1.054: [ParNew: 157131K->157131K(157248K), 0.0000163 secs]2021-05-15T22:13:54.894+0800: 1.054: [CMS: 347802K->349553K(349568K), 0.0416415 secs] 504933K->365076K(506816K), [Metaspace: 2597K->2597K(1056768K)], 0.0417228 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2021-05-15T22:13:54.941+0800: 1.096: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349553K(349568K)] 368298K(506816K), 0.0005122 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-05-15T22:13:54.941+0800: 1.096: [CMS-concurrent-mark-start]
Heap
 par new generation   total 157248K, used 21541K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
  eden space 139776K,  15% used [0x00000000e0000000, 0x00000000e1509458, 0x00000000e8880000)
  from space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
  to   space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
 concurrent mark-sweep generation total 349568K, used 349553K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
 Metaspace       used 2603K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 287K, capacity 386K, committed 512K, reserved 1048576K

```

6、G1
```
D:\>java -XX:+UseG1GC -Xms512m -Xmx512m -Xloggc:ftp.logG1 -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
执行结束!共生成对象次数:10738
```
生成GC日志如下：
```

```
