package Stack.InfixToPostfix;

import java.util.Stack;

public class Main {

    static int prec(char c){

        /*if(c == '+' || c == '-') return 1;
        else if(c == '*' || c == '/') return 2;
        else if(c == '^') return 3;*/

        return switch (c) {
          case  '+', '-' -> 1;
          case '*', '/' -> 2;
          case '^' -> 3;
          default -> -1;
        };


    }

    static String infixToPostfix(String s){
        Stack<Character> stk = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                res.append(c);
            }else if (c == '('){
                stk.push(c);
            } else if (c == ')') {
                while(!stk.empty() && stk.peek() != '('){
                    res.append(stk.peek());
                    stk.pop();
                }

                if(!stk.empty()) stk.pop();
            }else{
                while (!stk.empty() && prec(c) <= prec(stk.peek())){
                    res.append(stk.peek());
                    stk.pop();
                }

                stk.push(c);
            }
        }

        while(!stk.empty()){
            if(stk.peek() == '(') return "Invalid expression.";
            res.append(stk.peek());
            stk.pop();
        }

        return res.toString();
    }
    public static void main(String[] args) {
//a+b*(c^d-e)^(f+g*h)-i
        //K+L-M*N+(O+P)*W/U/V*T+Q
        String infix = "K+L-M*N+(O+P)*W/U/V*T+Q";
        System.out.println(infixToPostfix(infix));

    }
}