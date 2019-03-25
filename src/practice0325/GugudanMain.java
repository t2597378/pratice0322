package practice0325;


public class GugudanMain {
    public static void main(String[] args){
        //메서드는 특정값을 입력전달하면 함수내에서 로직을 구현한후 결과값을 출력반환하는 역할
        for(int i = 2; i<10; i++){
            int[] result = Gugudanmethod.calculate(i);
            Gugudanmethod.print(result);
        }
    }
}
