package String;

public class Introduction {
    static void main(String[] args) {
        String s1 = "Minku";
        String s2 = "Minku";
        if(s1==s2){
            System.out.println("Same String");
        }
        String s3 = new String("Minku");
        if(s1!=s3){
            System.out.println("Not same");
        }
        if(s1.equals(s2)){
            System.out.println("Both string are same");
        }
        if(s1.equals(s3)){
            System.out.println("Both string are same");
        }

        System.out.println(s1.substring(3, 5)); //gives charcter 3 to 4
        System.out.println(s1.substring(3)); //gives charcter 3 to end,cut all begning
    }
}
