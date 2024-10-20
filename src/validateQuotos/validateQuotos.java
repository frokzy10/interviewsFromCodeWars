package validateQuotos;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validateQuotos {
    public static void main(String[] args) {
        String res = "[{()}]";
        System.out.println(validate(res));
    }
    private static boolean validate(String output){
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> para = new HashMap<>();
        para.put(')','(');
        para.put('}','{');
        para.put(']','[');

        for(char c : output.toCharArray()){
            if(para.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != para.get(c)) {
                    return false;
                }
            }else if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                return false;
            }
            System.out.println(c);
        }

        return stack.isEmpty();
    }
}