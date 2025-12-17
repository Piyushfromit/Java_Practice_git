package org.example.test;

public class Main2 {

	public static void main(String[] args) {

		String name = "Piy8ush";
        boolean result = name instanceof  String;
		int Integer =6;
//		System.out.println(Integer);
//		System.out.println(result);


		final String str = "Piyush";
		str.concat(" user"); // will not giv error, we can change valu of object
		// str = str.concat(" user"); // will give error, we can not resign final variable


		final StringBuilder  str2 = new StringBuilder();
		str2.append("user"); // will not giv error
		// str2 = str2.append(" user"); // will give error, we can not resign final variable

		StringBuffer str3 = new StringBuffer("piyush");
        str3.append("Piyush");
//		System.out.println(str3.capacity());
//		System.out.println(str3.length());


		String s1="Sachin";
		String s2= new String("Sachin");
		String s3="Ratan";
		System.out.println(s1.compareTo(s2));//0, “==” will give false b/c both are diff obj
		System.out.println(s1.compareTo(s3));//1(because s1>s3)
		System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )

		int a = 'A';
		System.out.println(a);
		int b = 'a';
		System.out.println(b);
		System.out.println(b-a);

		String c = "Hi";
		String d = "Hey";
		System.out.println(c.compareTo(d));

	}

	/*
	 * public static void main(String[] args) { String text =
	 * "The quick brown fox jumps over the lazy dog"; String patternString = "fox";
	 * 
	 * Pattern pattern = Pattern.compile(patternString); Matcher matcher =
	 * pattern.matcher(text);
	 * 
	 * while (matcher.find()) { System.out.println("Found match at index " +
	 * matcher.start()); } }
	 */
	
	
	
	
//		public static void main(String[] args) {
//			Pattern p = Pattern.compile("[a]");
//			Matcher m = p.matcher("a7ab@z#9");
//			while (m.find()) {
//				System.out.println(m.start() + "-------" + m.group());
//			}
//		}
	
	
//	public static void main(String[] args) {
//		Pattern p = Pattern.compile("\\s");
//		Matcher m = p.matcher("a7b k@9");
//		while (m.find()) {
//		     System.out.println(m.start() + "-------" + m.group());
//		}
//	}
	
	
//	public static void main(String[] args) {
//		Pattern p = Pattern.compile("a+"); //  a+ (at least one a or more a treated as a single match)
//		Matcher m = p.matcher("abaabaaab");
//		while (m.find()) {
//		    System.out.println(m.start() + "-------" + m.group());
//		}
//	}
	
//	public static void main(String[] args) {
//		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
//		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
//		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)
//		
//		
//		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true
//		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true
//		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
//		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)
//		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true
//		System.out.println("by metacharacters ...");
//		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true
//		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)
//	}
	
	
	
//		public static void main(String[] args) {
//			Pattern p = Pattern.compile("\\s");
//			String[] s = p.split("Hello how are you");
//			for(String s1:s) {
//			  System.out.println(s1);
//			}
//		}
	
//		public static void main(String args[]){
//			// the current date (yyyy-MM-dd) format
//			LocalDate date = LocalDate.now();
//			System.out.println("the current date is :"+ date);
//			// the current time hh:mm:ss.nanosec
//			LocalTime time = LocalTime.now();
//			System.out.println("the current time is "+ time);
//			// will give us the current time and date combined with "T"
//			LocalDateTime current = LocalDateTime.now();
//			System.out.println("current date and time : "+ current);
//			
//			LocalDate dob = LocalDate.of(1985, 02, 20);//(yyyy-MM-dd)
//			
//			System.out.println("Dob Is : "+ dob);
//		
//		}

	
	
	
//	public static void main(String[] args) {
//	LocalDate date = LocalDate.now();
//	LocalDate yesterday = date.minusDays(1);
//	LocalDate tomorrow = yesterday.plusDays(2);
//	System.out.println("Today date: "+date);
//	System.out.println("Yesterday date: "+yesterday);
//	System.out.println("Tomorrow date: "+tomorrow);
//	}
//	
		
	
//	public static void main(String[] args) {
//		LocalDate date = LocalDate.of(2017, 1, 13);
//		LocalDateTime datetime = date.atTime(1,50,9);
//		      System.out.println(datetime);
//		}


//	public static void main(String args[]){
//		DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//		LocalDateTime current = LocalDateTime.now();
//		System.out.println("current date and time in default format: "+ current);
//		String udf= current.format(formatObj);
//		System.out.println("current date and time in userdefined format: "+ udf);
//		}

//	public static void main(String args[]) {
//		String dob="05/02/1985";
//		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate ld=LocalDate.parse(dob,dtf);
//		System.out.println(ld);
//		}

	
//	public static void main(String args[]) {
//		LocalDate cdate = LocalDate.now();
//		LocalDate dob = LocalDate.of(1985, 02, 05);
//		Period diff = Period.between(cdate, dob);
//		System.out.println(diff);
//		}

//	public static void main(String args[]) {
//		LocalDateTime oldDate = LocalDateTime.of(1982, 5, 31, 10, 20, 55);
//		LocalDateTime newDate = LocalDateTime.of(2016, 9, 9, 10, 21, 56);
//		System.out.println(oldDate);
//		System.out.println(newDate);
//		System.out.println(ChronoUnit.YEARS.between(oldDate, newDate) + " years");
//		System.out.println(ChronoUnit.MONTHS.between(oldDate, newDate) + " months");
//		System.out.println(ChronoUnit.WEEKS.between(oldDate, newDate) + " weeks");
//		System.out.println(ChronoUnit.DAYS.between(oldDate, newDate)+ " days");
//		System.out.println(ChronoUnit.HOURS.between(oldDate, newDate) + " hours");
//		System.out.println(ChronoUnit.MINUTES.between(oldDate, newDate) + " minutes");
//		System.out.println(ChronoUnit.SECONDS.between(oldDate, newDate) + " seconds");
//		System.out.println(ChronoUnit.MILLIS.between(oldDate, newDate) + " milis");
//		             System.out.println(ChronoUnit.NANOS.between(oldDate, newDate) + " nano");
//		}

//	public static void main(String args[]) {
//		LocalDate ld=LocalDate.now();
//		LocalDate dd= ld.plus(3, ChronoUnit.MONTHS);
//		System.out.println(dd);
//		}

	
//	public static void main(String[] args) {
//        // Creating a TreeSet of Integers
//        TreeSet<Integer> treeSet = new TreeSet<>();
//
//        // Adding elements to the TreeSet
//        treeSet.add(10);
//        treeSet.add(5);
//        treeSet.add(15);
//        treeSet.add(3);
//        treeSet.add(7);
//
//        // Printing the TreeSet elements
//        System.out.println("TreeSet elements: " + treeSet);
//
//        // Checking if an element is present in the TreeSet
//        System.out.println("Is 5 present in the TreeSet? " + treeSet.contains(5));
//
//        // Getting the size of the TreeSet
//        System.out.println("Size of the TreeSet: " + treeSet.size());
//
//        // Removing an element from the TreeSet
//        treeSet.remove(7);
//        System.out.println("TreeSet elements after removing 7: " + treeSet);
//
//        // Checking if the TreeSet is empty
//        System.out.println("Is the TreeSet empty? " + treeSet.isEmpty());
//
//        // Creating a subset of the TreeSet
//        SortedSet<Integer> subSet = treeSet.subSet(3, 10);
//        System.out.println("Subset of TreeSet (elements between 3 and 10): " + subSet);
//
//        // Getting the first element of the TreeSet
//        System.out.println("First element of the TreeSet: " + treeSet.first());
//
//        // Getting the last element of the TreeSet
//        System.out.println("Last element of the TreeSet: " + treeSet.last());
//
//        // Adding multiple elements using addAll()
//        List<Integer> moreElements = Arrays.asList(20, 12, 4);
//        treeSet.addAll(moreElements);
//        System.out.println("TreeSet elements after adding more elements: " + treeSet);
//
//        // Removing all elements from the TreeSet
//        treeSet.clear();
//        System.out.println("TreeSet elements after clearing: " + treeSet);
//    }
	
	
	
//	public static void main(String args[]){
//		
//		TreeSet<Student> ts = new TreeSet<>();
//		
//		ts.add(new Student("Amit","7878787878","harshit@gmail.com",11));
//		ts.add(new Student("Bittu","7878787878","harshit@gmail.com",5));
//		ts.add(new Student("piyush","7878787878","harshit@gmail.com",9));
//		ts.add(new Student("harshit","7878787878","harshit@gmail.com",4));
//		
//		System.out.println(ts);
//		
//		
//	}
	
//	public static void main(String[] args) {
//	    TreeSet<Student> tsByName = new TreeSet<>();
//	    tsByName.add(new Student("Amit", "7878787878", "harshit@gmail.com", 11));
//	    tsByName.add(new Student("Bittu", "7878787878", "harshit@gmail.com", 5));
//	    tsByName.add(new Student("Piyush", "7878787878", "harshit@gmail.com", 9));
//	    tsByName.add(new Student("Harshit", "7878787878", "harshit@gmail.com", 4));
//
//	    System.out.println("Sorted by name:");
//	    for (Student student : tsByName) {
//	        System.out.println(student);
//	    }
//
//	    TreeSet<Student> tsByRoll = new TreeSet<>();
//	    tsByRoll.add(new Student("Amit", "7878787878", "harshit@gmail.com", 11));
//	    tsByRoll.add(new Student("Bittu", "7878787878", "harshit@gmail.com", 5));
//	    tsByRoll.add(new Student("Piyush", "7878787878", "harshit@gmail.com", 9));
//	    tsByRoll.add(new Student("Harshit", "7878787878", "harshit@gmail.com", 4));
//
//	    System.out.println("Sorted by roll:");
//	    for (Student student : tsByRoll) {
//	        System.out.println(student);
//	    }
//	}
//	
	
	
//	public static void main(String[] args) {
//		
//		
//		
//		Consumer<Integer> consumer = (value) -> System.out.println(value);
//		
//		System.out.println(consumer);
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
