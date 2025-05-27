
public class ListNode<E> {
    E data;
    ListNode<E> next;

    public ListNode(E object){ 
        data = object; 
        this.next = null; 
    } 
 
    public E getData(){ 
        return data; 
    } 

    public E search(String NamaResep, ListNode<E> first){
            ListNode<E> current = first;

        while (current != null) {
        if (current.getData().equals(NamaResep)) {
            if (current.getData().equals(NamaResep)) {
                return current.getData();
            }
        }
        current = current.next;
    }
    return null;
    }
}