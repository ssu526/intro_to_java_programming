
/**20.14 (Postfix notation) Postfix notation is a way of writing expressions without
using parentheses. For example, the expression (1 + 2) * 3 would be
written as 1 2 + 3 *. A postfix expression is evaluated using a stack. Scan a
postfix expression from left to right. A variable or constant is pushed into the
stack. When an operator is encountered, apply the operator with the top two
operands in the stack and replace the two operands with the result. The following
diagram shows how to evaluate 1 2 + 3 *.

Write a program to evaluate postfix expressions. Pass the expression as a
command-line argument in one string.
*/
import java.util.*;

public class PostfixNotation{
	public static void main(String[] args){
		try{
			System.out.println(evaluate(args[0]));
		}catch(Exception ex){
			System.out.println("Invalid expression");
		}
	}

	public static double evaluate(String expression){
		String[] stringArray = expression.split(" ");
		ArrayList<String> tokens = new ArrayList<>(Arrays.asList(stringArray));
		System.out.println(tokens);
		Stack<Integer> operands = new Stack<>();

		for(String t: tokens){
			if(t.trim().charAt(0)=='+'){
				int num1 = operands.pop();
				int num2 = operands.pop();
				operands.push(num1+num2);
			}else if (t.trim().charAt(0)=='-'){
				int num2 = operands.pop();
				int num1 = operands.pop();
				operands.push(num1-num2);
			}else if(t.trim().charAt(0)=='*'){
				int num2 = operands.pop();
				int num1 = operands.pop();
				operands.push(num1*num2);
			}else if(t.trim().charAt(0)=='/'){
				int num2 = operands.pop();
				int num1 = operands.pop();
				operands.push(num1/num2);
			}else{
				operands.push(Integer.parseInt(t.trim()));
			}
		}

		return operands.pop();
	}


}