//TODOS los requisitos: [1,3,4], [1,3,5], [3,5,6], [5,6,7], [5,6,10], [6,7,8],
//                      [7,8,9], [7,8,6], [8,6,7], [8,6,10]

// Test para el requisito de prueba [1,3,4]
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
assumeFalse(list1.equals(null));


// Test para el requisito de prueba [1,3,5], [3,5,6], [5,6,7], [6,7,8], [7,8,9]
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add("foo");
list2.add("bar");
assumeFalse(list1.equals(list2));


// Test para el requisito de prueba [1,3,5], [3,5,6], [5,6,10]
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
assumeTrue(list1.equals(list2));


// Test para el requisito de prueba [1,3,5], [3,5,6], [5,6,7], [6,7,8], [7,8,6],
//                                  [8,6,7], [8,6,10]
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add("foo");
list1.add("bar");
list2.add("foo");
list2.add("bar");
assumeTrue(list1.equals(list2));
