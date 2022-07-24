public class ApplicationStackBasedLL {
    public static void main(String [] args){

        //MyStack<Integer> s = new LinkedStack<>();
        MyStack<Integer> s = new ArrayBasedStack<>(3);

        s.push(55);
        s.push(33);
        s.push(37);
        s.push(11);


        while(!s.isEmpty())
            System.out.println(s.pop());

        String exp="        (6 * 9/ (5 - 9 ) ) + (12-5/(6+1))";
        System.out.println("Exp:"+exp+" is balanced?"+isBalanced(exp));

    }

    private static boolean isBalanced(String exp) {
        MyStack<Character> s=new LinkedStack<Character>();
        int i=0;
        while(i<exp.length()){
            char symb=exp.charAt(i);
            if(symb=='(')
                s.push(symb);
            else if (symb ==')'){
                if(s.isEmpty())
                    return false;
                s.pop();
            }
            i++;
        }
        if(s.isEmpty())
            return true;
        return false;
    }
    }

