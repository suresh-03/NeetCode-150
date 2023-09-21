class Solution {
    public boolean containsDuplicate(int[] arr) {
            boolean swapped;
            int count = 0;
        for(int i = 0; i < arr.length - 1;i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
                if(arr[j] == arr[j - 1]){
                    return true;
                }
            }
            if(!swapped){
                break;
            }
        }

        return false;
    }
}