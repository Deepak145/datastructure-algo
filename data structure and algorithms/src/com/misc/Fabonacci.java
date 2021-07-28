package com.misc;

import java.util.HashMap;
import java.util.Map;

public class Fabonacci {

    void Fabonacci() {}
    //fab =>  1 1 2 3 5 8 13 21
    //index =>1 2 3 4 5 6  7  8
    public static void main(String[] args) {
        System.out.println(dynamicFeb(7, new HashMap<>()));
    }

    public static int febOf(int n){
        if(n<=2) return 1;
        return  febOf(n-2) + febOf(n-1);
    }

    public static int dynamicFeb(int n , Map<Integer, Integer> memo){
        if(memo.containsKey(n)) return memo.get(n);
        if(n <= 2) return 1;
        memo.put(n, dynamicFeb(n-1, memo) + dynamicFeb(n-2, memo));
        System.out.println(memo);
        return memo.get(n);
    }
}
