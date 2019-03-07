package Selenium;

import java.util.ArrayList;
import java.util.List;

public class KidCircle {

    public static List<Integer> getEliminatedOrder(int N,int K){
        List<Integer> kidIn = new ArrayList<Integer>();
        List<Integer> kidOrdered = new ArrayList<Integer>();
        if(N<=0) return   kidOrdered;
        else {
            int i;
            for (i=1; i <= N; i++){
                kidIn.add(new Integer(i));
            }
            if(K<=0) return kidIn;
            i = K - 1;
            while (!(kidIn.isEmpty()))
            {
                kidOrdered.add(kidIn.remove(i%N));
                N = N - 1;
                if (N > 0) {
                    i = (i + K - 1) % N;
                }
            }
        }
        return kidOrdered;
    }
    public static int lastKidEliminated(int n, int k)
    {
        if (n <= 1) return 1;
        else return (lastKidEliminated(n - 1, k) + k-1) % n + 1;
    }
    public static void main(String[] arg) {
        System.out.println("Golie ==> The order  eliminated is with complexity O(n): ");
        //Change the value of k,N and check the last child to be eliminated. The worst case scenario will be where the values are 0,0 for both n,k etc
        System.out.println(KidCircle.lastKidEliminated(6,1));
        System.out.println(KidCircle.getEliminatedOrder(6, 0));
        System.out.println(KidCircle.lastKidEliminated(6,0));
        System.out.println(KidCircle.getEliminatedOrder(7, 10));
        System.out.println(KidCircle.lastKidEliminated(7,10));
        System.out.println(KidCircle.getEliminatedOrder(4, 4));
        System.out.println(KidCircle.lastKidEliminated(4,4));
        System.out.println(KidCircle.getEliminatedOrder(9, 9));
        System.out.println(KidCircle.lastKidEliminated(9,9));
        System.out.println(KidCircle.getEliminatedOrder(5, 2));
        System.out.println(KidCircle.lastKidEliminated(5,2));
        System.out.println(KidCircle.getEliminatedOrder(5, 1));
        System.out.println(KidCircle.lastKidEliminated(5,1));
        System.out.println(KidCircle.getEliminatedOrder(12, 4));
        System.out.println(KidCircle.lastKidEliminated(12,4));
    }

}
