Cleaning service application


You are responsible for creating an application that manages room cleaning tasks in a given district. You have to create a logic that will clean items in rooms based on predefined conditions.

Application structure:
Create a RoomCleaningService class that will initialize the streets present in the given district.
Every street has a name and can be closed or not closed. Both must be given at creation.
There are different numbers of houses in every street. Every house has an owner (represented by its name), might have permission for cleaning or not, and a different number of rooms.The owner name and permission state must be given at creation.
Every room has a name (like: bathroom, living room, bedroom, child’s room, etc. - must be given at creation) and the following attributes:
Shelves may be clean or not
Books may be sorted or not;
Carpet may be clean or not;
Tables might be tidy or not;
Windows might be dirty or not;
Air might be fresh or not;
The door of the room might be open or not

You can do cleaning only in those streets that are not closed and in houses that have cleaning permission.

Provide the possibility for the cleaners (methods in the RoomCleaningService class) for the following:
Clean shelves if they are not dirty.
Sort books if they are not sorted.
Clean carpet if it is not clean.
Tidy tables if they are not tidy.
Clean windows if they are not clean.
Fresh air if that is not fresh.

As a representation of the cleaning process, simply set the relevant attributes to true. For example: cleaning shelves means setting the “shelvesAreClean” attribute to “true”.

As a second step, provide possibility (keep the original logic as well) for the cleaners for the same logic as listed above, but anything can only be done when the door of the room is open.
For example, for cleaning the selves :
Clean shelves if they are not dirty and the door is open.
...


Create a Main class, initialize your RoomCleaningService and test your logic by creating and calling a report status method. For this, override the toString() method of the rooms and print everything you need so as to see the status of the room.

Make your service class as reusable as possible!
