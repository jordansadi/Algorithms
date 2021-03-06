package fiboWord;

public class Main {
    static String n1 = "0", n2 = "01", n3 = "";

    public static void main(String[] args) {
        int count=6;
        System.out.print(n1 + " " + n2);
        printFibo(count-2);
    }

    static void printFibo(int count){
        if(count>0){ // base criterion; once count reaches zero, the function stops calling itself
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibo(count-1); // progressive change; program stops after the 6th number in the sequence
        }
    }
}