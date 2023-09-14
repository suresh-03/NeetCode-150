/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class addTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ans = new ListNode();
        ListNode head = ans;
        ListNode tail = head;

        // System.out.println(head.val);

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int carry = 1;
        int num1 = 0;




        while(temp1 != null || temp2 != null){

            if(temp1 != null){
            num1 += temp1.val;
            temp1 = temp1.next;
            }
            if(temp2 != null){
                num1 += temp2.val;
                temp2 = temp2.next;
            }
            if(num1 < 10){
            ans.val = num1;
            num1 = 0;
            }
            else{
                ans.val = num1 % 10;
                num1 = carry;
                }
    
            
            tail = ans;
            ans.next = new ListNode();
            ans = ans.next;
            
             }

        // long add = num1 + num2;
        // while(add != 0){
        //     long temp = add % 10;
        //     // System.out.println(temp);
        //     
        //     add /= 10;
        // }

         tail.next = null;
         ans = tail;
         if(num1 > 0){
             ans.next = new ListNode(num1);
         }
         ans = ans.next;
        System.out.println(num1);
        // System.out.println(num2);
        // System.out.println(ans.val);

        return head;

    }
}