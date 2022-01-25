package com.javarush.task.task06.task0616;

/*
Минимальное число статиков
*/

public class Solution {
    public static int step;

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        new Solution().method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
        if (step > 1) {
            return;
        }
        main(null);
    }
}

/*
Расставь минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась.
 */


/*
public class Solution {
    public int step;

    public static void main(String[] args) {
        method1();
    }

    public void method1() {
        method2();
    }

    public void method2() {
        new Solution().method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
        if (step > 1) {
            return;
        }
        main(null);
    }
}
 */


/*
java.base/java.lang.Thread.getStackTrace(Thread.java:1606)
com.javarush.task.task06.task0616.Solution.method4(Person.java:28)
com.javarush.task.task06.task0616.Solution.method3(Person.java:23)
com.javarush.task.task06.task0616.Solution.method2(Person.java:19)
com.javarush.task.task06.task0616.Solution.method1(Person.java:15)
com.javarush.task.task06.task0616.Solution.main(Person.java:11)
java.base/java.lang.Thread.getStackTrace(Thread.java:1606)
com.javarush.task.task06.task0616.Solution.method4(Person.java:28)
com.javarush.task.task06.task0616.Solution.method3(Person.java:23)
com.javarush.task.task06.task0616.Solution.method2(Person.java:19)
com.javarush.task.task06.task0616.Solution.method1(Person.java:15)
com.javarush.task.task06.task0616.Solution.main(Person.java:11)
com.javarush.task.task06.task0616.Solution.method4(Person.java:34)
com.javarush.task.task06.task0616.Solution.method3(Person.java:23)
com.javarush.task.task06.task0616.Solution.method2(Person.java:19)
com.javarush.task.task06.task0616.Solution.method1(Person.java:15)
com.javarush.task.task06.task0616.Solution.main(Person.java:11)

Process finished with exit code 0
 */










