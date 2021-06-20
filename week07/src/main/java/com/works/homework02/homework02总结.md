#第2题作业
2.(必做）按自己设计的表结构，插入 100 万订单模拟数据，测试不同方式的插入效率	<br/>
环境：window10	<br/>
配置：Intel(R) Core(TM) i7-8565U CPU @ 1.80GHz   1.99 GHz	<br/>
内存：8G	<br/>
数据库：MySQL 5.7	<br/>
三种方案：	<br/>
（1）单纯使用JDBC插入100W数据，耗时682731ms（大约11m）	<br/>
（2）使用事务批量提交，耗时88628ms（大约88s），试了四五次，基本在这个左右	<br/>
（3）rewriteBatchedStatements=true，和第二种差不多	<br/>
没有达到老师要求的时间，还需继续努力。	<br/>
