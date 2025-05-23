package sample;

public class calc {
    public static void main(String[] args) {
        var num1 = 22;
        var num2 = 11;

        // 足し算
        var result1 = num1 + num2;
        System.out.println("num1 + num2 = " + result1);

        // 引き算
        var result2 = num1 - num2;
        System.out.println("num1 - num2 = " + result2);

        // 掛け算
        var result3 = num1 * num2;
        System.out.println("num1 * num2 = " + result3);

        // 割り算
        var result4 = num1 / num2;
        System.out.println("num1 / num2 = " + result4);

        // 剰余
        var result5 = num1 % num2;
        System.out.println("num1 % num2 = " + result5);
        
        // 文字列の連結
        System.out.println("num1 + num2 = " + result1);
    }
}