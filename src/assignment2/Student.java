/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import com.sun.org.apache.xml.internal.dtm.ref.dom2dtm.DOM2DTMdefaultNamespaceDeclarationNode;
import java.beans.Introspector;
import java.util.Scanner;
import java.io.BufferedOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Student {
 public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public String firstname;
        public String lastname;
        public String peopleSoftID;
        public String Class_standing;
        public String emailID;
        public String addressLine;
        public String City;
        public String State;
        public String zipcode;
        public Student[] students;
        public int count;

    public Student() {
       
    }
        
   public Student(int no_of_records)
   {
       count = no_of_records;
       students = new Student[no_of_records];
   }

   
   
   

    public Student(String firstname, String lastname, String peopleSoftID, String Class_standing, 
            String emailID, String addressLine, String City, String State, String zipcode) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peopleSoftID = peopleSoftID;
        this.Class_standing = Class_standing;
        this.emailID = emailID;
        this.addressLine = addressLine;
        this.City = City;
        this.State = State;
        this.zipcode = zipcode;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPeopleSoftID() {
        return peopleSoftID;
    }

    public void setPeopleSoftID(String peopleSoftID) {
        this.peopleSoftID = peopleSoftID;
    }

    public String getClass_standing() {
        return Class_standing;
    }

    public void setClass_standing(String Class_standing) {
        this.Class_standing = Class_standing;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
        
        @Override
public String toString() {
  return firstname+""+lastname+""+"\n"+peopleSoftID+"\n"+Class_standing+"\n"+emailID+"\n"+addressLine+
          "\n"+City+"\n"+State+"\n"+zipcode;
}
    public void displayinfo(){
        
        for(int i=0;i<count;i++)
        {
            System.out.println("Students Details, Department of ILT");
        System.out.println("First Name: "+"\t"+students[i].getFirstname());
        System.out.println("Last Name"+ " \t"+students[i].getLastname());
        System.out.println("People SOft ID"+ " \t"+students[i].getPeopleSoftID());
        System.out.println("Class Standing"+ "\t "+students[i].getClass_standing());
        System.out.println("Email ID"+ "\t "+students[i].getEmailID());
        System.out.println("Address Line"+ "\t "+students[i].getAddressLine());
        System.out.println("City"+ "\t "+students[i].getCity());
        System.out.println("State"+ "\t "+students[i].getState());
        System.out.println("Zip"+ " \t"+students[i].getZipcode());
        }  
    }
    public void getInfo(){
        
        for(int i=0; i<count;i++)
        {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First name");
        firstname=input.next();
        while(!isStringOnlyAlphabet(firstname)){
            System.out.println("**********first name should not contain digits **********");
            System.out.println("Enter First name again");
        firstname=input.next();
        }
        System.out.println("Enter Last name");
        lastname=input.next();
        while(!isStringOnlyAlphabet(lastname)){
           System.out.println("**********last name should not contain digits **********");
            System.out.println("Enter Last name again");
        lastname=input.next();
        }
        
          System.out.println("Enter People Soft id");
        peopleSoftID=input.next();
        while(!(peopleSoftID.matches("[0-9]+") && peopleSoftID.length()<8)){
            
           System.out.println("**********PeoplesoftI should only contain digits and length should be less than or equal to 7 **********");
           System.out.println("Enter People Soft id Again");
        peopleSoftID=input.next();
        }
        System.out.println("Enter Class standing");
        Class_standing=input.next();
       
         
        while(!(Class_standing.equalsIgnoreCase("freshman") || Class_standing.equalsIgnoreCase("sophomore")
                || Class_standing.equalsIgnoreCase("junior") || Class_standing.equalsIgnoreCase("senior"))){
            System.out.println("Class standing shoulld ONLY be Freshman, Sophomore, Junior OR Senior");
             System.out.println("Enter Class standing again");
        Class_standing=input.next();
        }
          System.out.println("Enter Email Id");
        emailID=input.next();
            while (!validate(emailID)) {                
                System.out.println("*********** Invalid Email Address*************");
                 System.out.println("Enter Email Id");
        emailID=input.next();
            }
        
          System.out.println("Enter Address Line");
       addressLine=input.next();
        
       input.nextLine();
       
         System.out.println("Enter City");
        City=input.next();
            while (!isAlpha(City)) {                
                System.out.println("******* INVALID CITY NAME**********\n");
                 System.out.println("Enter City again");
               City=input.next();
            }
        
        System.out.println("Enter State");
        State=input. next();
            while (!(State.equals("AK")||State.equals("AL")||State.equals("AZ")||State.equals("CA")||
                    State.equals("CO")||State.equals("CT")||State.equals("DC")||State.equals("DE")||
                    State.equals("FL")||State.equals("GA")||State.equals("HI")||State.equals("IA")||
                    State.equals("ID")||State.equals("IL")||State.equals("IN")||State.equals("KS")||State.equals("KY")||
                    State.equals("LA")||State.equals("MA")||State.equals("MD")||State.equals("ME")||State.equals("MI")||
                    State.equals("MN")||State.equals("MO")||State.equals("MS")||State.equals("MT")||
                    State.equals("NC")||State.equals("ND")||State.equals("NE")||State.equals("NH")||State.equals("NJ")||
                    State.equals("NM")||State.equals("NV")||State.equals("NY")||State.equals("OH")||
                    State.equals("OK")||State.equals("OR")||State.equals("PA")||State.equals("RI")||State.equals("SC")||
                    State.equals("SD")||State.equals("TN")||State.equals("TX")||State.equals("UT")||
                    State.equals("VA")||State.equals("VT")||State.equals("WA")||State.equals("WI")||
                    State.equals("WV")||State.equals("WY"))) {                
                System.out.print("**** choose states like this AK, AL, AR, AZ, CA, CO, CT, DC, DE, FL, GA, "
                        + "HI, IA, ID, IL, IN, KS, KY, LA, MA, MD, ME, MI, MN,\n" +
" MO, MS, MT, NC, ND, NE, NH, NJ, NM, NV, NY, OH, OK, OR, PA, RI, SC, SD, TN, TX, UT, VA, VT,\n" +
" WA, WI, WV, WY*******************");
                System.out.println("Enter State again");
        State=input. next();
                
            }    
        
         System.out.println("Enter Zip Code");
        zipcode=input.next();
        while(!(zipcode.matches("[0-9]+") && zipcode.length()<=9)){
            
           System.out.println("**********Enter valid zip code **********");
           System.out.println("Enter zip code Again");
           zipcode=input.next();
        }
       
            System.out.println("\n");
            System.out.println("\n");
        
        Student object = new Student(firstname, lastname,peopleSoftID,Class_standing,emailID,addressLine,City,State,zipcode);
        students[i] = object;
        }

    }
    public static boolean isStringOnlyAlphabet(String str) 
{ 
    return ((!str.equals("")) 
            && (str != null) 
            && (str.matches("^[a-zA-Z]*$"))); 
} 
   
     
  public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
}
public static boolean isAlpha(String city){
    return city!=null && city.matches("^[a-zA-Z]*$");
}

}
