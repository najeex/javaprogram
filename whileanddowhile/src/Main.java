public class Main {

    public static void main(String[] args){
        int count =0;
        while(count !=5){
            System.out.println("count value is "+ count);
            count++;
        }

        count =1;
        while(true){
            if(count ==6){
                break;
            }
            System.out.println("count value is " + count);
            count++;
        }
    }
}
