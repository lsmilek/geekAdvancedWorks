#��2����ҵ
��Ŀ��ѡ����ʹ��ѹ�⹤�ߣ�wrk �� sb�������� gateway-server-0.0.1-SNAPSHOT.jar ʾ����

1��ʹ��jdk8Ĭ�������ռ������ģ�

��������Ϊ��
java -jar -Xmx1g -Xms1g gateway-server-0.0.1-SNAPSHOT.jar

ѹ������Ϊ��
sb -u http://localhost:8088/api/hello -c 20 -N 60
```
PS C:\WINDOWS\system32> sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2021/5/16 0:36:24
[Press C to stop the test]
406536  (RPS: 5928.5)
---------------Finished!----------------
Finished at 2021/5/16 0:37:33 (took 00:01:08.7654409)
Status 200:    406536

RPS: 6640.6 (requests/second)
Max: 1995ms
Min: 0ms
Avg: 0.2ms

  50%   below 0ms
  60%   below 0ms
  70%   below 0ms
  80%   below 0ms
  90%   below 0ms
  95%   below 0ms
  98%   below 2ms
  99%   below 3ms
99.9%   below 15ms
```

![avatar](week02_2.png)

�ӽ��������00:01:08.7654409��ʱ�����������406536�Σ��ɹ�406536�Σ�RPSΪ6640.6��
��������ʱΪ1995ms,95%�������ʱ��0ms�£�98%�ĺ�ʱ��ʱ��2ms���ڣ�99%�������ʱ��3ms�ڣ�
99.9%�������ʱ��15ms�ڣ�ƽ����ʱΪ0.2ms��

2��ʹ��G1
�����������£�
java -jar -XX:+UseG1GC -Xms1g -Xmx1g -Xloggc:ftp.logsbG1 -XX:+PrintGCDetails -XX:+PrintGCDateStamps gateway-server-0.0.1-SNAPSHOT.jar

ѹ������Ϊ��
sb -u http://localhost:8088/api/hello -c 20 -N 60

ִ�н�����£�
```
PS C:\WINDOWS\system32> sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2021/5/16 1:22:13
[Press C to stop the test]
404668  (RPS: 5990.7)
---------------Finished!----------------
Finished at 2021/5/16 1:23:21 (took 00:01:07.6122070)
Status 200:    404675

RPS: 6624.2 (requests/second)
Max: 604ms
Min: 0ms
Avg: 0.2ms

  50%   below 0ms
  60%   below 0ms
  70%   below 0ms
  80%   below 0ms
  90%   below 0ms
  95%   below 0ms
  98%   below 2ms
  99%   below 3ms
99.9%   below 16ms
```
![avatar](sbG1.png)

�ӽ��������00:01:07.6122070��ʱ�����������404675�Σ��ɹ�404675�Σ�RPSΪ6624.2��
��������ʱΪ604ms,95%�������ʱ��0ms�£�98%�ĺ�ʱ��ʱ��2ms���ڣ�99%�������ʱ��3ms�ڣ�
99.9%�������ʱ��16ms�ڣ�ƽ����ʱΪ0.2ms��

3��ʹ��CMS
�������
java -jar -XX:+UseConcMarkSweepGC -Xms1g -Xmx1g -Xloggc:ftp.logsbG1 -XX:+PrintGCDetails -XX:+PrintGCDateStamps gateway-server-0.0.1-SNAPSHOT.jar

ѹ������Ϊ��
sb -u http://localhost:8088/api/hello -c 20 -N 60

ִ�н�����£�
```
PS C:\WINDOWS\system32> sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2021/5/16 1:32:36
[Press C to stop the test]
450453  (RPS: 7053.9)
---------------Finished!----------------
Finished at 2021/5/16 1:33:40 (took 00:01:04.0309988)
Status 200:    450454

RPS: 7360.7 (requests/second)
Max: 76ms
Min: 0ms
Avg: 0.1ms

  50%   below 0ms
  60%   below 0ms
  70%   below 0ms
  80%   below 0ms
  90%   below 0ms
  95%   below 0ms
  98%   below 2ms
  99%   below 3ms
99.9%   below 10ms
```
![avatar](sbCMS.jpg)

�ӽ��������00:01:04.0309988��ʱ�����������450454�Σ��ɹ�404675�Σ�RPSΪ7360.7��
��������ʱΪ76ms,95%�������ʱ��0ms�£�98%�ĺ�ʱ��ʱ��2ms���ڣ�99%�������ʱ��3ms�ڣ�
99.9%�������ʱ��10ms�ڣ�ƽ����ʱΪ0.1ms�����ǰ���ߣ�CMS���ѹ������G1��ParallelGC�á�
4��ʹ��SerialGC
�������
java -jar -XX:+UseSerialGC -Xms1g -Xmx1g -Xloggc:ftp.logsbSer -XX:+PrintGCDetails -XX:+PrintGCDateStamps gateway-server-0.0.1-SNAPSHOT.jar
ѹ������Ϊ��
sb -u http://localhost:8088/api/hello -c 20 -N 60

ִ�н�����£�
```
PS C:\WINDOWS\system32> sb -u http://localhost:8088/api/hello -c 20 -N 60
Starting at 2021/5/16 1:41:28
[Press C to stop the test]
437270  (RPS: 6804)
437261  (RPS: 6803.9)                   ---------------Finished!----------------
437281  (RPS: 6803.6)                   Finished at 2021/5/16 1:42:32 (took 00:01:04.2893378)
Status 200:    437281

RPS: 7163.6 (requests/second)
Max: 111ms
Min: 0ms
Avg: 0.1ms

  50%   below 0ms
  60%   below 0ms
  70%   below 0ms
  80%   below 0ms
  90%   below 0ms
  95%   below 0ms
  98%   below 2ms
  99%   below 3ms
99.9%   below 9ms
```
![avatar](sbSer.jpg)
�ӽ��������00:01:04.2893378��ʱ�����������437281�Σ��ɹ�404675�Σ�RPSΪ7163.6��
��������ʱΪ111ms,95%�������ʱ��0ms�£�98%�ĺ�ʱ��ʱ��2ms���ڣ�99%�������ʱ��3ms�ڣ�
99.9%�������ʱ��9ms�ڣ�ƽ����ʱΪ0.1ms��

