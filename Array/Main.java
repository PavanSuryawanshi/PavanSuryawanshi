public class Main {
    public static void main(String[] args) {
        // Create a CustomArrayList with default capacity
        CustomArrayList<Integer> list = new CustomArrayList<>();

        // Add elements to the CustomArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List after adding elements: " + list);

        // Add an element at a specific index
        list.add(2, 25);
        System.out.println("List after adding 25 at index 2: " + list);

        // Remove an element from a specific index
        list.remove(3);
        System.out.println("List after removing element at index 3: " + list);

        // Get the size of the CustomArrayList
        System.out.println("Size of the list: " + list.size());

        // Check if the CustomArrayList is empty
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
