public class Main {
    public static void main(String[] args) {
        int[] roll = {1, 2, 3, 4};
        String[] name = {"Ram", "Hari", "Shyam", "Anish"};
        int[] marks = {80, 70, 75, 90};
        long[] phone = {98765432L, 12345678L, 23456789L, 98762345L};

        CustData cn = new CustData();
        cn.addValues(roll, name, marks, phone);
    }
}
