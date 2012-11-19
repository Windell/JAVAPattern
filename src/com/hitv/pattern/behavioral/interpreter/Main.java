package com.hitv.pattern.behavioral.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		String inputed=null;
		TerminationExpression terminationExpression=new TerminationExpression();
		NonTerminationExpression nonTerminationExpression=new NonTerminationExpression();
		while(true){
			System.out.println("input your words, q or Q for quit");
			try {
				inputed=new BufferedReader(new InputStreamReader(System.in)).readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(inputed==null||inputed.isEmpty()){
				continue;
			}
			if(inputed.equalsIgnoreCase("q")){
				terminationExpression.interprete(inputed);
			}else{
				nonTerminationExpression.interprete(inputed);
			}
		}
	}
}
