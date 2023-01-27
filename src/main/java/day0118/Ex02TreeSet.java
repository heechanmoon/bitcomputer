package day0118;

public class Ex02TreeSet {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add(3);
        for(int i=0; i<tree.array.length; i++){
            System.out.print(tree.array[i]+" ");
        }
        System.out.println();
        tree.add(7);
        for(int i=0; i<tree.array.length; i++){
            System.out.print(tree.array[i]+" ");
        }
        System.out.println();
        tree.add(1);
        for(int i=0; i<tree.array.length; i++){
            System.out.print(tree.array[i]+" ");
        }
        System.out.println();
        tree.add(2);
        for(int i=0; i<tree.array.length; i++){
            System.out.print(tree.array[i]+" ");
        }
        System.out.println();
        tree.add(9);
        for(int i=0; i<tree.array.length; i++){
            System.out.print(tree.array[i]+" ");
        }
    }
}
