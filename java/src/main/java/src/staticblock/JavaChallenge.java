package src.staticblock;

public class JavaChallenge {
    
public static void main(String[] args)
{

    char[] a ={'a','b',1,1,1,1,1,1};
    System.out.println(check(a));
}    
        public static boolean check(char[] password) {
    
            // Enter your code here
    
            if(password.length<8){
                return false;
            }
    
            int charSize =0;
            int intSize =0;
    
            for(int i =0; i<password.length; i++){
    
    if(isChar(password[i])){
    
        charSize+=1;
    }
    else{
        intSize+=1;
    }
    
    
            }
        
    
    if(charSize>2 && intSize>2){
        return true;
    }
            /* You do not need to worry about the return statement for the 
            moment, write your code and replace it with your return statement.*/
            return false; 
        }
    
        public static boolean isChar(char c){
    
    
            return (c>='a') || (c<='z') ||  (c>='A') || (c<='Z');
        }
    }

