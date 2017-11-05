public class Main {

    public static void main(String[] args) {
//        int count =0;
//        while(count !=5){
//            System.out.println("count value is "+ count);
//            count++;
//        }
//
//        count =1;
//        while(true){
//            if(count ==6){
//                break;
//            }
//            System.out.println("count value is " + count);
//            count++;

    int number =5;
    int finisnumber = 20;
    while(number <= finisnumber){
        if(!isevennumber(number)){
            number++;
            continue;
        }
        System.out.println("even number "+ number);
        number++;
    }


    }

    public static boolean isevennumber(int number){
        if((number % 2) == 0){
            return true;

        }else{
            return false;
        }
    }
}

