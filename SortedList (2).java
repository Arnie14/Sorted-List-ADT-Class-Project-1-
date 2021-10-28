public class SortedList<E extends Comparable<? super E>>

extends AbstractList<E> {


private void insert(Node<E> previous,

Node<E> current,Node<E> node)

{


if(current == null ||

node.data.compareTo(current.data) < 0)

{

if(previous == null)

{

node.next = head;

head = node;

}

else

{

node.next = previous.next;

previous.next = node;

}

}


else

insert(current, current.next, node);

}


@Override

public void insert(E value)

{


Node<E> temp = new Node<E>(value);

insert(null, head, temp);

}


private void remove(Node<E> previous,

Node<E> current, E value)

{


if(current == null)

return;

if(current.data.compareTo(value) == 0)

{



if(previous == null)

head = current.next;

else

previous.next = current.next;

}

else if(current.data.compareTo(value) > 0)

return;

else

remove(current, current.next, value);

}


@Override

public void remove(E value)

{

remove(null, head, value);

}

@Override

public E retrieve(int index)

{


Node<E> current = head;

for(int position = 0; current != null &&

position < index; position++)

{

current = current.next;

}

if(current == null)

return null;

else

return current.data;

}


private boolean search(Node<E> node, E value)

{

if(node == null)

return false;


if(node.data.equals(value))

return true;

else

return search(node.next, value);

}



@Override

public boolean search(E value)

{

return search(head, value);

}

@Override

public java.util.Iterator<E> iterator() {

return new Iterator();

}


class Iterator implements java.util.Iterator<E>

{

Node<E> current = head;


@Override

public boolean hasNext()

{

return current != null;

}


@Override

public E next()

{

E value = current.data;

current = current.next;

return value;

}

}

}