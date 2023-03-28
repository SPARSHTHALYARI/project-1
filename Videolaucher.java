import java.util.Scanner;

public class Videolaucher {
    
    public static class Video {
        private String Videoname,Rating;

        public void setVideoname(Scanner sc){
            System.out.println("Enter the name of the video: ");
            Videoname = sc.nextLine();
        }
        
        public String getVideoname(){
            return Videoname;
        }
        public void Getvideoname(){
            System.out.println("Here is the Name Of the Movies in Your Collection");
            System.out.println(Videoname);
        }
        public void Returnvideo(Scanner sc){
            System.out.println("Enter the Video Or Tape You Want To Return");
            String videoentered;
            
            videoentered= sc.nextLine();

            if(videoentered==Videoname){
                System.out.println("Your Video Exsist It Will Be Returned");
            }
            else{
                System.out.println("Sorry We did Not Have The Video You have Requested");
                System.out.println("We Have These Collection only");
                System.out.println(Videoname);
                System.out.println("Enter From The Above Video Collection");
            }

        }
        public void Rating(Scanner sc){
            System.out.println("Enter The Video You want to Rate");
            String Rate;
            Rate= sc.nextLine();
            if(Rate==Videoname){

               System.out.println("Enter Your Rating Out of 10");
                Rating=sc.nextLine();
                System.out.println("Thank You For Rating You Have Rated"+Videoname+Rating+"Out Of 10");

            }
            else{
                System.out.println("Sorry The Video Does Not Exist In Database");
            }

        }

    public void Inventory(){

        System.out.println("here Is the List OF Your Inventory");
        
        System.out.println(Videoname);
    }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Video obj2 = new Video();

        boolean run = true;
        while(run){
            // menu driven program 
            System.out.println("\n\n\n");
            System.out.println("Welcome To Main Menu");
            System.out.println("=====================");
            System.out.println("Enter 1 to Add Video to the collection");
            System.out.println("Enter 2 to CheckOut a Video");
            System.out.println("Enter 3 to Return a Video");
            System.out.println("Enter 4 to give a Rating to A Video");
            System.out.println("Enter 5 to List The Inventory");
            System.out.println("Enter 6 to Exit");

            System.out.println("Enter your Choice Here");

            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline character

            switch(choice){
                case 1:
                    obj2.setVideoname(sc);
                    System.out.println("Video Name Entered Successfully: " + obj2.getVideoname());
                    break;
                case 2:
                    obj2.Getvideoname();
                    break;
                case 3:
                    obj2.Returnvideo(sc);
                    break;
                case 4:
                    obj2.Rating(sc);
                    break;
                case 5:
                obj2.Inventory();
                    break;
                case 6:
                    run = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Error! Incorrect choice.");
            }
        }
    }
}