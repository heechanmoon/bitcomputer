package day0118;

public class Ex01BinaryTree {
    static int[] array = {1,2,0,8,4,7};
    static int currentIndex = 0;
    public static void main(String[] args) {
        Node zero = new Node();
        zero.value = array[currentIndex++];
        for(int i = 1; i < array.length; i++){
            insert(zero, array[i]);
        }

        System.out.println(zero.value); //1
        System.out.println(zero.left.value); //0
        System.out.println(zero.right.value); //2
        System.out.println(zero.right.right.value); //8
        System.out.println(zero.right.right.left.value); //4
        System.out.println(zero.right.right.left.right.value); //7
    }

    public static void insert(Node parent, int value){
        if(parent.value < value){
            if(parent.right==null) {
                parent.right = createNode(value);
            }else{
                insert(parent.right,value);
            }
        } else{
            if(parent.left==null) {
                parent.left = createNode(value);
            }else{
                insert(parent.left,value);
            }
        }
    }

    public static Node createNode(int value){
        Node n = new Node();
        n.value = value;

        return n;
    }
}
