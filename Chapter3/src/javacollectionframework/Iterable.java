package javacollectionframework;

public interface Iterable {

    }

    interface Collection extends Iterable {
    }

    interface List extends Collection {
    }

    interface Set extends Collection {
    }

    interface Queue extends Collection {
    }

    class ArrayList implements List {
    }

    class LinkedList implements List {
    }

    class Vector implements List {
    }

    class Stack extends Vector {
    }

    class PriorityQueue implements Queue {
    }

    class Deque implements Queue {
    }

    class ArrayDeque implements Deque {
    }

    class HashSet implements Set {
    }

    class LinkedHashSet implements Set {
    }

    class SortedSet extends Set {
    }

    class TreeSet extends SortedSet {
    }

