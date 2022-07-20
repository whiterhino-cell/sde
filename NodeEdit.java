package akm;

public class NodeEdit {

    public static void printLinkedList(ListNode head) {
        while (head!=null){
            System.out.print(head.val+"-->");
            head=head.next;
        }
        System.out.println(head);
    }

    public static ListNode getHead() {
//         ListNode l5=new ListNode();
//         l5.val=5;
//         l5.next=null;

        ListNode l5=new ListNode(5);

        ListNode l4=new ListNode(4,l5);

        ListNode l3=new ListNode();
        l3.val=3;
        l3.next=l4;

        ListNode l2=new ListNode();
        l2.val=2;
        l2.next=l3;

        ListNode l1=new ListNode();
        l1.val=1;
        l1.next=l2;
        return l1;
    }
    public static ListNode getHead2(){
        ListNode al5=new ListNode();
        al5.val=9;
        al5.next=null;

        ListNode al4=new ListNode();
        al4.val=9;
        al4.next=al5;

        ListNode al3=new ListNode();
        al3.val=5;
        al3.next=al4;

        ListNode al2=new ListNode();
        al2.val=3;
        al2.next=al3;

        ListNode al1=new ListNode();
        al1.val=1;
        al1.next=al2;

        return al1;
    }

//     iske niche D6Q1 ka link list hai

    static ListNode x=new ListNode(4);
    static ListNode xxx=new ListNode(2,x);
    public static ListNode getHead3() {
//         ListNode l5=new ListNode();
//         l5.val=5;
//         l5.next=null;

//         ListNode l5=new ListNode(4);
//
//         ListNode l4=new ListNode(2,l5);

        ListNode l3=new ListNode(1,xxx);
//        l3.val=1;
//        l3.next=xxx;

        ListNode l2=new ListNode(3);
//        l2.val=3;
        l2.next=l3;

        ListNode l1=new ListNode();
        l1.val=1;
        l1.next=l2;
        return l1;
    }
    public static ListNode getHead4(){
//         ListNode l5=new ListNode(4);
//
//         ListNode l4=new ListNode(2,l5);

        ListNode l3=new ListNode();
        l3.val=3;
        l3.next=xxx;

        return l3;
    }
    public static ListNode getHeadPalindrome1(){
        ListNode h1=new ListNode(1);
        ListNode h2=new ListNode(2,h1);
        ListNode h3=new ListNode(3,h2);
        ListNode h4=new ListNode(3,h3);
        ListNode h5=new ListNode(2,h4);
        ListNode h6=new ListNode(1,h5);
        return  h6;
    }
    public static ListNode getHeadPalindrome2(){
        ListNode h1=new ListNode(1);
        ListNode h2=new ListNode(2,h1);
//        ListNode h3=new ListNode(3,h2);
//        ListNode h4=new ListNode(3,h3);
//        ListNode h5=new ListNode(2,h4);
//        ListNode h6=new ListNode(1,h5);
        return  h2;
    }
    public static ListNode createHead(int[] arr){
        int l= arr.length;

        ListNode node=new ListNode(arr[l-1]);
        ListNode head=node;
        for (int i = l-2; i >=0 ; i--) {
            node=new ListNode(arr[i],head);
            head=node;
        }
        return head;
    }
}
