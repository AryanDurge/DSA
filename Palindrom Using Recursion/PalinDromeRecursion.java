public class PalinDromeRecursion{
    public Boolean isPalinDrome(char ch[],int s,int e){
        if(s == e || s > e){
            return true;
        }
        if(ch[s] == ch[e]){
            Boolean temp = isPalinDrome(ch,s+1,e-1);
            return temp;
        } else {
            return false;
        }
    

    public static void main(String args[]){
        PalinDromeRecursion obj = new PalinDromeRecursion();
        char[] ch = {'a','b','a'};
        Boolean res = obj.isPalinDrome(ch,0,2);
        System.out.println(res);
    }
}