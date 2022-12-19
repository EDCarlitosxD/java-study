package dic_18_22;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    
    public void sumTwoNumbers(int num1,int num2){
        System.out.println(num1+num2);
    }

    public void sumMultipleOfThreeAndFive(int n){

        int sum = 0;
        
        for(int i = 1; i<= n; i++){
            if(i % 3 == 0 || i %5==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }

    public void factorial(int n){
    
        int res = 1;
        for(int i = n; i > 0; i--){
            res += res*(i-1);
        }
        System.out.println(res);
    }

    public int searchLinear(Integer n, Integer[] list){
        for(int i = 0; i<list.length;i++){
            if(list[i] == n)return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        Exercises exe = new Exercises();       
        //exe.sumTwoNumbers(3, 3); 
        //exe.sumMultipleOfThreeAndFive(10);
        //exe.factorial(8);

        Integer[] a = {103,-110};
        System.out.println(exe.searchLinear(110,a));
    
    }
}
