class permutations_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums,ans,0);
        return ans;
    }
    public void permute(int[] arr, List<List<Integer>> ans, int index){
            if (index == arr.length - 1) {
            List<Integer> ar = Arrays.stream(arr)
                    .boxed()
                    .collect(Collectors.toList());
            ans.add(ar);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            permute(arr, ans, index+1);
            swap(arr, i, index);
        }
    }
      static void swap(int[] arr, int i, int index) {

        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}