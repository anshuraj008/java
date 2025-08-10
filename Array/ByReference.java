public class ByReference {
    public static void main(String[] args) {
        int marks[] = {89, 76, 98};
        int nonChangable = 4;
        update(marks, nonChangable);

        //NoChange
        System.out.println(nonChangable);

        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    

    public static void update(int marks[], int nonChangable){
        nonChangable = 8;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
}
