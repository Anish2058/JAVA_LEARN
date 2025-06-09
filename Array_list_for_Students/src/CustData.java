import java.util.ArrayList;

public class CustData {
    int i,n=4;

    ArrayList<StudData>list=new ArrayList<>();
    class StudData{
        int roll;
        String name;
        int marks;
        long phone;

        StudData(int roll, String name,int marks, long phone){
            this.roll=roll;
            this.name=name;
            this.marks=marks;
            this.phone=phone;
        }
    }

    public void addValues(int[] roll, String[] name, int[] marks, long[] phone) {
        for (int i = 0; i < n; i++) {
            list.add(new StudData(roll[i], name[i], marks[i], phone[i]));
        }
        printValues();
    }

    // Method to print all student data
    public void printValues() {
        for (StudData data : list) {
            System.out.println(data.roll + " " + data.name + " " + data.marks + " " + data.phone);
        }
    }
}

