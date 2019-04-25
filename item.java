// PACKAGE IMPORTS

    import java.util.*;

// item CLASS

    public class item
    {

        // INSTANCE FIELDS

            private String itemName;
            private String itemType;
            private int itemQuantity;
            private long itemSerial;
            Scanner dataInput = new Scanner(System.in);

        // CONSTRUCTOR METHOD

            public void item(String name, String type, int quantity, long serial)
            {
                name = itemName;
                type = itemType;
                quantity = itemQuantity;
                serial = itemSerial;
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
                System.out.println("\nSuccessfully increased quantity of " + this.itemName + " by 1\nNEW QUANTITY : " + this.itemQuantity));
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
                Long oldSerial = this.itemSerial;0
                String newSerial = dataInput.nextLine();
                this.itemSerial = Long.longParse(newSerial);
                System.out.println("\nSuccessfully changed serial of " + this.itemName " from" + oldSerial + " to" this.itemSerial);
            }

            // this method sends all available information about an item to a string
            public void toString()
            {
                System.out.println("\nITEM NAME : " + this.itemName + "" + + "" + + "" + + ""
            }

    }