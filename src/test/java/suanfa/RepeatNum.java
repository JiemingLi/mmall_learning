package suanfa;

public class RepeatNum {

    public static int findRepeatedNumber(int array[]){
        if(array!=null && array.length!=0){
            for (int i = 0; i <array.length ; i++) {
                while(array[i] != i){
                    if(array[i] == array[array[i]]){
                        return array[i];
                    }else{
                        swap(array,i,array[i]);
                    }
                }
            }
        }
        return -1;
    }

    public static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[arr[i]];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] array = {2,3,1,0,3,5};
        int res = findRepeatedNumber(array);
        System.out.println(res);
    }

}
