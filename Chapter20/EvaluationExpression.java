/* Evaluation mathematical expression */

// (15 + 2) * 34 – 2

import java.util.*;

public class EvaluationExpression{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Enter 1 expression.");
			System.exit(1);
		}

			System.out.println(evaluate(args[0]));
	
	}


	public static double evaluate(String expression){

		expression=separation(expression);
		String[] tokens = expression.split(" ");
		
		Stack<Integer> operandStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();

		for(String token: tokens){
			if(token.length()==0){
				continue;
			}else if(token.charAt(0)=='+' || token.charAt(0)=='-'){
				while(!operatorStack.isEmpty() && 
					(operatorStack.peek()=='+' 
					|| operatorStack.peek()=='-' 
					|| operatorStack.peek()=='*' 
					|| operatorStack.peek()=='/')){

					processAOperator(operandStack, operatorStack);
				}
				operatorStack.push(token.charAt(0));
			}else if(token.charAt(0)=='*'  || token.charAt(0)=='/' ){                     
				while(!operatorStack.isEmpty() && (operatorStack.peek()=='/' || operatorStack.peek()=='*')){
					processAOperator(operandStack,operatorStack);
				}
				operatorStack.push(token.charAt(0));
			}else if(token.charAt(0)=='('){
				operatorStack.push(token.charAt(0));
			}else if(token.charAt(0)==')'){
				while(operatorStack.peek()!='('){
					processAOperator(operandStack,operatorStack);
				}
				operatorStack.pop();
			}else{
				operandStack.push(Integer.parseInt(token));
			}
		}

		while(!operatorStack.empty()){
			processAOperator(operandStack,operatorStack);
		}

		
		return operandStack.pop();
	}


	public static void processAOperator(Stack<Integer> operandStack, Stack<Character> operatorStack){
		char op = operatorStack.pop();
		Integer operand2 = operandStack.pop();
		Integer operand1 = operandStack.pop();

		if(op=='+'){
			operandStack.push(operand1+operand2);
		}else if(op=='-'){
			operandStack.push(operand1-operand2);
		}else if(op=='*'){
			operandStack.push(operand1*operand2);
		}else{
			operandStack.push(operand1/operand2);
		}
	}

	public static String separation(String s){
		String newString="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='(' || s.charAt(i)==')'){
				newString=newString+" "+s.charAt(i)+" ";
			}else{
				newString=newString+s.charAt(i);
			}
		}

		return newString;
	}
}



