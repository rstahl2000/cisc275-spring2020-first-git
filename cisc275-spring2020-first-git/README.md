# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

	First an ArrayList of Dogs is created. Then 3 dogs are created and added to the ArrayList. Finally, a Comparator is created and used in the Collections.sort method.

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?

	The Comparator construction call is in the Collections.sort method call. The definitions is directly after it, with the @Override indicating the implementation of the compare() method that is the only method that must be implemented for a Comparator.	
