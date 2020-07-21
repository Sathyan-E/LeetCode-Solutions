public class *RemoveLinkdeListElement{

	public ListNode removeElements(ListNode head, int val) {
        if(head==null){return head;}
        while(head.val==val){
            head=head.next;
            if(head==null){
                return null;
            }
            
        }
        ListNode a=head;
        ListNode prev=null;
        while(a!=null){
            if(a.val==val){
               prev.next=a.next;
                
            }
            else{
                 prev=a;
              //  a=a.next;
            }
           a=a.next;
        }
        return head;
        
    }

}
