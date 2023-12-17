import java.io.*;
class contohFileInputStream {
    public static void main(String[] args) {
    String x;
    int nTugas = 0,
    jumlah = 0,
    n = 0;

    try{
        FileInputStream fs= new FileInputStream("./tugasP3.txt");
        DataInputStream dataInput = new DataInputStream(fs);
            while (dataInput.available() !=0) {
                x=dataInput.readLine();
                nTugas=Integer.parseInt(x.substring(1,3));
                n=n+1;
                jumlah = jumlah + nTugas ;
                System.out.println("No " +n+" : "+nTugas);
            }
            dataInput.close();
        }
        catch (Exception e) {System.err.println("File input error");}

        double rata2 = (double) jumlah/n;
        System.out.println("Harga Buncis rata-rata "+rata2);
    }
}
