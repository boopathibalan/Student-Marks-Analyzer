public class demo{

    static int calculateTotal(int[] marks) {
        int total=0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        return total;
    }
    static double calculateAverage(int[] marks){
        int total = calculateTotal(marks);
        return (double) total / marks.length;

    }
    static int findHighest(int[] marks){
        int max = marks[0];
        for (int i=0;i<marks.length;i++) {
            if(max<marks[i]){
                max=marks[i];
            }
        }return max;
    }
    static int findLowest(int[] marks){
        int min = marks[0];
        for (int i=0;i<marks.length;i++) {
            if(min>marks[i]){
                min=marks[i];
            }
        }return min;
    }
    static int countPass(int[] marks){
        int a=35;
        int count = 0;
        for(int i=0;i<marks.length;i++){
            if(a<=marks[i]){
                count++;
            }
        }return count;
    }

    public static void main(String[] args) {
        int[] marks = {85, 67, 32, 90, 45};
        int result=calculateTotal(marks);
        double average=calculateAverage(marks);
        int highestmark=findHighest(marks);
        int lowestmark = findLowest(marks);
        int count=countPass(marks);
        
        System.out.println("Total marks :"+result);
        System.out.println("Average marks :"+average);
        System.out.println("Highest mark :"+highestmark);
        System.out.println("Lowest mark :"+lowestmark);
        System.out.println("Pass student :"+count);
        int failCount = marks.length - count;
        System.out.println("Fail students: " + failCount);
    }
}
