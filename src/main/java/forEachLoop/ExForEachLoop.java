package forEachLoop;

public class ExForEachLoop {

	public static void main(String[] args) {
		ExForEachLoop obj = new ExForEachLoop();
		obj.bikeShowRoom();

	}

	public void bikeShowRoom() {

		String bike[] = { "R15", "FZV1", "Duke", "P150", "FZV2", "FZV3" };

		for (String eachbike : bike) {
			System.out.println(eachbike);
		}

		System.out.println("Difference between for and forloop using an example");
// 		We can not use for each loop for index based operation (we can use but we need to do a extra work)
//		To iterate array values in reverse order we can not use for each loop

//*  	We know the length of array here. But later, in java, many concepts will come where do not know the length. 
//		That time we can not use normal for loop. We could use forEach only.

//		To find whether the "bike" array has a value P150.

		for (int i = 0; i < bike.length; i++) {
			if (bike[i] == "P150") {
				System.out.println("This bike array has P150 bike");
			} else
				System.out.println("This bike array does not have P150 bike");
		}

		for (String each : bike) {
			if (each == "R15") {
				System.out.println("This bike array has R15 bike");
			}
		}
	}

}
