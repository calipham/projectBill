import java.util.Scanner;
public class projectBill
{
    public static void main(String [] args)
    {
        int numRed, numBlue, enterMem, counter = 1;// loop initialization
        while ( counter <=1 ){ //loop continuing condition
            System.out.println( " Counter value = " + counter ); //loop continuing condition
            Scanner sc=new Scanner(System.in);
            String gender, firstName, lastName, adress, yourAnswer;
            System.out.print( " Enter your first name: ");
            firstName = sc.nextLine();
            System.out.print( " Enter your last name: ");
            lastName = sc.nextLine();
            System.out.print(" Enter your gender: ");
            gender = sc.nextLine();

            System.out.print(" Enter your adress: ");
            adress = sc.nextLine();
            System.out.println (" Do you have membership card? ");
            System.out.println(" Choose yes or no " );
            System.out.print( " Your answer is: ");
            yourAnswer = sc.nextLine();
            if ( "yes".equals(yourAnswer)){
                System.out.print( " Enter series number of Membership card = ");
                enterMem = sc.nextInt();
                if (( enterMem < 99999 )|| ( enterMem > 999999)){
                    System.out.println( " Invalid number !! Please try again with six degits ! " );
                    System.out.print( " Enter series number of Membership card = ");
                    enterMem = sc.nextInt();
                }
                else if ((enterMem > 99999) && ( enterMem <=999999 )) { // input 2 time will be wrong to right

                    System.out.println( " Thank you, " + lastName + " " + firstName + ", you will get more 5% discount! ");
                }

                else if ("no".equals(yourAnswer)){ // No display line below
                    System.out.println( " Thank you, " + lastName + " " + firstName + ". Try it for more promotions! " );
                }
            }

            System.out.print( " Enter number of red plate = ");
            numRed = sc.nextInt();  
            System.out.print( " Enter number of blue   plate = ");
            numBlue = sc.nextInt();

            double redCost=4.50, blueCost=3, totalCost, totalPrice;
            if ("male".equals(gender)){
                System.out.println( " Dear Mr. " + lastName + " " + firstName+ " !! ");}
            else if ("female".equals(gender)){
                System.out.println("Dear Madam." + lastName + " " + firstName+ " !! ");}

            totalPrice = (redCost * numRed ) + ( blueCost * numBlue);
            System.out.println( " Your total price = $" + totalPrice );

            if ( totalPrice >= 80 )  {
                //System.out.println( " Please pay $ " + String.format("%.2f",  totalPrice - (totalPrice * 12/100)) + " , 12% discount applied. Thank you, " + lastName + " " + firstName );
                if ( "yes".equals(yourAnswer))
                    System.out.println( " Please pay $ " + String.format("%.2f",  totalPrice - (totalPrice * 17/100)) + " , 12% discount + 5% membership discount applied. Thank you, " + lastName + " " + firstName + " !! ");
                else if ("no".equals(yourAnswer))
                    System.out.println ( " Please pay $ " + String.format("%.2f", totalPrice - (totalPrice *12/100)) + " , 12% discount applied. Thank you, " + lastName + " " + firstName+ " !! ");
            }
            else if (( totalPrice >=40 ) && ( totalPrice < 80 )) {
                if ( "yes".equals(yourAnswer))
                    System.out.println( " Please pay $ " + String.format("%.2f",  totalPrice - (totalPrice * 12/100)) + " , 7% discount + 5% membership discount applied. Thank you, " + lastName + " " + firstName + " !! ");
                else if ("no".equals(yourAnswer))
                    System.out.println ( " Please pay $ " + String.format("%.2f", totalPrice - (totalPrice *7/100)) + " , 7% discount applied. Thank you, " + lastName + " " + firstName+ " !! ");

            }
            else if (totalPrice < 40 ){
                if ( "yes".equals(yourAnswer))
                    System.out.println( " Please pay $ " + String.format("%.2f",  totalPrice - (totalPrice * 5/100)) + " , 5% membership discount applied. Thank you, " + lastName + " " + firstName + " !! ");
                else if ("no".equals(yourAnswer))
                    System.out.println ( " Please pay $ " + totalPrice + " , no discount applied. Thank you, " + lastName + " " + firstName + " !! ");
            }
            counter++; //loop increment step
            System.out.println( " Next Customer, Please ! ");
        }
    }
}

        