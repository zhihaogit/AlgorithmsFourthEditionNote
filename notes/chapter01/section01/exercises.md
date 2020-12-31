# 习题
## 练习
### 1.1.1 给出以下表达式的值:  

a. `( 0 + 15 ) / 2`  
b. `2.0e-6 * 100000000.1`  
c. `true && false || true && true`
```
a. 7
b. 200.0000002
c. true
```

### 1.1.2 给出以下表达式的类型和值:  
a. `(1 + 2.236)/2`  
b. `1 + 2 + 3 + 4.0`  
c. `4.1 >= 4`  
d. `1 + 2 + "3"`
```
a. double 1.618
b. double 10.0
c. boolean true
d. string "33"
```

### 1.1.3 编写一个程序,从命令行得到三个整数参数。如果它们都相等则打印 equal ,否则 打印 not equal。
```java
public static void exercises03() {
    try (Scanner inside = new Scanner(System.in)) {
        int a = inside.nextInt();
        int b = inside.nextInt();
        int c = inside.nextInt();
        System.out.println(a == b && a == c ? "equal" : "not equal");
    } catch (Exception e) {
        throw e;
    }
}Í
```

### 1.1.4 下列语句各有什么问题(如果有的话)?  
a. `if (a > b) then c = 0;`  
b. `if a > b { c = 0; }`  
c. `if (a > b) c = 0;`  
d. `if (a > b) c = 0 else b = 0;`
```
a. if 后面不应该直接跟 then，java中没有 then关键字
b. if 条件需要括起来
c. 正确
d. else 前面需要断句，插入 ;形成代码块
```

### 1.1.5 编写一段程序，如果 double 类型的变量 x 和 y 都严格位于 0 和 1 之间则打印 true，否则打印 false。
```java
public static void exercises05() {
    try (Scanner inside = new Scanner(System.in)) {
        double x = inside.nextDouble();
        double y = inside.nextDouble();
        System.out.println(x > 0 && x < 1 && y > 0 && y < 1); 
    } catch (Exception e) {
        throw e;
    }
}
```

### 1.1.6 下面这段程序会打印出什么?
```java
int f = 0;
int g = 1;
for (int i = 0; i <= 15; i++)
{
  StdOut.println(f);
  f = f + g;
  g = f - g;
}
// 菲波那切数列
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
```

### 1.1.7 分别给出以下代码段打印出的值:
```java
//a.
double t = 9.0;
while (Math.abs(t - 9.0/t) > .001)
    t = (9.0/t + t) / 2.0;
StdOut.printf("%.5f\n", t);
//b.
int sum = 0;
for (int i = 1; i < 1000; i++)
    for (int j = 0; j < i; j++)
        sum++;
StdOut.println(sum);
//c. 
int sum = 0;
for (int i = 1; i < 1000; i *= 2)
    for (int j = 0; j < 1000; j++)
        sum++;
StdOut.println(sum);
```

```
a. 3.00009
b. 499500
c. 10000
```

### 1.1.8 下列语句会打印出什么结果？给出解释  
a. `System.out.println('b');`  
b. `System.out.println('b' + 'c');`  
c. `System.out.println((char) ('a' + 4));`
```
a. b 只是单纯的字符打印
b. 197 字符相加会先将字符转成 int值，再相加
c. e 字符加数字会转成 int值，再相加得到 int值，(char)强制将 int转为 char
```

### 1.1.9 编写一段代码，将一个正整数 N 用二进制表示并转换为一个 String 类型的值 s。
```java
// Java 有一个内置方法 Integer.toBinaryString(N) 专门完成这个任务，但该题的目的就是给出这个方法的其他实现方法。
// 下面就是一个特别简洁的答案:
String s = "";
for (int n = N; n > 0; n /= 2)
    s = (n % 2) + s;
```

```java
public static void exercises09(int N) {
    String s = "";
    // int 二进制位数：32
    for (int n = 31; n >= 0; n--) {
        s += (N >>> n & 1);
    }
    System.out.println(s);
}
```

### 1.1.10 下面这段代码有什么问题?
```java
int[] a;
for (int i = 0; i < 10; i++)
a[i] = i * i;
// 它没有用 new 为 a[] 分配内存，这段代码会产生一个 variable a might not have been initialized 的编译错误。

int b[] = new int[10];
// 数组需要通过 new来初始化，分配内存
```

### 1.1.11 编写一段代码，打印出一个二维布尔数组的内容。其中，使用 `*` 表示真，空格表示假。打印出行号和列号。
```java
public static void exercises11() {
    boolean[][] a = new boolean[2][2];
    a[0][0] = true;
    a[0][1] = false;
    a[1][0] = false;
    a[1][1] = true;
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.println(a[i][j] ? '*' : ' ');
        }
    }
}
```

### 1.1.12 以下代码段会打印出什么结果?
```java
int[] a = new int[10];
for (int i = 0; i < 10; i++)
    a[i] = 9 - i;
for (int i = 0; i < 10; i++)
    a[i] = a[a[i]];
for (int i = 0; i < 10; i++)
    System.out.println(i);
0
1
2
3
4
5
6
7
8
9
```

### 1.1.13 编写一段代码，打印出一个 M 行 N 列的二维数组的转置(交换行和列)。
```java
public static void exercises13(boolean[][] a) {
    int m = a.length;
    int n = a[1].length;
    boolean[][] b = new boolean[n][m];
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            b[j][i] = a[i][j];
            System.out.println(b[j][i]);
        }
    }
}
```

### 1.1.14 编写一个静态方法 lg()，接受一个整型参数 N，返回不大于 log2N （以2为底N的对数）的最大整数。不要使用 Math 库。
```java
public static int lg(int N) {
    // System.out.println((int) (Math.log(N) / Math.log(2)));
    int result = 0;
    while (N > 1) {
        result++;
        N /= 2;
    }
    return result;
}
```

### 1.1.15 编写一个静态方法 histogram()，接受一个整型数组 a[] 和一个整数 M 为参数并返回一个大小为 M 的数组，其中第 i 个元素的值为整数 i 在参数数组中出现的次数。如果 a[] 中的值均在 0 到 M-1之间，返回数组中所有元素之和应该和 a.length 相等。
```java
public static int[] histogram(int[] a, int M) {
    int[] b = new int[M];
    int N = a.length;
    for (int i = 0; i < N; i++) {
        if (a[i] < M) {
            b[a[i]]++;
        }
    }
    return b;
}
```

### 1.1.16 给出 exR1(6) 的返回值:
```java
public static String exR1(int n)
{
   if (n <= 0) return "";
   return exR1(n-3) + n + exR1(n-2) + n;
}

// 递归
"311361142246"
```

### 1.1.17 找出以下递归函数的问题:
```java
public static String exR2(int n) {
    String s = exR2(n - 3) + n + exR2(n - 2) + n;
    if (n <= 0)
        return "";
    return s;
}
// 这段代码中的基础情况永远不会被访问。调用 exR2(3) 会产生调用 exR2(0)、exR2(-3) 和exR2(-6)，循环往复直到发生 StackOverflowError。

// 限制条件在执行代码的下面，不会被触发
```

### 1.1.18 请看以下递归函数:
```java
public static int mystery(int a, int b) {
   if (b == 0)     return 0;
   if (b % 2 == 0) return mystery(a+a, b/2);
   return mystery(a+a, b/2) + a;
}
```
mystery(2, 25) 和 mystery(3, 11) 的返回值是多少?给定正整数 a 和 b，mystery(a,b)计算的结果是什么?将代码中的 + 替换为 * 并将 return 0 改为 return 1，然后回答相同的问题。
```java
mystery(2, 25) // 50
mystery(3, 11) // 33
// 替换为 *之后：
mystery(2, 25) // 33554432
mystery(3, 11) // 177147
```

### 1.1.19 在计算机上运行以下程序:
```java
public class Fibonacci {
    public static long F(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return F(N - 1) + F(N - 2);
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));
    }
}
```
计算机用这段程序在一个小时之内能够得到 F(N) 结果的最大 N 值是多少?开发 F(N) 的一个更好的实现，用数组保存已经计算过的值。
```java
// 递归求菲波那切数列的值，越往后计算，运行越慢
// 使用数组去缓存已计算过的值
public class Fibonacci {
    public static long F(int N) {
		long[] arr = new long[N + 1];
		return F(N, arr);
	}

	public static long F(int N, long[] arr) {
		if (arr[N] == 0) {
			if (N == 1) {
				arr[N] = 1;
			} else if (N > 1) {
				arr[N] = F(N - 1, arr) + F(N - 2, arr);
			}
		}
		return arr[N];
	}

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));
    }
}
```