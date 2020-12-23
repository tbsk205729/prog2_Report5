
public class Main {
    public static void main (String[] args){
        String str = null; 
        
        try{
            System.out.println(str.length());

        }catch(NullPointerException e){
            System.out.println("例外　NullPointerExceptionが発生しました");
            System.out.println(e.getMessage());

        }
    }
    
}
