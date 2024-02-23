package org.example;

public class Factor {
    public int faktorial(int n){
        if (n <= 1){
            return 1;
        }
    return n * faktorial(n - 1);
    }
}
