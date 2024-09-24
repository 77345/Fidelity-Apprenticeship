public class problem3 {
    public static void main(String[] args) {
        int arr[]={4,2,3,5,8,10};
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                even+=arr[i];

        }
        System.out.println(even);
    }
}
