public class edades {
	public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;
        int min = ages[0];
        int max = ages[0];
        int length = ages.length;
        for (int age : ages) {
        sum += age;
        }
        for (int i = 0; i < length; i++){
            if (ages[i] < min)
                min = ages[i];
            if (ages[i] > max)
                max = ages[i];
        }
        int dif = max - min;
        avg = sum / length;
        System.out.println("The average age is: " + avg);
        System.out.println("The minimum age is: " + min);
        System.out.println("The maximum age is: " + max);
        System.out.println("The difference between the maximum and minimum age is: " + dif);
	}
}
