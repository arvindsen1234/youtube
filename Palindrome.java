public class Palindrome {
    public static boolean isPlindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[]){
        String str = "abbd";
        int cout = 0;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                 if(isPlindrome(str.substring(i,j))==true){
  System.out.println(str.substring(i,j)+" ");
  cout++;
                 }  
            }
        }
        System.out.println("palindrome is = " + cout);
    }
    
}
