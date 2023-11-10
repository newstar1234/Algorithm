class Solution {
    public int romanToInt(String s) {
        int[] values = new int[s.length()];
        for(int i =0; i<s.length(); i++){
            switch(s.charAt(i)){
                case 'I':
                values[i] =1;
                break;
                case 'V':
                values[i] =5;
                break;
                case 'X':
                values[i] =10;
                break;
                case 'L':
                values[i] =50;
                break;
                case 'C':
                values[i] =100;
                break;
                case 'D':
                values[i] =500;
                break;
                case 'M':
                values[i] = 1000;
                break;
            }
        }
        int a = 0;
        for(int i=0; i < values.length; i++){
            if(i<values.length -1 && values[i] < values[i + 1]){
                a -=values[i];
            } else {
                a += values[i];
            }
        }
        return a;
    }
}