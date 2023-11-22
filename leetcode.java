public class leetcode {
    public static boolean printpalin(int x){ 
    int reve = 0;
    int tem = x;
    while (tem!=0) {
        int digit = tem%10;
        reve = reve *10 + digit;
        tem/=10;
        
    }
    if(reve==x){
        return true;
    }
    return false;
}
    public static void main(String[] args) {
    int x=121; 
  System.out.println(printpalin(x));
    }
    
}
