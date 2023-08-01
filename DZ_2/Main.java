class Main {
    public static void printList(Node list) {
        Node line = list;
        while (line != null) {
            System.out.print(line.num + " ");
            line = line.next;
        }

        System.out.println();
    }

    public static Node reverse(Node list) {
        Node previous = null;
        Node current = list;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };

        Node list = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            list = new Node(nums[i], list);
        }

        printList(list);

        list = reverse(list);
        printList(list);
    }
}

class Node {
    int num;
    Node next;

    Node(int num, Node next) {
        this.num = num;
        this.next = next;
    }
}
