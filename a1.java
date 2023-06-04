public class a1{
    public static void  hello_safe(int x,int y){
        // outer loop 
        for(int i=1;i<=x;i++){
            // inner loop 
            for( int j= 1; j<=y;j++){
                if (i==1 ||i==x||j==1||j==y){
                    System.out.print("*");
                } else{
                        System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
    
 public static void main (String agrs[]){
  hello_safe(10,12);
 }
}