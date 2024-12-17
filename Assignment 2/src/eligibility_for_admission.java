import java.util.Scanner;
public class eligibility_for_admission {
    public static void main(String[] args){
        int total,total_math_phy;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Input the marks obtained in Physics");
        int physics = myObj.nextInt();

        System.out.println("Input the marks obtained in Chemistry");
        int chemistry = myObj.nextInt();

        System.out.println("Input the marks obtained in Mathematics");
        int math = myObj.nextInt();
        total=physics+chemistry+math;

        total_math_phy=math+physics;

        System.out.println("Total marks of Maths, Physics, and Chemistry :" + total);

        System.out.println("Total marks of Maths and Physics :" + total_math_phy);

        if(math >= 65 && physics >= 55 && chemistry >= 50){

            if( total>=190|| total_math_phy>=140){

                System.out.println("The candidate is eligible for admission.");
            }
            else{
                System.out.println("The candidate is not eligible for admission.");
            }
        }
        else{
            System.out.println("The candidate is not eligible for admission.");
        }
    }
}