package arranger;
import java.util.Scanner;

class Dissect{
    
    public void digitDissector(String content){
        if(content != null && !content.isEmpty()){
            int length = content.length();
            if (length >= 10 && length < 14){

                String first = content.substring(0, 3);

                String second = content.substring(3, 5);

                String third = content.substring(5, 10);

                String last = content.substring(10, length);
                
                System.out.println("Patient ID: " + second + third + first + "-" + last);
         }else{
                System.out.println("Inaccurate number. needs to be over 10 digits, but not more than 14");
            }
        }else{
            System.out.println("Input correct value");
        }
    }
}

public class Arranger {

    
    public static void main(String[] args) {
        System.out.println("Input the sequence:");
        Scanner scan = new Scanner(System.in);
        
        String content = scan.nextLine();
        Dissect dissect = new Dissect();
        
        dissect.digitDissector(content);
    }
    
}
