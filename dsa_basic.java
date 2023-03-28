//array Input And Printing 
import java.net.SocketAddress;
import java.util.Scanner;


public class dsa_basic {




    public static void input(int size){
        Scanner sc =new Scanner(System.in);

        int[] arr;
  
    arr = new int[50];

        for(int i=0;i<size;i++){

            arr[i]=sc.nextInt();  

        }

        System.out.println("here is the array That you have Entered\n");

        for(int i=0;i<size;i++){

            System.out.println(arr[i]+"\n");
        }



    }



    

    public static void main(String[] args) {

        System.out.println("EnTER THE SIze of The Array\n");

        Scanner sc = new Scanner(System.in);;

        int size;;
        size=sc.nextInt();
        input(size);
        



    }


    
}
