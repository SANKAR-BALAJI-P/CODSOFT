//TASK 1 : NUMBER GUESSING GAME
/*import java.lang.System;
import java.util.Scanner;
import java.util.Random;
class hello{
    boolean flag=true;
    public static void main(String args[]){
        hello h = new hello();
        Random r = new Random();
        c obj = new c();
        while(true){
            if(h.flag==false){
                break;
            }
            else{
                System.out.println("I had a random number from 1 to 100");
                int x = r.nextInt(100) + 1 ;
                obj.guess(x,h);

            }
        }   
    }
}
class c{
    public void guess(int x,hello h){
        int count=0;
        Scanner s = new Scanner (System.in);
        while(true){
            System.out.println("Guess that number : ");
            int g = s.nextInt();
            if(g > x){
                System.out.println("Too High");
            }
            else if(g < x){
                System.out.println("Too Low");
            }
            else{
                System.out.println("Correct");
                System.out.println("Score : "+(100-(10*count)));
                while(true){
                    System.out.println("1.NEW GAME\n2.EXIT");
                    System.out.println("Enter your choice : ");
                    int ch = s.nextInt();
                    if(ch==1){
                        System.out.println("Okay!");
                        h.flag=true;
                        break;
                    }
                    else if(ch==2){
                        System.out.println("Thank you!!!");
                        h.flag=false;
                        break;
                    }
                    else{
                        System.out.println("Invalid choice");
                    }
                }
                break;
            }
            count++;
            if(count==10){
                System.out.println("Limit Exceeded!\nGame out");
                System.out.println("The random number is : "+ x);
                System.out.println("Score : 0");
                while(true){
                    System.out.println("1.NEW GAME\n2.EXIT");
                    System.out.println("Enter your choice : ");
                    int ch = s.nextInt();
                    if(ch==1){
                        System.out.println("Okay!");
                        h.flag=true;
                        break;
                    }
                    else if(ch==2){
                        System.out.println("Thank you!!!");
                        h.flag=false;
                        break;
                    }
                    else{
                        System.out.println("Invalid choice");
                    }
                }
                break;
            }
        }
    }
} */
//TASK 2 : STUDENT GRADE CALCULATOR 
/*import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String args[]){
        hello  h = new hello();
        Scanner k = new Scanner (System.in);
        int a,b,c,d,e;
        while(true){
            System.out.println("Enter your marks obtained in Tamil : ");
            a = k.nextInt();
            if((a>=0)&&(a<=100)){
                break;
            }
            else{
                System.out.println("Not a valid mark!");
            }
        }
        while(true){
            System.out.println("Enter your marks obtained in English : ");
            b = k.nextInt();
            if((b>=0)&&(b<=100)){
                break;
            }
            else{
                System.out.println("Not a valid mark!");
            }
        }
        while(true){
            System.out.println("Enter your marks obtained in Maths : ");
            c = k.nextInt();
            if((c>=0)&&(c<=100)){
                break;
            }
            else{
                System.out.println("Not a valid mark!");
            }
        }
        while(true){
            System.out.println("Enter your marks obtained in Science : ");
            d = k.nextInt();
            if((d>=0)&&(d<=100)){
                break;
            }
            else{
                System.out.println("Not a valid mark!");
            }
        }
        while(true){
            System.out.println("Enter your marks obtained in Social Science : ");
            e = k.nextInt();
            if((e>=0)&&(e<=100)){
                break;
            }
            else{
                System.out.println("Not a valid mark!");
            }
        }
        int t = (a+b+c+d+e);
        double avg = (((double)(t))/((double)(5)));
        char g;
        int arr[] = new int[5];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;
        if(((avg>=90)&&(avg<=100))&&(h.allpass(arr))){
            g='O';
        }
        else if(((avg>=80)&&(avg<90))&&(h.allpass(arr))){
            g='A';
        }
        else if(((avg>=70)&&(avg<80))&&(h.allpass(arr))){
            g='B';
        }
        else if(((avg>=60)&&(avg<70))&&(h.allpass(arr))){
            g='C';
        }
        else if(((avg>=50)&&(avg<60))&&(h.allpass(arr))){
            g='D';
        }
        else if(((avg>=40)&&(avg<50))&&(h.allpass(arr))){
            g='E';
        }
        else{//avg<40
            g='F';
        }
        System.out.println("Marks obtained in Tamil : "+a+"/100");
        System.out.println("Marks obtained in English : "+b+"/100");
        System.out.println("Marks obtained in Maths : "+c+"/100");
        System.out.println("Marks obtained in Science : "+d+"/100");
        System.out.println("Marks obtained in Social Science : "+e+"/100");
        System.out.println("Total marks obtained : "+t+"/500");
        System.out.println("Average marks obtained : "+avg);
        System.out.println("Grade obtained : "+g);
        if(g!='F'){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
    boolean allpass(int arr[]){
        int dummy=0;
        for(int i=0;i<5;i++){
            if(arr[i]<40){
                dummy++;
                break;
            }
        }
        if(dummy==0){
            return true;
        }
        else{
            return false;
        }
    }
}*/
//TASK 3 : ATM INTERFACE 
/*import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String args[]){
        Scanner k = new Scanner(System.in);
        atm obj = new atm();
        obj.display(k);
    }
}
class atm{
    int deposit_amount=0;
    int withdraw_amount=0;
    public void display(Scanner k){
        int ch;
        int amount;
        user u = new user();
        while(true){
            System.out.println("1.WITHDRAW\n2.DEPOSIT\n3.CHECKBALANCE\n4.EXIT");
            System.out.println("Enter your choice : ");
            ch=k.nextInt();
            if(ch==1){
                System.out.println("Enter the amount to be withdraw : ");
                amount=k.nextInt();
                u.withdraw(amount);
            }            
            else if(ch==2){
                System.out.println("Enter the amount to be deposited : ");
                amount=k.nextInt();
                u.deposit(amount);
            }
            else if(ch==3){
                u.checkbalance();
            }
            else if(ch==4){
                System.out.println("Thank you!!!");
                break;
            }
            else{
                System.out.println("Invalid choice");
            }
        }
    }
}
class user{
    int cash=0;
    atm obj = new atm();
    public void withdraw(int amount){
        if(amount<=0){
            System.out.println("Invalid Amount");
        }
        else if(cash<amount){
            System.out.println("Withdraw Failed!");
            System.out.println("Insufficient Account Balance!");
        }
        else if(amount>100000){
            System.out.println("Withdraw Failed!");
            System.out.println("Account Withdraw Limit Exceeded!");
        }
        else{
            obj.withdraw_amount+=amount;
            if(obj.withdraw_amount>100000){
                System.out.println("Withdraw Failed!");
                System.out.println("Acount Withdraw Limit Exceeded!");
            }
            else{
                cash=cash-amount;
                System.out.println("Withdrawn successfully!");
            }
        }
    }
    public void deposit(int amount){
        if(amount<=0){
            System.out.println("Invalid amount");
        }
        else if(amount>100000){
            System.out.println("Money deposit Failed!");
            System.out.println("Account Deposit Limit Exceeded!");
        }
        else{
            obj.deposit_amount+=amount;
            if(obj.deposit_amount>100000){
                System.out.println("Money deposit failed");
                System.out.println("Account Deposit Limit Exceeded!");
            }
            else{
                cash=cash+amount;
                System.out.println("Deposited successfully!");
            }
        }
    }
    public void checkbalance(){
        System.out.println("Your Balance : "+ cash);
    }
}
 */
//TASK 4 : CURRRENCY CONVERTER
/*import java.net.*;
import java.net.http.*;
import java.util.*;
class hello{
    public static void main(String args[]){
        hello h = new hello();
        Scanner k = new Scanner(System.in);
        while(true){
            System.out.println("1.CURRENCY CONVERTER");
            System.out.println("2.EXIT");
            System.out.println("Enter your choice : ");
            int ch = k.nextInt();
            if(ch==1){
                h.getinput(k);
            }
            else if(ch==2){
                System.out.println("Thank you!");
                break;
            }
            else{
                System.out.println("Invalid choice!");
            }
        }
    }
    public void getinput(Scanner k){
        hello h1 = new hello();
        while(true){
            System.out.println("1.INDIAN RUPPEE\n2.EURO\n3.US DOLLAR");
            System.out.println("4.BRITISH POUND\n5.JAPANESE YEN\n6.CHINESE YUAN");
            System.out.println("7.CANADIAN DOLLAR\n8.AUSTRALIAN DOLLAR\n9.SWISS FRANC");
            System.out.println("10.SINGAPORE DOLLAR");
            System.out.println("Enter base currency : ");
            int chb = k.nextInt();
            if((chb>=1)&&(chb<=10)){
                System.out.println("Enter target currency : ");
                int cht = k.nextInt();
                if((cht>=1)&&(cht<=10)){
                    System.out.println("Enter the amount of the base currency : ");
                    double amount = k.nextDouble();
                    h1.convert(chb,cht,amount);
                    break;
                }
                else{
                    System.out.println("Invalid choice!");
                }
            }
            else{
                System.out.println("Invalid choice!");
            }
        }
    }
    public void convert(int chb,int cht,double amount){
        hello h2 = new hello();
        if(chb==cht){
            String from = h2.numtocurrency(chb);
            String to = h2.numtocurrency(cht);
            System.out.println("1.0 "+from+" = 1.0 "+to);
            System.out.println(amount+" "+from+" = "+amount+" "+to);
            System.out.printf("The converted amount is %.3f",amount);
            System.out.println(" "+to);
        }
        else{
            try{
                String from = h2.numtocurrency(chb);
                String to = h2.numtocurrency(cht);
                String url = "https://api.frankfurter.app/latest?from="+from+"&to="+to;
                //create a request
                URI u = URI.create(url);
                HttpRequest.Builder b = HttpRequest.newBuilder();
                HttpRequest.Builder b1 = b.uri(u);
                HttpRequest request = b1.build();
                //create a client
                HttpClient.Builder B = HttpClient.newBuilder();
                HttpClient.Builder B1 = B.followRedirects(HttpClient.Redirect.ALWAYS);
                HttpClient client = B1.build();
                //send the request and receive the response
                HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                int start = 62;
                int end = json.indexOf("}");
                String s = json.substring(start,end);
                double exchangerate = Double.parseDouble(s);
                double total = exchangerate* amount ;
                System.out.println("1 "+from+" = "+exchangerate+" "+to);
                System.out.println(amount+" "+from+" = "+total+" "+to);
                System.out.printf("The converted amount is %.3f",total);
                System.out.println(" "+to);
            }
            catch(Exception e){
                System.out.println("Error!");
            }
        }
    }
    public String numtocurrency(int n){
        if(n==1){
            return "INR";
        }
        else if(n==2){
            return "EUR";
        }
        else if(n==3){
            return "USD";
        }
        else if(n==4){
            return "GBP";
        }
        else if(n==5){
            return "JPY";
        }
        else if(n==6){
            return "CNY";
        }
        else if(n==7){
            return "CAD";
        }
        else if(n==8){
            return "AUD";
        }
        else if(n==9){
            return "CHF";
        }
        else{
            return "SGD";
        }
    }
}
 */
//TASK 5 : STUDENT MANAGEMENT SYSTEM
import java.lang.System;
import java.util.*;
import java.io.*;
class hello{
    public static void main(String args[]) throws IOException{
        Scanner k = new Scanner(System.in);
        sms smsobj = new sms();
        while(true){
            System.out.println("1.ADD A STUDENT");
            System.out.println("2.REMOVE A STUDENT");
            System.out.println("3.UPDATE A STUDENT");
            System.out.println("4.FIND A STUDENT");
            System.out.println("5.DISPLAY A STUDENT");
            System.out.println("6.EXIT");
            System.out.println("Enter your choice : ");
            int ch = k.nextInt();
            if(ch==1){
                smsobj.add();
            }
            else if(ch==2){
                smsobj.remove();
            }
            else if(ch==3){
                smsobj.update();
            }
            else if(ch==4){
                smsobj.find();
            }
            else if(ch==5){
                smsobj.display();
            }
            else if(ch==6){
                System.out.println("Thank you!");
                break;
            }
            else{
                System.out.println("Invalid choice!");
            }
        }        
    }
}
class student{
    int rollno;
    String name;
    String dept;
    int total;
    char grade;
}
class sms{
    Scanner k = new Scanner(System.in);
    student s = new student();
    File f = new File("student.txt");
    public void add() throws IOException{
        FileWriter fw = new FileWriter("student.txt",true);
        int d;
        sms obj = new sms();
        //input roll number
        while(true){
            System.out.println("Enter the rollnumber of the student (from 100 to 200) : ");
            String str=k.nextLine();
            if(str.trim().isEmpty()){
                System.out.println("Roll number cannot be empty");
            }
            else{
                try{
                    s.rollno=Integer.parseInt(str);
                    d=obj.giveline(s.rollno);
                    if((s.rollno<100)||(s.rollno>200)){
                        System.out.println("Error ! Roll number should be from 100 to 200!");
                    }   
                    else{
                        if(d!=-1){
                            System.out.println("Error ! Such a Roll number already exists!");
                        }
                        else{
                            break;
                        }
                    }
                }
                catch(NumberFormatException e){
                    System.out.println("Error ! Roll number contains non numeric characters");
                }
            }
        }
        //input name
        while(true){
            System.out.println("Enter the name of the student : ");
            s.name=k.nextLine();
            if((s.name).trim().isEmpty()){
                System.out.println("Error ! Name cannot be empty");
            }
            else{
                int l = (s.name).length();
                int dummy=0;
                for(int i=0;i<l;i++){
                    char ch=(s.name).charAt(i);
                    if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z'))){
                        continue;
                    }
                    else{
                        dummy++;
                        break;
                    }
                }
                if(dummy==0){
                    break;
                }
                else{
                    System.out.println("Error ! Name contains non alphabetic characters");
                }
            }
        }
        //input department
        while(true){
            System.out.println("Enter the department of the student : ");
            s.dept=k.nextLine();
            if((s.dept).trim().isEmpty()){
                System.out.println("Error ! Department cannot be empty");
            }
            else{
                if(((s.dept).equals("CSE"))||((s.dept).equals("ECE"))||((s.dept).equals("EEE"))||((s.dept).equals("MECH"))||((s.dept).equals("CIVIL"))){
                    break;
                }
                else{
                    System.out.println("Error ! Department should be among CSE,ECE,EEE,MECH,CIVIL");
                }
            }
        }
        //input total
        while(true){
            System.out.println("Enter the total marks of that student : ");
            String str= k.nextLine();
            if(str.trim().isEmpty()){
                System.out.println("Error ! Total marks cannot be empty");
            }
            else{
                try{
                    s.total=Integer.parseInt(str);
                    if(((s.total)>=0)&&((s.total)<=500)){
                        break;
                    }
                    else{
                        System.out.println("Error ! Total marks should be from 0 to 500");
                        continue;
                    }
                }
                catch(NumberFormatException e){
                    System.out.println("Error ! Total marks contain non numeric characters");
                }
            }
        }
        //input grade
        while (true){
            System.out.println("Enter the grade of the student : ");
            String str=k.nextLine();
            if(str.trim().isEmpty()){
                System.out.println("Error ! Grade cannot be empty");
            }
            else{
                s.grade=str.charAt(0);
                if((s.grade=='O')||(s.grade=='A')||(s.grade=='B')||(s.grade=='C')||(s.grade=='F')){
                    break;
                }
                else{
                    System.out.println("Error ! Grade should be among O,A,B,C,F");
                }
            }
        }
        fw.write(" Rollno : "+s.rollno+
                 " | Name : "+s.name+
                 " | Department : "+s.dept+
                 " | Total : "+s.total+
                 " | Grade : "+s.grade+"\n"
                );
        fw.close();
        System.out.println("Student Added successfully!");
    }
    public void remove() throws IOException{
        if(f.length()==0){
            System.out.println("No records for student data");
        }
        else{
            sms obj = new sms();
            int i,r;
            //input roll number
            while(true){
                System.out.println("Enter the rollnumber of the student to be removed : ");
                String str=k.nextLine();
                if(str.trim().isEmpty()){
                    System.out.println("Roll number cannot be empty");
                }
                else{
                    try{
                        r=Integer.parseInt(str);
                        if((r<100)||(r>200)){
                            System.out.println("Error ! Roll number should be from 100 to 200!");
                        }   
                        else{
                            break;
                        }
                    }
                    catch(NumberFormatException e){
                        System.out.println("Error ! Roll number contains non numeric characters");
                    }
                }
            }
            int l=obj.giveline(r);
            if(l==-1){
                System.out.println("Such a roll number does not exists");
            }
            else{
                String str[] = new String[100];
                for(i=0;i<100;i++){
                    str[i]="null";
                }
                Scanner sc = new Scanner(f);
                for(i=1;i<l;i++){
                    str[i-1]=sc.nextLine();
                }
                sc.nextLine();
                i=l+1;
                while(sc.hasNextLine()){
                    str[i-2]=sc.nextLine();
                    i++;
                }
                FileWriter fwr = new FileWriter("student.txt");
                for(i=0;i<str.length;i++){
                    if(str[i].equals("null")){
                        break;
                    }
                    else{
                        fwr.write(str[i]+"\n");
                    }
                }
                fwr.close();
                System.out.println("Student removed successfully!");
            }
        }
    }
    public void update() throws IOException{
        if(f.length()==0){
            System.out.println("No records for student data");
        }
        else{
            sms obj = new sms();
            int i,r;
            //input roll number
            while(true){
                System.out.println("Enter the rollnumber of the student to be updated : ");
                String str=k.nextLine();
                if(str.trim().isEmpty()){
                    System.out.println("Roll number cannot be empty");
                }
                else{
                    try{
                        r=Integer.parseInt(str);
                        if((r<100)||(r>200)){
                            System.out.println("Error ! Roll number should be from 100 to 200!");
                        }   
                        else{
                            break;
                        }
                    }
                    catch(NumberFormatException e){
                        System.out.println("Error ! Roll number contains non numeric characters");
                    }
                }
            }
            int l = obj.giveline(r);
            if(l==-1){
                System.out.println("Such a roll number does not exists");
            }
            else{
                //input updated name
                while(true){
                    System.out.println("Enter the updated name of the student : ");
                    s.name=k.nextLine();
                    if((s.name).trim().isEmpty()){
                        System.out.println("Error ! Name cannot be empty");
                    }
                    else{
                        int len = (s.name).length();
                        int dummy=0;
                        for(i=0;i<len;i++){
                            char ch=(s.name).charAt(i);
                            if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z'))){
                                continue;
                            }
                            else{
                                dummy++;
                                break;
                            }
                        }
                        if(dummy==0){
                            break;
                        }
                        else{
                            System.out.println("Error ! Name contains non alphabetic characters");
                        }
                    }
                }       
                //input updated department
                while(true){
                    System.out.println("Enter the updated department of the student : ");
                    s.dept=k.nextLine();
                    if((s.dept).trim().isEmpty()){
                        System.out.println("Error ! Department cannot be empty");
                    }
                    else{
                        if(((s.dept).equals("CSE"))||((s.dept).equals("ECE"))||((s.dept).equals("EEE"))||((s.dept).equals("MECH"))||((s.dept).equals("CIVIL"))){
                            break;
                        }
                        else{
                            System.out.println("Error ! Department should be among CSE,ECE,EEE,MECH,CIVIL");
                        }
                    }
                }
                //input updated total marks
                while(true){
                    System.out.println("Enter the updated total marks of that student : ");
                    String str= k.nextLine();
                    if(str.trim().isEmpty()){
                        System.out.println("Error ! Total marks cannot be empty");
                    }
                    else{
                        try{
                            s.total=Integer.parseInt(str);
                            if(((s.total)>=0)&&((s.total)<=500)){
                                break;
                            }
                            else{
                                System.out.println("Error ! Total marks should be from 0 to 500");
                                continue;
                            }
                        }
                        catch(NumberFormatException e){
                            System.out.println("Error ! Total marks contain non numeric characters");
                        }
                    }
                }
                //input updated grade
                while (true){
                    System.out.println("Enter the updated grade of the student : ");
                    String str=k.nextLine();
                    if(str.trim().isEmpty()){
                        System.out.println("Error ! Grade cannot be empty");
                    }
                    else{
                        s.grade=str.charAt(0);
                        if((s.grade=='O')||(s.grade=='A')||(s.grade=='B')||(s.grade=='C')||(s.grade=='F')){
                            break;
                        }
                        else{
                            System.out.println("Error ! Grade should be among O,A,B,C,F");
                        }
                    }
                }
                Scanner sc = new Scanner(f);
                String str[] = new String[100];
                for(i=0;i<100;i++){
                    str[i]="null";
                }
                for(i=1;i<l;i++){
                    str[i-1]=sc.nextLine();
                }
                sc.nextLine();
                i=l+1;
                while(sc.hasNextLine()){
                    str[i-1]=sc.nextLine();
                    i++;
                }
                str[l-1]=" Rollno : "+r+
                       " | Name : "+s.name+
                       " | Department : "+s.dept+
                       " | Total : "+s.total+
                       " | Grade : "+s.grade ;
                FileWriter fwr = new FileWriter("student.txt");
                for(i=0;i<100;i++){
                    if(str[i].equals("null")){
                        break;
                    }
                    else{
                        fwr.write(str[i]+"\n");
                    }
                }      
                fwr.close();
                System.out.println("Student Updated successfully!");
            }
        }    
    }
    public void find() throws IOException{
        if(f.length()==0){
            System.out.println("No records for student data");
        }
        else{
            int i,r;
            sms obj = new sms();
            while(true){
                System.out.println("Enter the rollnumber of the student to be searched : ");
                String str=k.nextLine();
                if(str.trim().isEmpty()){
                    System.out.println("Roll number cannot be empty");
                }
                else{
                    try{
                        r=Integer.parseInt(str);
                        if((r<100)||(r>200)){
                            System.out.println("Error ! Roll number should be from 100 to 200!");
                        }   
                        else{
                            break;
                        }
                    }
                    catch(NumberFormatException e){
                        System.out.println("Error ! Roll number contains non numeric characters");
                    }
                }
            }
            int l = obj.giveline(r);
            if(l==-1){
                System.out.println("Such a roll number does not exists");
            }
            else{
                Scanner sc = new Scanner(f);
                for(i=1;i<l;i++){
                    sc.nextLine();
                }
                System.out.println("Student found!");
                System.out.println(sc.nextLine());
            }
        }
    }
    public void display() throws IOException{
        if(f.length()==0){
            System.out.println("No records for student data");
        }
        else{
            System.out.println("The students are : ");
            Scanner sc = new Scanner(f);
            int i=1;
            while(sc.hasNextLine()){
                String str=sc.nextLine();
                System.out.println("Student "+(i)+" : "+str);
                i++;
            }
        }
    }
    int giveline(int r)throws IOException{
        Scanner sc = new Scanner(f);
        int l=1;
        int dummy=0;
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            int n1 = Integer.parseInt(String.valueOf(s.charAt(10)));
            int n2 = Integer.parseInt(String.valueOf(s.charAt(11)));
            int n3 = Integer.parseInt(String.valueOf(s.charAt(12)));
            int n = ((n1*100)+(n2*10)+(n3*1));
            if(n==r){
                dummy++;
                break;
            }
            else{
                l++;
                continue;
            }
        }
        if(dummy==0){
            return -1;
        }
        else{
            return l;
        }
    }
}









































