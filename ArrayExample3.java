/*finding the maximum and minimum from the array*/
class ArrayExample3{
    public static void main(String args[]){
        int arr1[]={1,2,3,4,5};
        int max=0,min=10;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
            if(arr1[i]<min){
                min=arr1[i];
            }
        }
        System.out.println("maximum value from array is: "+max+" minimum value from array is: "+min);
    }
}