public class CalculatorQ5 {

    public int add(int num1, int num2){


        return num1+num2;
    }

    public int multiply(int num1, int num2){


        return num1*num2;
    }

    public int square(int num){


        return num*num;
    }

    public static void main(String[] args) {

        CalculatorQ5 cal = new CalculatorQ5();
        int expression1 = cal.square(cal.add(cal.multiply(3,4), cal.multiply(5,7)));

        System.out.println("The result of expression  (3*4 + 5*7)^2 is : "+expression1);

        int expression2 = cal.add(cal.square(cal.add(4,7)), cal.square(cal.add(8,3)));

        System.out.println("The result of expression (4+7)^2 + (8+3)^2 is : "+expression2);

    }


}
