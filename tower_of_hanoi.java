package JAVA.HW2_Java;

public class tower_of_hanoi {
    public static void main(String args[]) {
        int disk_count = 8;     //Количество дисков в башне
        int main_rod = 1;       //На каком стержне изначально находится башня
        int end_rod = 2;        //На каой стержень необходимо перенести башню
        int auxiliary_rod = 3;  //Вспомогательный стержень для переноса
        System.out.printf ("Все диски %d шт находятся на стержене  %d, необходимао перенести на стержень %d", disk_count, main_rod, end_rod);
        hb(disk_count,main_rod,end_rod,auxiliary_rod);
        System.out.println();
    }

    public static void hb (int n,int x,int y,int z){
        if (n>0) {
            hb (n-1, x, z, y);
            System.out.printf ("\n Перекладываем диск %d со стержня %d на стержень  %d", n, x, y);
            hb (n-1, z, y, x);
        }
        
    }
}
