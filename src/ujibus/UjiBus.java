package ujibus;
public class UjiBus {
    public static void main(String[] args) {
        
        //membuat objek busBesar dari kelas Bus
        Bus Bus = new Bus(100) ;
        
        //User memasukkan password
        Bus.cetakPenumpang ();
        System.out.println("----------------------------------------------------------------------------------");
        
        //penambahan penumpang
        System.out.println("Penambahan penumpang                                     : ");
        Bus.getPenumpang (24);
        Bus.addpenumpang(28) ; //tambah 24 penumpang
        Bus.cetakPenumpang();
        Bus.getAverage(1540);
        System.out.println("----------------------------------------------------------------------------------");
        
        
        //penambahan penumpang
        Bus.getPenumpang (24);
        Bus.addpenumpang(32) ; //tambah 32 penumpang
        Bus.cetakPenumpang();
        Bus.getAverage(3460);
        System.out.println("----------------------------------------------------------------------------------");
        
        //penambahan penumpang
        Bus.getPenumpang (24);
        Bus.addpenumpang(21) ; //tambah 21 penumpang
        Bus.cetakPenumpang();
        Bus.getAverage(4405);
        System.out.println("----------------------------------------------------------------------------------");
        
        //penambahan penumpang
        Bus.getPenumpang (24);
        Bus.addpenumpang(21) ; //tambah 21 penumpang
        Bus.cetakPenumpang();
         Bus.getAverage(4975);
        System.out.println("----------------------------------------------------------------------------------");
        
        //penambahan penumpang
        Bus.getPenumpang (24);
        Bus.addpenumpang(19) ; //tambah 19 penumpang
        Bus.cetakPenumpang();
        Bus.getAverage(6235); 
        
    }
    
}
