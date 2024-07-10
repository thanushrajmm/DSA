import java.util.HashMap;

class Demo{
    public static void main(String[] args) {
        int[][] arr = new int[5][2];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[2][0] = 5;
        arr[2][1] = 1;
        arr[3][0] = 4;
        arr[3][1] = 3;
        arr[4][0] = 1;
        arr[4][1] = 5;

        HashMap<Integer, Integer>  map = new HashMap<>();
        for(int i = 0; i<arr.length;i++){
        int first = arr[i][0];
        int second = arr[i][1];

        Integer val = map.get(second);

        if(val != null && val == first){
            System.out.println("(" + first + ", " + second + ")");
        }
        else{
            map.put(first, second);
        }
        }
}
}

O/P:
(4, 3)
(1, 5)
