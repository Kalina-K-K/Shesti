package collections;

import java.util.Scanner;
import java.util.Stack;

public class Zad5_8_PostfixExpressions {

	static int evaluatePostfix(String exp)
    {
        //create a stack
        Stack<Integer> stack=new Stack<>();
          
        // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
              
            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(c>='0'&&c<='9')
            stack.push(c-'0');
              
            //  If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                  
                switch(c)
                {
                    case '+':
                    stack.push(val2+val1);
                    break;
                      
                    case '-':
                    stack.push(val2- val1);
                    break;
                      
                    case '/':
                    stack.push(val2/val1);
                    break;
                      
                    case '*':
                    stack.push(val2*val1);
                    break;
              }
            }
        }
        return stack.pop();    
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="231*+9-";
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression:");
        String expression = sc.nextLine();
        
        try {
       	 System.out.println(evaluatePostfix(expression));
        }catch(Exception ex) {
       	 System.out.println("Wrong expression");
        }
   	}

}
