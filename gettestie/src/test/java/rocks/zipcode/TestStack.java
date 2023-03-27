package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.*;

public class TestStack implements Comparator<Person> {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void TestHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("r6s");
        hashSet.add("r6s");
        hashSet.toString();
        String expected = "r6s, r6s";
        Assert.assertFalse(expected, expected == "r6s r6s");
    }

    @Test
    public void TestArrayList(){
        ArrayList<String> arraytest = new ArrayList<>();
        arraytest.add("foo");
        arraytest.add("5");
        String expected = "[foo, 5]";
        String actual = arraytest.toString();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestHashMap(){
        Map<Integer, String> mappy = new HashMap<>();
        mappy.put(5, "foo");
        mappy.put(10, "shoo");

        String expected = "foo";
        String actual = mappy.get(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestLinkedList(){
        LinkedList<String> linky = new LinkedList<>();
        linky.add("first");
        linky.add("second");
        linky.add("third");

        String expected = "second";
        String actual = linky.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestArrayDeque(){
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("foo");
        deque.add("loo");
        deque.addFirst("first");
        deque.addLast("last");
        deque.removeLast();

        String expected = "first";
        String actual = deque.getFirst();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestVector(){
        Vector<String> vector = new Vector<>();
        vector.add("foo");
        vector.add("loo");
        vector.add("zoo");
        vector.remove("zoo");
        String expected = "[foo, loo]";
        String actual = vector.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestTreeMap(){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "loo");
        treeMap.put(3, "zoo");
        treeMap.put(1, "foo");

        String expected = "{1=foo, 2=loo, 3=zoo}";
        String actual = treeMap.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestStack(){
        Stack<String> stack = new Stack<>();
        stack.push("foo");
        stack.push("loo");
        stack.push("zoo");

        String expected = "zoo";
        String actual = stack.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestTreeSet(){
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("foo");
        treeSet.add("loo");
        treeSet.add("zoo");

        String expected = "foo";
        String actual = treeSet.first();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestIterator(){
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("banana")) {
                iterator.remove();
            }
        }
        String expected = "[apple, cherry]";
        String actual = list.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestPriorityQueue(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(5);
        queue.offer(3);
        queue.offer(0);

        Integer expected = 0;
        Integer actual = queue.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestComparable(){

    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
