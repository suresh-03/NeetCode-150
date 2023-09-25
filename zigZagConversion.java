class zigZagConversion{
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING",3));
	}
	 public static String convert(String s, int numRows) {
        int n = numRows * 2;
        String str = "";
        int j = 0;

        for(int i = 0; i < numRows; i++){
            j = i;
            n -= 2;
            while(j < s.length()){
                str += s.charAt(j);
                if(i != numRows-1){
                j += n;
                }
                else{
                    j += numRows * 2 - 2;
                }
            }
            
        
            }
            return str;
        }
}