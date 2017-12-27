
// Test para llegar al 3er return
// Este test cubre los nodos 1, 3, 5, 6, 7, 8 y 9
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add ("foo");
list2.add ("bar");
assumeFalse(list1.equals(list2));


// Test para llegar al 1er return
// Este test cubre los nodos 1 y 2
List<String> list1 = new ArrayList<String>();
list1.add ("foo");
assumeTrue(list1.equals(list1));


// Test para llegar al 2er return
// Este test cubre los nodos 1, 3 y 4
List<String> list1 = new ArrayList<String>();
String list2 = new String();
list1.add ("foo");
assumeFalse(list1.equals(list2));


// Test para llegar al 4o return
// Este test cubre los nodos 1, 3, 5, 6, 7, 8 y 10
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add ("foo");
list2.add ("foo");
assumeTrue(list1.equals(list2));
