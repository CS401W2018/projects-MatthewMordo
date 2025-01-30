package Jan30;

public class Loops {
    
    public static void main(String[] args) {
        
        //for loops

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        String [] what = {"a", "b", "c", "d"};
        for (String w: what) {
            System.out.println(w);
            if (w.equals("c")){
                break;
            }
        }
         
        //while loops
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        

        int g = 0;
        //do while loop
        do{
            System.out.println(g);
            g++;
        }while(g < 20);

        //nested loop
        for (int jh = 0; jh < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(jh);
                System.out.println(j);
            }
        }
    }
}
