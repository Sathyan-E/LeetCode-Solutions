public class MergeSortArrays {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public static void main(String[] args) {
        
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedlist=null;
        ListNode tailNode=null;
        
        while(l1!=null && l2!=null){
            int a=l1.val;
            int b=l2.val;
            if(a<=b){
                ListNode temp =new ListNode(a);
                if(mergedlist == null){
                    mergedlist=temp;
                    tailNode=temp;
                }else{
                    tailNode.next=temp;
                    tailNode=temp;
                }
                if(l1.next==null){
                    tailNode.next=l2;
                    break;
                }
                l1.val=l1.next.val;
                l1.next=l1.next.next;
            }
            else{
                ListNode temp=new ListNode(b);
                if(mergedlist==null){
                    mergedlist=temp;
                    tailNode=temp;
                }else{
                    tailNode.next=temp;
                    tailNode=temp;
                }
                if(l2.next==null){
                    tailNode.next=l1;
                    break;
                }
                l2.val=l2.next.val;
                l2.next=l2.next.next;
            }
           
        }
        
            
        return mergedlist;   }
    
}