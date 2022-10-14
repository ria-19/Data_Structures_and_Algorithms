import java.util.LinkedList;

public class Oct_14 {
    public static void main(String[] args) {

    }

    // Approach 1
//    public static ListNode deleteMiddle(ListNode head) {
//        if (head.next == null){
//            return null;
//        }
//
//        int count = 0;
//        ListNode p1 = head;
//        ListNode p2 = head;
//
//        while(p1 != null){
//            count++;
//            p1 = p1.next;
//        }
//
//        int mInd = count / 2;
//
//        for(int counter = 0; counter < mInd - 1; counter++){
//            p2 = p2.next;
//        }
//
//        p2.next = p2.next.next;
//
//        return head;
//    }


    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null){
            return null;
        }

        ListNode slow = head, fast = head.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}

