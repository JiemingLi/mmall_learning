package suanfa;

public class ReplaceSpace {

    public static String solution(String str){

        if("".equals(str)){
            return null;
        }

        //先计算有多少个空格
        int spaceLength = 0;
        int strLength = str.length();
        char[] strArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(' ' == strArray[i]){
                spaceLength++;
            }
        }

        int newStrLength = strLength + spaceLength*2;

        char[] newStr = new char[newStrLength];

        int i = strLength-1;
        int j = newStrLength-1;

        while(i>=0 ){
            if(strArray[i]!=' '){
                newStr[j--] = strArray[i--];
            }else{
                newStr[j--] = '0';
                newStr[j--] = '2';
                newStr[j--] = '%';
                i--;
            }
        }
        String res = new String(newStr);
        return res;
    }


    public static void main(String[] args) {
        String src = "A  B ";
        String res = solution(src);

        System.out.println(res);

    }
}
