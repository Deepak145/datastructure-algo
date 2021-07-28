package com.misc;

import com.stack.MyStack;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BracketValidation {
    static Map<Character, Character> bodmas = new HashMap<>();
    public static void main(String[] args) {
        bodmas.put('[', ']');
        bodmas.put('{', '}');
        bodmas.put('(', ')');
        System.out.println(""+validate("[{()}]")); // true
        System.out.println(""+validate("[{(})]")); // false
        System.out.println(""+validate("")); // true
        System.out.println(""+validate("[{()]}")); // false
        System.out.println(""+validate("[{(])}")); // false
        System.out.println(""+validate("[{({[()]})}]")); // true
    }

    public static boolean validate(String expression){
        MyStack<Character> stack = new MyStack<>();
        boolean check = false;
        if(expression.equals("")) return true;
        char [] exp = expression.toCharArray();
        for(int i=0; i<exp.length; i++){
            if(bodmas.containsKey(exp[i])){
                stack.push(exp[i]);
            }
            if(bodmas.containsValue(exp[i])){
                Character ch = stack.pop();
                Character key = ' ';
                for(Map.Entry<Character, Character> map : bodmas.entrySet()){
                    if(Character.compare(map.getValue(), exp[i]) ==0){
                        key = map.getKey();
                    }
                }
                if(Character.compare(key,ch) == 0) {
                    check = true;
                    continue;
                }
                else {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}
