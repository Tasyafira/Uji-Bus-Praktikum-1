package ujibus;
import java.util.Scanner;
public class Bus {
    Scanner input = new Scanner(System.in);
    public double penumpang;
    public double maxPenumpang ;
    public double counter;
    public double penumpangBaru;

    //konstruktor kelas Bus
    public Bus(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method Mutator 
    public void addpenumpang(double penumpang){
        double temp ;
        temp = this.penumpang + penumpang ;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        }else {
            this.penumpang = temp;
            counter++;
        }
        
    }
    //method untuk mengatur password
      public void getPenumpang(double password){
          System.out.print("Masukkan Password : ");
         password = input.nextDouble();
          if(password == 24){
            System.out.println("Password Benar");
        }
        else{
            System.out.println("Password Salah");
          }
     }
      //method untuk menampilkan rata-rata penumpang
     public void getAverage(double penumpangBaru){
        double rata = penumpangBaru/penumpang;
        System.out.println("Berat Penumpang                                : "+penumpangBaru+ " Kg");
        System.out.println("Berat Rata-Rata Penumpang Didalam Bis Sekarang : "+rata+ " Kg");
    }
     //method untuk menamilkan data penumpang
    public void cetakPenumpang(){
        System.out.println("Penumpang Bus sekarang                         = "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah      = "+maxPenumpang);
        
    }
}
