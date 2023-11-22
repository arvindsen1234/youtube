public class permutation {
    public static void permutaString(String str,String ans){
  if(str.length()==0){
    System.out.println(ans);
    return;
}
int cout = 0;
for(int i=0; i<str.length(); i++){
    char curr = str.charAt(i);
    String newstr = str.substring(0, i) + str.substring(i+1);
    permutaString(newstr, ans+curr);
    cout++;  
}
}
public static void main(String args[]){
    String str ="abc";
    permutaString(str, " ");
    }
    
}
