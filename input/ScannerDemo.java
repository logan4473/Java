import java.util.Scanner;;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input Int : ");
        int a = sc.nextInt();
        System.out.println("Input world 'space' Sentence : ");
        String b = sc.next();
        String c = sc.nextLine();

        System.out.println("Output : a = "+a+" b = "+b+" c = "+c);

        if(sc!=null) sc.close();
    }    
}
