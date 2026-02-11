import java.math.*;
public class BigInt {
    public static void main(String[] args){
        BigInteger num1=new BigInteger("98765432123456789");
        BigInteger num2=new BigInteger("123456789987654321");
        BigInteger sum=num1.add(num2);
        BigInteger product=num1.multiply(num2);
        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);
    }
    
}
