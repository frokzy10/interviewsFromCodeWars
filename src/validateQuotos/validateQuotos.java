package validateQuotos;

import java.util.Stack;

public class validateQuotos {
    public static void main(String[] args) {
        String res = "())";
        System.out.println(validate(res));
    }
    private static boolean validate(String output){
        Stack<Character> stack = new Stack<>();

        for(char c : output.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}

// ()(()()