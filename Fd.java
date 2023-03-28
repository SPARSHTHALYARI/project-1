
import java.util.Scanner;

public class Fd {

      class FD_acount {

        float Interest_FD,Amount;
        int days,age;
        public void Interestcalulator(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 if you are  a Senior Citizen\n");
            System.out.println("Enter 2 If you are less than  60 Year");   
            float Amount;
            int months; 
            int age2;
            age2= sc.nextInt();
            switch(age2){
                case 1:{
                    System.out.println("Enter the Amount You Want To Invest\n                                                                                                                                               ");
                    Amount=sc.nextFloat();

                    System.out.println("Enter the Number of Days you want to invest \n");
                    months= sc.nextInt();

                    if(months<14){
                        double money=1.08*Amount;
                        System.out.println("Here is the Amount After 14 Days\n"+money);
                    }else if(months<=29 && months>14){
                        double money2=1.0825*Amount;
                        System.out.println("Here is the Amount After 29 Days\n "+money2);
                    }else if (months<=45 && months>29){
                        double money3 = Amount*1.0850;
                        System.out.println("here is the Amount After  45 Days\n"+money3);
                    }
                    else if(months<=60 && months>45){
                        double money4= Amount*1.0875;
                        System.out.println("here is the Amount After  60 Days\n"+money4);
                    }else if(months<=184 && months>60){
                        double money5= Amount*1.09;
                        System.out.println("here is the Amount After  184 Days\n"+money5);
                    }
                    else{
                        System.out.println("If You Want To Invest For More Than 184 Days Kindly Meet Our Advisor\n");

                    }    
                    break;   
                     
                    }
                    

                
                case 2:{
                    System.out.println("enter the Amount You Want to invest\n");

            Amount = sc.nextFloat();

            System.out.println("Enter The Number of Days  You Want to Invest\n");

            months= sc.nextInt();
            if(months<14){
            double money=1.075*Amount;
            System.out.println("Here is the Amount After 14 Days\n"+money);
        }   else if(months<=30 && months>14){
            double money2=1.0775*Amount;
            System.out.println("Here is the Amount After 30 Days\n "+money2);
        }else if (months<=45 && months>30){
            double money3 = Amount*1.08;
            System.out.println("here is the Amount After 45 Days\n"+money3);
        }
        else if(months<=60 && months>45){
            double money4= Amount*1.0825;
            System.out.println("here is the Amount After  60 Days\n"+money4);
        }else if(months<=184 && months>60){
            double money5= Amount*1.085;
            System.out.println("here is the Amount After  184 Days"+money5);
            

        }
        else{
            System.out.println("If You Want To Invest For More Than 184 Days Kindly Meet Our Advisor\n");

        }
        break;
                }
            }
        }
    }
     class Account{

        Scanner sc = new Scanner(System.in);

        public String Name,Pan;
        int age;
         
        public void Details(){

            System.out.println("Kindly Enter Your Detail Below\n\n\n");

            System.out.println("Enter Your Name Here\n ");
            Name= sc.nextLine();
            System.out.println("Enter Your Age\n");
            age= sc.nextInt();
            System.out.println("Enter Your Pan Number Here \n");
            Pan=sc.nextLine();

            System.out.println("Thank You For Entering The Detail Your Details Have Now Been Stored");          

        }

    }
     class Sb {

        public void Calculator(){
            Scanner sc = new Scanner(System.in);
            float Amount;
            int Days;

            System.out.println("Enter the Amount you Want To Interest\n");

            Amount = sc.nextFloat();
            System.out.println("Enter The Number of Days You Want To Invest\n");
            Days= sc.nextInt();
            
            if(Days>7 && Days<14){
                double Return= Amount*1.065;
                System.out.println("Here  is The Amount After 14 Days\n"+ Return);
            }

            else if(Days>30 && Days<14){
                double Return2= Amount*1.0675;
                System.out.println("Here is The Amount After 30 Days\n"+ Return2);

            }
            else{
                System.out.println(" You can only invest for Maximum of 30 days , and Minimum of 14 Days");
            }
            sc.close();
        }
    }

    class RD_acount {
        private static final String FD_acount = null;
        Scanner sc = new Scanner(System.in);

        public void Interest_calculator_RD(){

            System.out.println("Enter 1 if you are  a Senior Citizen\n");
            System.out.println("Enter 2 If you are less than  60 Year");

            int age1;
            age1= sc.nextInt();

            switch(age1){
                case 1:{
                    double Amount;
                    int months;
                    System.out.println("Enter the Amount You Want To Invest");
                    Amount=sc.nextFloat();

                    System.out.println("Enter the Number of months you want to interest");
                    months= sc.nextInt();

                    if(months<6){
                        double money=1.08*Amount;
                        System.out.println("Here is the Amount After 6 Months\n"+money);
                    }else if(months<=9 && months>6){
                        double money2=1.0825*Amount;
                        System.out.println("Here is the Amount After 9 Months\n "+money2);
                    }else if (months<=12 && months>9){
                        double money3 = Amount*1.0850;
                        System.out.println("here is the Amount After 12 Months\n"+money3);
                    }
                    else if(months<=15 && months>12){
                        double money4= Amount*1.0875;
                        System.out.println("here is the Amount After 15 Months\n"+money4);
                    }else if(months<=18 && months>15){
                        double money5= Amount*1.09;
                        System.out.println("here is the Amount After 18 Months\n"+money5);
                    }
                    else{
                        System.out.println("If You Want To Invest For More Than 18 Months Kindly Meet Our Advisor\n");

                    }    
                    break;            
                    }

                
                case 2:{
                    float Amount;
                    System.out.println("enter the Amount You Want to invest\n");

            Amount = sc.nextFloat();
            int months;

            System.out.println("Enter The Number of Months  You Want to Invest\n");

            months= sc.nextInt();
            if(months<6){
            double money=1.075*Amount;
            System.out.println("Here is the Amount After 6 Months\n"+money);
        }   else if(months<=9 && months>6){
            double money2=1.0775*Amount;
            System.out.println("Here is the Amount After 9 Months\n "+money2);
        }else if (months<=12 && months>9){
            double money3 = Amount*1.08;
            System.out.println("here is the Amount After 12 Months\n"+money3);
        }
        else if(months<=15 && months>12){
            double money4= Amount*1.0825;
            System.out.println("here is the Amount After 15 Months\n"+money4);
        }else if(months<=18 && months>15){
            double money5= Amount*1.085;
            System.out.println("here is the Amount After 18 Months"+money5);
            

        }
        else{
            System.out.println("If You Want To Invest For More Than 18 Months Kindly Meet Our Advisor\n");

        }
        break;

                }
            }
            

        }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //main section is here

        //object Creation 

        FD_acount obj1 = new FD_acount();
        
        Sb obj2 = new Sb();

        RD_acount obj3 = new RD_acount();

        

        System.out.println("Welcome User\n\n");

        System.out.println("Kindly Enter your age\n");

        int a;

        a=sc.nextInt();

        if(a<=18){


            System.out.println("you are eligible to Invest kinldy Select One Platform to Invest\n");

            System.out.println("Enter 1 to Open A acount");
            System.out.println("Enter 2 to Invest in Fixed Deposit");
            System.out.println("Enter 3 to Invest in Reserve Deposit");
            System.out.println("Enter 4 to Invest in SB");
            System.out.println("Enter 5 to Exit");
            
            int input=sc.nextInt();

            

            switch(input){
                case 1:{
                    
                }
                case 2:{
                    obj1.Interestcalulator();
                    break;
                }
                case 3:{
                    obj3.Interest_calculator_RD();
                }
                case 4:{
                    obj2.Calculator();
                }
                case 5:{
                    System.exit(0);
                }



            }
        


        }
        else{

            System.out.println("Sorry You Are Not An Adult ");
        }
        sc.close();
    }
    }
}





