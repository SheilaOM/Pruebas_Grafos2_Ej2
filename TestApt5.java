//TODOS los requisitos: [1,2], [1,3,4], [1,3,5,6,10], [1,3,5,6,7,8,9], [6,7,8,6], [7,8,6,7], [8,6,7,8]

// Test para el requisito de prueba [1,2]
List<String> list1 = new ArrayList<String>();
list1.add("foo");
assumeTrue(list1.equals(list1));


// Test para el requisito de prueba [1,3,4]
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
assumeFalse(list1.equals(null));


// Test para el requisito de prueba [1,3,5,6,10]
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
assumeTrue(list1.equals(list2));


// Test para el requisito de prueba [1,3,5,6,7,8,9]
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add("foo");
list2.add("bar");
assumeFalse(list1.equals(list2));


// Test para el requisito de prueba [6,7,8,6], [7,8,6,7], [8,6,7,8]
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add("foo");
list1.add("bar");
list2.add("foo");
list2.add("bar");
assumeTrue(list1.equals(list2));
