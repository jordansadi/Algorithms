package fibonacci;

public class Main {
    static int n1=0,n2=1,n3=0;

    public static void main(String[] args) {
        int count=20;
        System.out.print(n1+" "+n2);
        printFibo(count-2);
    }
    static void printFibo(int count){
        if(count>0){ // base criterion; once count reaches zero, the function stops calling itself
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibo(count-1); // progressive change; program stops after the 20th number in the sequence
        }
    }

}
