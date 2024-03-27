# List Iterator for LinkedLists
<br/>
Optimized the usage of ListIterator by memorizing the iterating direction of the list.<br/>
Wrote a method that moves the cursor (i.e. the list iterator) within the list, depending on the command entered by the user.<br/>
<br/>
0 - exits the program.<br/>
1 - display the next element of the list (i.e. using .next()).<br/>
2 - display the previous element of the list (i.e. using .previous()).<br/>
3 - displays the command menu.<br/>
<br/>
Full list of cities, in order, along with possible iterator positions:

![cursor](https://github.com/ciopecalina/list-iterator-for-linked-lists/assets/58477505/fb7778cb-bd56-4ac8-85b4-6802ad9931cc)


The method doesn't work as wanted:<br/>
<br/>
--> it shows a city twice when changing direction.<br/>
<br/>
For optimization:<br/>
--> need to store (in a boolean variable) the current list traversal direction<br/>
--> when changing the direction, will perform an additional next() / previous() operation to skip the element already displayed in the previous operation<br/>
--> use the method iterate(LinkedList<String>)<br/>
