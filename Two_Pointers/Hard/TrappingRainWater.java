package Two_Pointers.Hard;

// Leetcode - 42

class TrappingRainWater{

    public static void main(String args[]){
        System.out.println(trap(new int[]{4,2,3}));
    }
   
    public static int trap(int[] arr) {
        int sections = 0;
        int first = 0;
        int temp = 0;

        if(arr.length == 1){
            return 0;
        }

        while(arr[first] == 0){
            first++;
        }
        // System.out.println(first);
        int second = first + 1;

        while(first < arr.length-1){
          
            if(arr[first] <= arr[second]){
                first = second;
                second = first + 1;
                sections += temp;
                temp = 0;
            }
            else{
                temp += arr[first]-arr[second];
                second++;
            }
            if(second >= arr.length){
                temp = 0;
                int pointer1 = second - 1;
                int pointer2 = pointer1 - 1;
                while(pointer2 > first){
                    if(arr[pointer1] >= arr[pointer2]){
                        sections += arr[pointer1]-arr[pointer2];
                    }
                    else{
                        pointer1 = pointer2;
                    }
                    pointer2--;
                }
                break;
            }
        }
        return sections;
    }
}
