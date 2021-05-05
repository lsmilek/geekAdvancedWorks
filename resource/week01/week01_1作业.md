#第一题作业
##对应java类：

```

package com.geek.week01;

public class Week01Work1 {
    public static void main(String[] args){
        int[] nums = new int[10];
        for(int i=0;i<nums.length;i++){
            nums[i] = i;
        }
        int sum = 1;
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                sum +=nums[i];
            }else{
                sum *=nums[i];
            }

        }
        System.out.println(sum);
    }

}

```
##对应字节码及说明：
```
D:\IdeaProjects\geekAdvancedWorks\src\com\geek\week01>javac -g Week01Work1.java

D:\IdeaProjects\geekAdvancedWorks\src\com\geek\week01>javap -v -verbose Week01Work1.class
Classfile /D:/IdeaProjects/geekAdvancedWorks/src/com/geek/week01/Week01Work1.class
  Last modified 2021-5-5; size 746 bytes
  MD5 checksum 3daa7000706ae328dbd68bd229c7e27f
  Compiled from "Week01Work1.java"
public class com.geek.week01.Week01Work1
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #5.#26         // java/lang/Object."<init>":()V
   #2 = Fieldref           #27.#28        // java/lang/System.out:Ljava/io/PrintStream;
   #3 = Methodref          #29.#30        // java/io/PrintStream.println:(I)V
   #4 = Class              #31            // com/geek/week01/Week01Work1
   #5 = Class              #32            // java/lang/Object
   #6 = Utf8               <init>
   #7 = Utf8               ()V
   #8 = Utf8               Code
   #9 = Utf8               LineNumberTable
  #10 = Utf8               LocalVariableTable
  #11 = Utf8               this
  #12 = Utf8               Lcom/geek/week01/Week01Work1;
  #13 = Utf8               main
  #14 = Utf8               ([Ljava/lang/String;)V
  #15 = Utf8               i
  #16 = Utf8               I
  #17 = Utf8               args
  #18 = Utf8               [Ljava/lang/String;
  #19 = Utf8               nums
  #20 = Utf8               [I
  #21 = Utf8               sum
  #22 = Utf8               StackMapTable
  #23 = Class              #20            // "[I"
  #24 = Utf8               SourceFile
  #25 = Utf8               Week01Work1.java
  #26 = NameAndType        #6:#7          // "<init>":()V
  #27 = Class              #33            // java/lang/System
  #28 = NameAndType        #34:#35        // out:Ljava/io/PrintStream;
  #29 = Class              #36            // java/io/PrintStream
  #30 = NameAndType        #37:#38        // println:(I)V
  #31 = Utf8               com/geek/week01/Week01Work1
  #32 = Utf8               java/lang/Object
  #33 = Utf8               java/lang/System
  #34 = Utf8               out
  #35 = Utf8               Ljava/io/PrintStream;
  #36 = Utf8               java/io/PrintStream
  #37 = Utf8               println
  #38 = Utf8               (I)V
{
  public com.geek.week01.Week01Work1();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/geek/week01/Week01Work1;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=4, args_size=1
         0: bipush        10            //将10压入操作数栈
         2: newarray       int          //新建int数组，长度为10
         4: astore_1                    //将刚创建的数组仿佛本地变量表1
         5: iconst_0                    //将0压入栈中,对应for循环中的i
         6: istore_2                    //将i放入本地变量表2
         7: iload_2                     //将本地变量表2处的i压入栈中
         8: aload_1                     //将本地变量表1处的数组引用压入栈中
         9: arraylength                 //求得数组长度，放入本地变量表3处
        10: if_icmpge     23            //将本地变量表2处的i和3处的数组长度10比较
        13: aload_1                     //将本地变量表1处的数组引用压入栈中
        14: iload_2                     //将本地变量表2处的i压入栈中
        15: iload_2                     //将本地变量表2处的i压入栈中,赋值为i
        16: iastore                     //将数组下标为i的值赋值为i
        17: iinc          2, 1          //将本地变量表2处的i加1
        20: goto          7             //跳转到7继续执行
        23: iconst_1                    //将常量1压入操作数栈,对应sum初始值
        24: istore_2                    //将sum放入本地变量表2
        25: iconst_0                    //将常量0压入操作数栈
        26: istore_3                    //将i放入本地变量表3处，对应第二次for循环的i
        27: iload_3                     //将本地变量表3压入操作数栈
        28: aload_1                     //将本地变量表1的引用压入操作数栈
        29: arraylength                 //求得数组长度放入本地变量表
        30: if_icmpge     60            //比较本地变量表6和0处的值
        33: iload_3                     //将本地变量表3处的i的值压入栈中
        34: iconst_2                    //将常量2压入栈中
        35: irem                        //对应i%2
        36: ifne          48            //比较结果不等于0，跳到48执行
        39: iload_2                     //将本地变量表2处的sum值压入栈中
        40: aload_1                     //将本地变量表1处的数组引用压入栈中
        41: iload_3                     //将本地变量表3处的i的值压入栈
        42: iaload                      //取出数组i处的值
        43: iadd                        //将sum和数组i处的值相加
        44: istore_2                    //相加后的值放入本地变量表2处
        45: goto          54            //跳到54行执行
        48: iload_2                     //将本地变量表2处的sum值压入栈中
        49: aload_1                     //将本地变量表1处的数组引用压入栈中
        50: iload_3                     //将本地变量表3处的i的值压入栈
        51: iaload                      //取出数组i处的值
        52: imul                        //将sum的值和数组i处的值相乘
        53: istore_2                    //相乘后的值放入本地变量表2处
        54: iinc          3, 1          //将本地变量表中3处的i加1
        57: goto          27            //跳到27行执行
        60: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        63: iload_2                     //将本地变量表2处的sum值压入栈中
        64: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
        67: return
      LineNumberTable:
        line 8: 0
        line 9: 5
        line 10: 13
        line 9: 17
        line 12: 23
        line 13: 25
        line 14: 33
        line 15: 39
        line 17: 48
        line 13: 54
        line 21: 60
        line 22: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7      16     2     i   I
           27      33     3     i   I
            0      68     0  args   [Ljava/lang/String;
            5      63     1  nums   [I
           25      43     2   sum   I
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 7
          locals = [ class "[I", int ]
        frame_type = 250 /* chop */
          offset_delta = 15
        frame_type = 253 /* append */
          offset_delta = 3
          locals = [ int, int ]
        frame_type = 20 /* same */
        frame_type = 5 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
}
SourceFile: "Week01Work1.java"

```