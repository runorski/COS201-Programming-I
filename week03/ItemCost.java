
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the item details from the user
        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the price of one item: ");
        double price = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculate the total cost
        double totalCost = price * quantity;

        // Display the results
        System.out.println("\n--- Receipt ---");
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: " + totalCost);

        input.close();
    
}
    

