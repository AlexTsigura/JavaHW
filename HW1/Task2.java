public class Task2 {
    public static void main(String[] args) {
        int arr[] = new int [1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!=0){
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j]%arr[i]==0){
                    arr[j]=0;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                System.out.printf("%d ",arr[i]);
            }
        }
    }
}