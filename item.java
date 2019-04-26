// PACKAGE IMPORTS

    import java.util.*;
    import java.lang.*;

// item CLASS

    public class item
    {

        // INSTANCE FIELDS

            private String itemName;
            private String itemType;
            private int itemQuantity;
            private String itemSerial;
            Scanner dataInput = new Scanner(System.in);

        // CONSTRUCTOR METHOD

            public item(String name, String type, int quantity, String serial)
            {
                itemName = name;
                itemType = type;
                itemQuantity = quantity;
                itemSerial = serial;
            }

        // OBJECT MANIPULATION

            // this method can be used to edit the name of an existing item
            public void editName()
            {
                String oldName = this.itemName;
                System.out.println("PLEASE INPUT A NEW NAME FOR " + this.itemName + " AND PRESS ENTER TO FINALIZE THE CHANGE\n");
                this.itemName = dataInput.nextLine();
                System.out.println("\nSuccessfully changed name of " + oldName + " to " + this.itemName);
            }

            // this method can be used to edit the type of an existing item
            public void editType()
            {
                String oldType = this.itemType;
                System.out.println("PLEASE INPUT A NEW TYPE FOR " + this.itemName + " AND PRESS ENTER TO FINALIZE THE CHANGE\n");
                this.itemType = dataInput.nextLine();
                System.out.println("\nSuccessfully changed type of " + this.itemName + " from " + oldType + " to " + this.itemType);
            }

            // this method can be used to increase the quantity of an existing item by 1
            public void increaseQuantity()
            {
                this.itemQuantity++;
                System.out.println("\nSuccessfully increased quantity of " + this.itemName + " by 1\nNEW QUANTITY : " + this.itemQuantity);
            }

            // this method can be used to decrease the quantity of an existing item by 1
            public void decreaseQuantity()
            {
                this.itemQuantity--;
                System.out.println("\nSuccesfully decreased quantity of " + this.itemName + " by 1\nNEW QUANTITY : " + this.itemQuantity);
            }

            // this method can be used to edit the serial number of an existing item
            public void editSerial()
            {
                System.out.println("PLEASE INPUT A NEW SERIAL NUMBER FOR " + this.itemName + " AND PRESS ENTER TO FINALIZE THE CHANGE\n" );
                String oldSerial = this.itemSerial;
                this.itemSerial = dataInput.nextLine();
                System.out.println("\nSuccessfully changed serial of " + this.itemName + " from " + oldSerial + " to " + this.itemSerial);
            }

            // this method sends all available information about an item to a string
            public void printItem()
            {
                System.out.println("\nITEM NAME : " + this.itemName + "\nITEM TYPE : " + this.itemType + "\nQUANTITY : " + this.itemQuantity + "\nITEM SERIAL : " + this.itemSerial);
            }

        // main method
        public static void main(String[] args)
        {
            item test = new item("Big Gear","Gear", 24, "345678953");
            System.out.println(test.itemQuantity);
            test.printItem();
            test.increaseQuantity();
            System.out.println(test.itemQuantity);
            test.editSerial();
            test.editName();
        }
    }