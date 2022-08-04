public class Main {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("While Loop\n----------");
        while(i!=6){
            System.out.println(i);
            i++;
        }
        System.out.println("\nDo-While Loop\n-------------");
        i=0;
        do {
            System.out.println(i);
            i++;
        }while(i!=6);
    }
}