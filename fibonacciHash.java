import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



/*
입출력 예시


-입력----------------------
3       <-- 입력 개수 num
3 5 7   <-- num개의 정수, 공백으로 구분
---------------------------

-출력----------------------
2   <-- '3'번째 피보나치 수열 값
5   <-- '5'번째 피보나치 수열 값
13  <-- '7'번째 피보나치 수열 값
---------------------------

*/

public class FibonacciHash {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        line = line.replaceAll("(\r\n|\r|\n|\n\r)", "");
        int input_cnt = Integer.parseInt(line);

        line = br.readLine();
        line = line.replaceAll("(\r\n|\r|\n|\n\r)", "");
        String str [] = line.split(" ");

        int input[];
        input = new int[input_cnt]; 
        for (int i = 0; i < input_cnt; i++) {
            input[i] = Integer.parseInt(str[i]);
        }

        Map<Integer, BigInteger> fiboHash = new HashMap<>();
        fiboHash.put(0, BigInteger.ZERO);
        fiboHash.put(1, BigInteger.ONE);
        fiboHash.put(2, BigInteger.ONE);

        for (int i = 0; i < input_cnt ; i++) {
            System.out.println(fibonacci(fiboHash, input[i]));
            //System.out.println("Fibonacci("+input[i]+"): "+fibonacci.fibonacci(input[i]));
        }
    }

    private static BigInteger fibonacci(Map<Integer, BigInteger> hm, int n) {
        /*
        함수 코드 작성
        */
    }
}
