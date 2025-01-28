package Jan28;

public class Today {
    
    private static final String Hello = null;
    
        public static void main(String[] args) {
            //["23", "7", "74", "2", "90", "59", "15", "24", "69", "66"]
          
         String[] numbers = {"23", "7", "74", "2", "90", "59", "15", "24", "69", "66"};

            //426

            int sum = 0;
            

            for (String number : numbers){
                sum += Integer.parseInt(number);
            }
            System.out.println("Sum " + sum);    

            }
        }
        