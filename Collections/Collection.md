## List Interface

- List in Java provides the facility to maintain the ordered collection. It contains the index-based methods to insert, update, delete and search the elements. It can have the duplicate elements also. We can also store the null elements in the list.

## ArrayList

- Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package
- It implements the List interface so we can use all the methods of the List interface here
- ArrayList are index based data structure
- ArrayList can store duplicate values
- ArrayList follows the insertion order
- ArrayList does not follows the sorting order
- ArrayList are non-synchronized
- ArrayList are resizable
- ArrayList can store null values

## LinkList

- Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure
- Java LinkedList class can contain duplicate elements.
- Java LinkedList class maintains insertion order.
- Java LinkedList class is non synchronized.
- In Java LinkedList class, manipulation is fast because no shifting needs to occur.

## Difference Between ArrayList and LinkList

- ArrayList internally uses a dynamic array to store the elements.
- LinkedList internally uses a doubly linked list to store the elements.
- Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the other elements are shifted in memory.
- Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
- ArrayList is better for storing and accessing data.
- LinkedList is better for manipulating data.

## TreeSet
- TreeSet class contains unique elements only like HashSet.
- TreeSet class doesn't allow null elements.
- TreeSet class is non-synchronized.
- TreeSet class follows ascending order.
- TreeSet class run on compareTo interface method which is used to compare the current object with the specified object  