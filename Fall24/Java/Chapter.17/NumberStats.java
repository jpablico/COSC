public class NumberStats<NUM extends Number & Comparable<NUM>> {
    private NUM[] numbers;

    public NumberStats(NUM[] numbers) {
        this.numbers = numbers;
    }

    public NUM getMax() {
        NUM max = numbers[0];
        for (NUM number : numbers) {
            if (number.doubleValue() > max.doubleValue()) {
                max = number;
            }
        }
        return max;
    }

    public NUM getMin() {
        NUM min = numbers[0];
        for (NUM number : numbers) {
            if (number.doubleValue() < min.doubleValue()) {
                min = number;
            }
        }
        return min;
    }

    public double getTotal() {
        double total = 0;
        for (NUM number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    public double getAverage() {
        return getTotal() / numbers.length;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 4, 2, 4, 7};
        NumberStats<Integer> intStats = new NumberStats<>(intArray);
        System.out.println("Integer Array:");
        System.out.println("Max: " + intStats.getMax());
        System.out.println("Min: " + intStats.getMin());
        System.out.println("Total: " + intStats.getTotal());
        System.out.println("Average: " + intStats.getAverage());

        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        NumberStats<Double> doubleStats = new NumberStats<>(doubleArray);
        System.out.println("\nDouble Array:");
        System.out.println("Max: " + doubleStats.getMax());
        System.out.println("Min: " + doubleStats.getMin());
        System.out.println("Total: " + doubleStats.getTotal());
        System.out.println("Average: " + doubleStats.getAverage());
    }
}