package arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
class Bracket {
    Bracket(int type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    int type;
    int position;
}



class check_brackets {
	public static int get_num(char c) {
		if(c=='{')
			return 1;
		else if(c=='[')
			return 2;
		else if(c=='(')
			return 3;
		else if(c=='}')
			return -1;
		else if(c==']')
			return -2;
		else if(c==')')
			return -3;
		else
			return 0;
		
	}
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
        Stack<Bracket> stack = new Stack<Bracket>();
       
        int flag=0;
        for (int position = 0; position < text.length(); position++) {
            char next = text.charAt(position);
            int n=get_num(next);
            if(n==0)
            	continue;
            else if(n>0) {
            	Bracket ob=new Bracket(n,position+1);
            	stack.push(ob);
            }
            else if(!stack.isEmpty()) {
            	Bracket g=stack.peek();
            	if(n+(g.type)==0) {
            		stack.pop();            		
            	}            		
            	else
            	{
            		System.out.print(position+1);
            		flag=-1;
            		break;
            	}            	
            }
            else {
            	System.out.print(position+1);
        		flag=-1;
        		break;
            }
            	
        }
        if(stack.isEmpty() && flag!=-1)
        	System.out.print("Success");
        else if(flag!=-1){
        	Bracket k=null;
        	while (!stack.isEmpty()) {
        		k=stack.pop();
        	}
        	System.out.print(k.position);
        }
        	

    }
}
