public class FrequencyofDigitsinArray {
    public static void main(String[] args) {
        int[] arr={3,5,2,4,1,6,7,4,2,3,1,9,0};
        int[] freq=new int[10];
        for (int i = 0; i < arr.length; i++) {
            int digit= arr[i];
            if(digit>=0&&digit<=9){
                freq[digit]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if(freq[i]>0){
                System.out.println(i+": "+freq[i]);
            }
        }
    }
}
