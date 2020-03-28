package base;

public class tmp01 {

    public static void main(String args[]){
        System.out.println("hello ,this is first java language");

        int a=3,b=3;
        if (a>b){
            System.out.println("a大");
        } else if (a==b){
            System.out.println("a==b");
        }else {
            System.out.println("b big");
        }

        switch (a){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("no mesh");
                break;
        }


        int c=1;
        while (c<10){
            System.out.println(c+"hello");
            c++;
        }


        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

}



