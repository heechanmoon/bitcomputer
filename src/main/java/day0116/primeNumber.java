package day0116;

public class primeNumber {
    public static void main(String[] args) {
        boolean isPrime = true;
        for(int i=2; i<=1000; i++){ //1은 소수가 아닌것으로 정의되어있으므로 for 조건문에서 제외한다.
            for(int j=2; j<=i-1; j++){ //1과 자기자신은 약수이므로 for 조건문에서 제외한다.
                if(i%j==0){
                    isPrime = false;
                }
            }

            if(isPrime){
                System.out.println(i);
            }

            isPrime = true;
        }
    }
}
