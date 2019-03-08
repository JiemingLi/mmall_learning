package suanfa;

public class FindNumInArray {

    public static  boolean findNum(int target,int [][] array){
        /*每一个数据，比他大的都在下面，比他小的都在左边
        * 以右上角的数据为起点
        * */
        int  r = 0;
        int  len = array[0].length;
        int  c = len-1;

        while(r < len && c >= 0){
            if(target> array[r][c]){
                r++;
            }else if(target < array[r][c]){
                c--;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] array = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        boolean res =findNum(50,array);
        if (res){
            System.out.println("找到数据");
        }
        else{
            System.out.println("找不到数据");
        }
    }
}
