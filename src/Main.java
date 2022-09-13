public class Main {
    public static void main(String[] args) {
        //1
        int[] arr1=new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        float[] arr2={1.57f, 7.654f, 9.986f};
        long[] arr3={12313,13131,42424,13137,6464,34343};
        //2
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
            if(i!=arr1.length-1){
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
            if(i!=arr2.length-1){
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]);
            if(i!=arr3.length-1){
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        //3
        for(int i=arr1.length-1;i>=0;i--){
            System.out.print(arr1[i]);
            if(i!=0){
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        for(int i=arr2.length-1;i>=0;i--){
            System.out.print(arr2[i]);
            if(i!=0){
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        for(int i=arr3.length-1;i>=0;i--){
            System.out.print(arr3[i]);
            if(i!=0){
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        //4
        for(int i=0;i<arr1.length;i++){
            arr1[i]= arr1[i]%2==1 ? arr1[i]+1: arr1[i];
            System.out.print(arr1[i]);
            if(i!=arr1.length-1){
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
    }
}