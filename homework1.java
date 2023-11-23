package second_week;

public class homework1 {
    public static void main(String[] args) {


        for(int i=0;i<10;i++){
            System.out.print("*");
            if(i==0||i==9){
                for(int k=0;k<18;k++){
                    System.out.print("*");
                }
            }
            else{
                for(int k=0;k<18;k++){
                    System.out.print("+");
                }
            }
            System.out.println("*");
        }
    }
}
