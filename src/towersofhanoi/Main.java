package towersofhanoi;

public class Main {

    public static void main(String args[]) {
        int n = 4; // base criterion; function runs until it is run with n = 1
        towerOfHanoi(n, 'A', 'C', 'B');
    }
    static void towerOfHanoi(int n, char from_rod,
                             char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " +
                    from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +
                from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod); /* progressive change; since the recursions are run with n - 1,
        this second recursion will eventually be run with n = 1 and the function will end */
    }

}
